/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperaature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer  o) {
      observers.add(o);

    }

    @Override
    public void removeObserver(Observer o){ 
      int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
            
        }
    }
    @Override
   public  void  notifyObservers(){
    for (int i = 0; i<observers.size(); i++){
        Observer observer  = (Observer)observers.get(i);
        observer.update(temperaature, humidity, pressure);
    }
}
   public void   measurementsChanged(){
       notifyObservers();
   }
   public void setMeasurements(float temperaature,float humidity, float pressure){
       this.temperaature = temperaature;
       this.humidity = humidity;
       this.pressure = pressure;
       measurementsChanged();
   }
}
