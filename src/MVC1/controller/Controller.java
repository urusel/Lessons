/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.controller;

import javax.swing.text.View;

/**
 *
 * @author user
 */
public interface Controller {
    void addAction(String text);
    void removeAction(String text);
    void setModel(Model model);
    void setView (View view);
    void start();
}
