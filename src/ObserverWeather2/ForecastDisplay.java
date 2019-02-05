/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather2;

import ObserverWeather.Observer;
import java.util.Observable;

/**
 *
 * @author user
 */
public class ForecastDisplay implements Observer, DisplayElement{
  private float currentPressure = 29.92f;
  private float lastPressure;
  
  public ForecastDisplay(Observable observable){
    observable.addObserver(this)  ;
  }
  
 @Override 
public void update(Observable observable, Object arg){
 if(observable instanceof WeatherData)  {
   WeatherData weatherData = (WeatherData)observable;
   lastPressure = currentPressure;
   currentPressure = weatherData.getpPessure();
   display();
 } 
}
@Override
public void display(){
    System.out.println("Forecast: ");
    if(currentPressure > lastPressure){
        System.out.println("Improving weather on the way");
    } else if(currentPressure == lastPressure){
        System.out.println("More of the same");
    } else if(currentPressure < lastPressure){
        System.out.println("Watch out for cooler,rainy weather");
    }
}
}
