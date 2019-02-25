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
public class DatabaseRunner {
  public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
        new InsertCommand(database),
        new UpdateCommand(database),
        new SelectCommand(database),
        new DeleteCommand(database));
        
        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
      developer.deleteRecord();
    }
}


