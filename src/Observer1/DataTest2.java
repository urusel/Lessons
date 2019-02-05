/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class DataTest2 {

    JFrame frame;
public void go() {
        frame = new JFrame();
        JButton button = new JButton("Can I press this button???");
   
        button.addActionListener(event
        -> System.out.println("Don t do it, you might regret it !"));
        
         frame.getContentPane().add(BorderLayout.CENTER, button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
