import java.util.Observable;
import java.util.Observer;
import java.util.Arrays;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float[] temperatures;
    private float[] humidities;
    private float[] pressures;


    public StatisticsDisplay(Observable observable){
	this.observable = observable;
        observable.addObserver(this);
	this.temperatures = new float[0];
	this.humidities = new float[0];
	this.pressures = new float[0];
    }

    public void update(Observable obs, Object arg) {
	if (obs instanceof WeatherData) {
	    WeatherData weatherData = (WeatherData) obs;
	    float temperature = weatherData.getTemperature();
	    float humidity = weatherData.getHumidity();
	    float pressure = weatherData.getPressure();
	    
	    this.temperatures = Arrays.copyOf(temperatures, temperatures.length + 1);
	    temperatures[temperatures.length - 1] = temperature;
	    this.humidities = Arrays.copyOf(humidities, humidities.length + 1);
	    humidities[humidities.length - 1] = humidity;
	    this.pressures = Arrays.copyOf(pressures, pressures.length + 1);
	    pressures[pressures.length - 1] = pressure;
       
	    display();
	}
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

    
    
