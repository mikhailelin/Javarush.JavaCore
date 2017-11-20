package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        int min=0;
        if(inputStream.available()>0) min = inputStream.read();
        while ( inputStream.available()>0){
            int x = inputStream.read();
            if(min>x) min=x;
        }

        inputStream.close();
        System.out.println(min);
    }
}
