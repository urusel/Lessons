/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author user
 */
public class CafeMenu implements Menu{
    HashMap<String, MenuItem> menuItems = new  HashMap<String, MenuItem>();
    
    public CafeMenu(){
        addItem("Veggle Burger and Air Fries",
                "Veggle berger on a whole wteat bun, lettuce, tomato, and  fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, quacamole",
                true, 4.29);
        
    }
    void addItem(String name, String description,
            boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    public Map <String, MenuItem> getItems(){
        return menuItems;
    }
    public Iterator<MenuItem> createIterator(){
        return menuItems.values().iterator();
}
}

