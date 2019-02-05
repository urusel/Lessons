/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.PATTERN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Exemple2 {

    private Pattern pattent1;
    private Matcher matcher;

    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})";

    public Exemple2() {
        pattent1 = Pattern.compile(PASSWORD_PATTERN);
    }

    boolean chekPassword(String pass) {
        matcher =pattent1.matcher(pass);
        return matcher.matches();
       
    }
    public static void main(String[] args) {
        Exemple2 d = new Exemple2();
        System.out.println(d.chekPassword("12345678"));  
    }
}


