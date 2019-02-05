/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

/**
 *
 * @author user
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
     private  float  temperaature;
    private  float humidity;
    private  float pressure;
    private WeatherData weatherData;
    
public CurrentConditionsDisplay (WeatherData weatherData){
 this.weatherData = weatherData;   
 weatherData.registerObserver(this);
}
@Override
public void display(){
    System.out.println("current conditions:" + temperaature + "C degree and" + humidity + "% humidity" + "pressure " + pressure);
}

@Override
public void update(float temperaature,  float humidity,float pressure){
    
 
  this.temperaature = temperaature;
  this.humidity = humidity;
  this.pressure = pressure;
  display();
 }   
}

