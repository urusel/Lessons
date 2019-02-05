
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather2;

import ObserverWeather.Observer;
import ObserverWeather.WeatherData;
import java.util.Observable;

/**
 *
 * @author user
 */
public class StatisticsDisplay implements Observer, DisplayElement{
 
 private  float  maxTemp = 0.0f;
  private  float  minTemp = 200;
           private  float  tempSun = 0.0f;
                    private  int numReadings;
                    
                    public StatisticsDisplay(Observable   observable)    {
       observable.addObservable(this);
}
@Override
public void update(Observable observable,Object arg){
 if(observable instanceof WeatherData){
  WeatherData weatherData = (WeatherData)jbservable;
  float temp = weatherData.getTemperature();
  tempSun += temp;
  numReadings++;
  
  if(temp >maxTemp ){
    maxTemp =  temp; 
  }
  if(temp < minTemp ){
    minTemp =  temp; 
  }
  display();
  
}
 }
 @Override
public void display(){
     System.out.println("Avg/Max/Min temoerature = " + (tempSun/numReadings) + "/" + maxTemp  + "/" + minTemp);
        }
}
