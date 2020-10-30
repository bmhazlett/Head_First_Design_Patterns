import java.util.*;

public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;
    
    public PancakeHouseIterator(ArrayList items) {
	this.items = items;
    }

    public Object next() {
	MenuItem item = (MenuItem)items.get(position);
	position += 1;
	return item;
    }

    public boolean hasNext() {
	if (position + 1 > items.size()) {
	    return false;
	} else {
	    return true;
	}
    }
}
