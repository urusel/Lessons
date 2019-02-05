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
 * @author User
 */
public class Exemple1 {

    public static boolean chekText(String str) {
        Pattern pattern = Pattern.compile(".+\\.+(com|org|ru)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean chekText2(String str) {
        Pattern pattern = Pattern.compile("^Java$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
//        System.out.println(chekText("Java"));
//        System.out.println(chekText("www.yandex.ee"));
        
        String a = "Выхожу оудин я на дорогу";
        System.out.print(a.replaceAll("[ао]дин", "вдвоём   "));

    }
}

