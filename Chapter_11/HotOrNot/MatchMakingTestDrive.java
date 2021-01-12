import java.lang.reflect.*;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
	MatchMakingTestDrive test = new MatchMakingTestDrive();
	test.drive();
    }

    public MatchMakingTestDrive() {
	initializeDatabase();
    }

    public static void initializeDatabase() {
	System.out.println("DB init");
    }

    public static PersonBean getPersonFromDatabase(String name) {
	PersonBeanImpl person = new PersonBeanImpl();
	person.setName(name);
	return person;
    }
    
    public void drive() {
	PersonBean joe = getPersonFromDatabase("Joe Javabean");
	PersonBean ownerProxy = getOwnerProxy(joe);
	System.out.println("Name is " + ownerProxy.getName());
	ownerProxy.setInterests("bowling, Go");
	System.out.println("Interests set from owner proxy");
	try {
	    ownerProxy.setHotOrNotRating(10);
	} catch (Exception e) {
	    System.out.println("Can't set rating from owner proxy");
	}
	System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

	PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
	System.out.println("Name is " + nonOwnerProxy.getName());
	try {
	    nonOwnerProxy.setInterests("bowling, Go");
	} catch (Exception e) {
	    System.out.println("Can't set interests from non owner proxy");
	}
	nonOwnerProxy.setHotOrNotRating(3);
	System.out.println("Rating set from non owner proxy");
	System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public PersonBean getOwnerProxy(PersonBean person) {
	return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
						   person.getClass().getInterfaces(),
						   new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
	return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
						   person.getClass().getInterfaces(),
						   new NonOwnerInvocationHandler(person));
    }
}
