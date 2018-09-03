package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();

            FileWriter fileReader = new FileWriter(filename); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWitter

            String my_string = reader.readLine();
            while (my_string.equals("exit")!=true){
                bufferedWriter.write(my_string);
                bufferedWriter.newLine();
                my_string = reader.readLine();

            }
            bufferedWriter.write(my_string);
            bufferedWriter.newLine();
            reader.close();
            bufferedWriter.close();
            fileReader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
