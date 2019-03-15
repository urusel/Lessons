/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command3;

/**
 *
 * @author user
 */
public class RemoteControlTest {
public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        HouseWindow houseWindow = new HouseWindow();
        LightOnCommand lightOn = new LightOnCommand(light);
        HouseWindowOpenCommand houseWindowOpen = new HouseWindowOpenCommand(houseWindow);
        
    
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    remote.setCommand(houseWindowOpen);
    remote.buttonWasPressed();

 
  
    
 }
}
