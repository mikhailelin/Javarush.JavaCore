package com.javarush.task.task13.task1320;

/* 
Neo
taskKey="com.javarush.task.task13.task1320"

Neo

1. ����������� ��������� DBObject � ������ User.
2. ����������� ����� initializeIdAndName ���, ����� ��������� �������� � �������� �� ����� "User has name Neo, id = 1".
3. ����� toString � ����� main ������ ������.
4. �������, ��� ������ ���������� ����� initializeIdAndName � ������ User.


����������:
1.	��������� DBObject ������ ���� ���������� � ������ User.
2.	����� initializeIdAndName ������ ���������� ���������� ������ ���� User, ������ �� ������� ������������ ����� ������("����" ������).
3.	����� initializeIdAndName ������ ������������� �������� ����� id � name �������� ���������� ��� ����������.
4.	��������� ������ �������� �� �����: "User has name Neo, id = 1"
5.	����� toString �� ������.
6.	����� main �� ������.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject{
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }
}
