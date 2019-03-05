/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template1;

/**
 *
 * @author user
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewPage();
        WebsiteTemplate shopPage = new ShopPage();
        
        welcomePage.showPage();
        System.out.println("\n======\n");
        
        newsPage.showPage();
        System.out.println("\n======\n");
        
        shopPage.showPage();
        
    }
    
}
