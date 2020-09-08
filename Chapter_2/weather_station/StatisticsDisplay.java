import java.util.Arrays;
public class StatisticsDisplay implements Observer, DisplayElement {
    private float[] temperatures;
    private float[] humidities;
    private float[] pressures;
    private Subject weatherData;


    public StatisticsDisplay(Subject weatherData){
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
	this.temperatures = new float[0];
	this.humidities = new float[0];
	this.pressures = new float[0];
    }

    public void update(float temperature, float humidity, float pressure) {
	this.temperatures = Arrays.copyOf(temperatures, temperatures.length + 1);
	temperatures[temperatures.length - 1] = temperature;
	this.humidities = Arrays.copyOf(humidities, humidities.length + 1);
	humidities[humidities.length - 1] = humidity;
	this.pressures = Arrays.copyOf(pressures, pressures.length + 1);
	pressures[pressures.length - 1] = pressure;
       
	display();
    }

    public float average(float[] list){
	float sum = 0;
	for (int i = 0; i < list.length; i++){
	    sum += list[i];
	}

	return sum / list.length;
    }

    public float min(float[] list){
	float minn = list[0];
	for (int i = 0; i < list.length; i++){
	    if (list[i] < minn){
		minn = list[i];
	    }
	}

	return minn;
    }

    public float max(float[] list){
	float maxx = 0;
	for (int i = 0; i < list.length; i++){
	    if (list[i] > maxx){
		maxx = list[i];
	    }
	}

	return maxx;
    }

    public void display() {
	float averageTemp = average(this.temperatures);
	float minTemp = min(this.temperatures);
	float maxTemp = max(this.temperatures);
	System.out.println("Average Temp: " + averageTemp);
	System.out.println("Max Temp: "  + maxTemp);
	System.out.println("Min Temp: " + minTemp);
	

	float averageHumidity = average(this.humidities);
	float minHumidity = min(this.humidities);
	float maxHumidity = max(this.humidities);
	System.out.println("Average Humidity: " + averageHumidity);
	System.out.println("Max Humidity: "  + maxHumidity);
	System.out.println("Min Humidity: " + minHumidity);

	float averagePressure = average(this.pressures);
	float minPressure = min(this.pressures);
	float maxPressure = max(this.pressures);
	System.out.println("Average Pressure: " + averagePressure);
	System.out.println("Max Pressure: "  + maxPressure);
	System.out.println("Min Pressure: " + minPressure);

    }
}

    
    
