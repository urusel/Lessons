/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator2;

import java.util.Iterator;

/**
 *
 * @author user
 */
public class DinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    
  

   
    public MenuItem next(){
        MenuItem menuItem = list[position];
        position = position + 1;
        return  menuItem;
    }
    public boolean hasNext(){
        if (position>=list.length || list[position]== null){
            return false;
        }else{
            return true;
        }
    }
    public void remove(){
        if (position<=0){
            throw new IllegalStateException
        ("You can't remove an item until you've done at least one next () ");
            
        }
       if (list[position-1] !=null){
           for (int i = position-1; i<(list.length-1);i++){
             list[i]=list[i+1];  
           }
           list[list.length-1]=null;
       } 
    }
}

