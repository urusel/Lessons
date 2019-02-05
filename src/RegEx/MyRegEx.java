/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class MyRegEx {
    private static Matcher matcher;
    
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})";
    private static final String EMALL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
   private static final String IP_PATtern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

           
    public static Pattern patternPass =  Pattern.compile(PASSWORD_PATTERN);
   public static Pattern patternEmail =  Pattern.compile(EMALL_PATTERN);
    public static Pattern patternIP =  Pattern.compile(IP_PATtern);
    
    public static boolean  checkPass (String str){
        matcher =  patternPass.matcher(str);
        return matcher.matches();
        
    }
   public static boolean  checkEmail(String str){
        matcher =  patternEmail.matcher(str);
        return matcher.matches();
        
    }
   
    public static boolean  checkIP(String str){
        matcher =  patternIP.matcher(str);
        return matcher.matches();
        
    }
   
}
    
