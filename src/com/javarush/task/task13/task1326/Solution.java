package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        String s = "";
        while (inputStream.available()>0){
            int y = inputStream.read();
            char c = (char)y;
            if(y == 10 || y ==13) {
                if(s.equals("") == false){
//                    System.out.println("ssssss  " + s);
                    Integer x = Integer.parseInt(s);
                    if (x%2 == 0) {
                        intArr.add(x);
                    }
                    s = "";
                }
            }else {
                s = s +c;
                //               System.out.println(s);
            }
        }
        if(s.equals("") == false){
//                    System.out.println("ssssss  " + s);
            Integer x = Integer.parseInt(s);
            if (x%2 == 0) {
                intArr.add(x);
            }
            s = "";
        }
        inputStream.close();

        Collections.sort(intArr);
        for (Integer x:intArr) {
            System.out.println(x);
        }

    }
}
