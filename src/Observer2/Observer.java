/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

import java.util.List;

/**
 *
 * @author user
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
    
}
