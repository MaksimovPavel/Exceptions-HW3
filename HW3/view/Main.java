package ExeptionsHW.HW3.view;


import java.util.Scanner;

import ExeptionsHW.HW3.controller.DataController;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        DataController dataController = new DataController();

        System.out.println("Введите пожалуйста личные данные через пробел: ");
        System.out.println("ФИО, дата рождения(dd.mm.yyyy), номер телефона(10 цифр), пол(f или m)");

        String data = sn.nextLine();

        if(dataController.checkData(data) == 7) {
            dataController.writeDataInFile(data);
        }
    }
}