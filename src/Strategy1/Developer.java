/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy1;

/**
 *
 * @author user
 */
public class Developer {
    Activity activity;
    
    public void setActivity(Activity activity){
        this.activity = activity;
        
    }
    public void executeActivity(){
        activity.justDolt();
    }
}
