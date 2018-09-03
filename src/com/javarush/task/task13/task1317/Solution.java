package com.javarush.task.task13.task1317;

/* 
The weather is fine
taskKey="com.javarush.task.task13.task1317"

The weather is fine

1. � ������ Today ����������� ��������� Weather.
2. �������, ��� ������ �������� type � ������� getWeatherType().
3. ���������� Weather � WeatherType ��� ����������� � ��������� ������.


����������:
1.	��������� Weather ������ ���� ���������� � ������ Today.
2.	� ������ Today ������ ���� ���������� ����� getWeatherType ����������� � ���������� Weather.
3.	��� ������������� �������� ������ getWeatherType ������ ���� String.
4.	����� getWeatherType ������ ���������� �������� ���������� type.



*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
