/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy0;

/**
 *
 * @author user
 */
public class ProjectRunner {
    public static void main(String[] args) {
        
        Project project = new RealProject("https://www.github/me/myProject.git");
        project.run();
    }
}

