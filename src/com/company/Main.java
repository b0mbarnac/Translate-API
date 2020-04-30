package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        HashMap<Character, String> dict = new HashMap<>();
//        String s = "утки плывут на пляж";
//        dict.put('я',"ya");
//        dict.put('у',"u");
//        dict.put('т',"t");
//        dict.put('к',"k");
//        dict.put('п',"p");
//        dict.put('ы',"y");
//        dict.put('н',"n");
//        dict.put('а',"a");
//        dict.put('ж',"zh");
//        dict.put('и',"i");
//        dict.put('ф',"f");
//        dict.put('г',"g");
//        dict.put('л',"l");
//        dict.put('в',"v");
        //System.out.println(dict.get('я'));
//        for (int i = 0; i <s.length() ; i++) {
//            System.out.print(dict.getOrDefault(s.charAt(i),s.charAt(i) + ""));
//
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))){
//            char c1 = (char)21;
//            writer.write(c1);
//            writer.flush();
//
//        }catch (IOException e){
//
//        }
//        new FileHandler("File.txt").translate().writeToFile("Out.txt");
//        Date currentTime = new Date();
//        int hours = currentTime.getHours();
//        int minutes = currentTime.getMinutes();
//        int seconds = currentTime.getSeconds();
//
//        System.out.println(hours + ":" + minutes + ":" + seconds
//        );

        HashMap<Character, String> dict = new HashMap<>();
        dict.put('a', "а");
        dict.put('b', "б");
        dict.put('c', "ц");
        dict.put('d', "д");
        dict.put('e', "е");
        dict.put('f', "ф");
        dict.put('g', "ж");
        dict.put('h', "ш");
        dict.put('i', "ш");
        dict.put('j', "дж");
        dict.put('k', "к");
        dict.put('l', "л");
        dict.put('m', "м");
        dict.put('n', "н");
        dict.put('o', "о");
        dict.put('p', "п");
        dict.put('q', "ку");
        dict.put('r', "р");
        dict.put('s', "с");
        dict.put('t', "т");
        dict.put('u', "у");
        dict.put('v', "в");
        dict.put('w', "в");
        dict.put('x', "икс");
        dict.put('y', "й");
        dict.put('z', "з");
//        dictEng = dict;



        try {
            Files.lines(Paths.get("File.txt"))
                    .map(FileHandler::translateToEng)
                    .map(FileHandler::translateToRus)
                    .map(FileHandler::upperCase)
//                    .map(FileHandler::lowerCase)
//                    .forEach(System.out::println);
                    .forEach(FileHandler::writeToFile);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
