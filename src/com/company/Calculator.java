package com.company;

import java.util.Scanner;

public class Calculator {
    static String[] vvod;
    static int pervayaPeremennaya;
    static int vtorayaPeremennaya;
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        try {
            vvod = keyboard.nextLine().split(" ", 3);
            ArabicNumbersOrNot.isInteger(vvod[0], vvod[2]);
        }
        catch (Exception e){
            System.out.println("Ввод осуществлен некоректно");
        }
            boolean isArabicNumbers = ArabicNumbersOrNot.isInteger(vvod[0], vvod[2]);
            boolean isRomanNumbers = RomanNumbersOrNot.isRoman(vvod[0], vvod[2]);
        if(isArabicNumbers) {
            pervayaPeremennaya = Integer.parseInt(vvod[0]);
            vtorayaPeremennaya = Integer.parseInt(vvod[2]);

            if (pervayaPeremennaya > 10 || vtorayaPeremennaya > 10 || pervayaPeremennaya < 1 || vtorayaPeremennaya < 1) {
                throw new Exception("Числа принимаемые на вход не более 10, и не менее 1");
            }
            System.out.println(Sign.Prevrashenie());
        }
        else if (isRomanNumbers) {
            RomanNumbers.RomanianTehnologi(vvod[0], vvod[2]);
        }
            else {
            System.out.println("Неправильно введены данные");
    }
    }
}
