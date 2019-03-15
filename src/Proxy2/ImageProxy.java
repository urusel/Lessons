/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy2;

import java.awt.*;
import java.net.*;
import javax.swing.*;




/**
 *
 * @author user
 */
public class ImageProxy implements Icon{
 volatile ImageIcon imageIcon;
 final URL imageURL;
 Thread retrievalThread;
 boolean retrieving=false;
 public ImageProxy(URL url){imageURL=url;}
 @Override
public int getIconWidth(){
    if(imageIcon!=null){
        return imageIcon.getIconWidth();
        
    }else{
        return 800;
    }
}

 @Override
public int getIconHeight(){
    if(imageIcon!=null){
        return imageIcon.getIconHeight();
        
    }else{
        return 600;
   
}
}
synchronized void setImageIcon(ImageIcon imageIcon){
    this.imageIcon=imageIcon;
}
@Override
public void paintIcon(final Component c, Graphics g, int x, int y){
 if(imageIcon!=null){
     imageIcon.paintIcon(c, g, y, y);
 }  else{
     g.drawString("Loading SD cover, please wait...", x+300, y+190);
     
 } if(!retrieving){
     retrieving=true;
     
     retrievalThread=new Thread(()->{
     try{
         setImageIcon(new ImageIcon(imageURL, "CD Cover"));
         c.repaint();
     }catch (Exception e){
             e.printStackTrace();
             }
 });
     retrievalThread.start();
 }
 }
}
