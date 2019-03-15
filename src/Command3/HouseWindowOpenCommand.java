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
public class HouseWindowOpenCommand implements Command{
 HouseWindow houseWindow;
 public HouseWindowOpenCommand(HouseWindow houseWindow){
 this.houseWindow = houseWindow;
    
}
public void execute(){
houseWindow.up();
}
}

