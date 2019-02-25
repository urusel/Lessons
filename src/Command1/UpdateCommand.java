/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1;

/**
 *
 * @author user
 */
public class UpdateCommand implements Command{
    Database detabase;
    public UpdateCommand(Database database){
        this.detabase = database;
    }
    @Override
    public void execute(){
        detabase.update();
    }
    
}

