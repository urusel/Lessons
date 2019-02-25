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
public class Developer {
 Command insert;
    Command update;
    Command select;
    Command delete;
    
  
    public Developer(Command insert, Command update,Command select, Command delete){
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
   
    }
    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}



