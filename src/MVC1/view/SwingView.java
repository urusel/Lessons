/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.view;

import MVC1.controller.Controller;
import MVC1.model.Model;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class SwingView implements ActionListener, View{
   private JFrame frame;
   private JList<String> list;
   private JButto add;
   private JButton remove;
   private JTextField field;
   private Controller controller;
   
   public SwingView(){
       initComponents();
   }
   @Override
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==add) {
          controller.addAction(field.getText());
          
      }else if (e.getSource()==remove){
          controller.removeAction(list.getSelectedValie());
          list.clearSelection();
      }
   }
   @Override
   public void dispose(){
       frame.dispose();
   }
   
  @Override
   public void setController(Controller controller){
       this.controller=controller;
   }
   @Override
   public void setModel(Model model){
       list.setModel(new ModelWrapper(model));
   }
   @Override
   public void show(){
       SwingUtilities.invokeLater(()->frame.setVisible(true)) ;
       
   }
   private void initComponents(){
       frame= new JFrame("List");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       JPanel mainPanel= new JPanel();
       mainPanel.setLayout(new FlowLayout());
       frame.setSize(new Dimension(500,150));
       frame.setContentPane(mainPanel);
       
   }
}
