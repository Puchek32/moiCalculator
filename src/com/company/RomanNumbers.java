package com.company;

import java.util.ArrayList;

public class RomanNumbers {
    static ArrayList<String> RomanNumerals = new ArrayList<>(101) {{
        add(0, "null");
        add(1, "I");
        add(2, "II");
        add(3, "III");
        add(4, "IV");
        add(5, "V");
        add(6, "VI");
        add(7, "VII");
        add(8, "VIII");
        add(9, "IX");
        add(10, "X");
        add(11, "XI");
        add(12, "XII");
        add(13, "XIII");
        add(14, "XIV");
        add(15, "XV");
        add(16, "XVI");
        add(17, "XVII");
        add(18, "XVIII");
        add(19, "XIX");
        add(20, "XX");
        add(21, "XXI");
        add(22, "XXII");
        add(23, "XXIII");
        add(24, "XXIV");
        add(25, "XXV");
        add(26, "XXVI");
        add(27, "XXVII");
        add(28, "XXVIII");
        add(29, "XXIX");
        add(30, "XXX");
        add(31, "XXXI");
        add(32, "XXXII");
        add(33, "XXXIII");
        add(34, "XXXIV");
        add(35, "XXXV");
        add(36, "XXXVI");
        add(37, "XXXVII");
        add(38, "XXXVIII");
        add(39, "XXXIX");
        add(40, "XL");
        add(41, "XLI");
        add(42, "XLII");
        add(43, "XLIII");
        add(44, "XLIV");
        add(45, "XLV");
        add(46, "XLVI");
        add(47, "XLVII");
        add(48, "XLVIII");
        add(49, "XLIX");
        add(50, "L");
        add(51, "LI");
        add(52, "LII");
        add(53, "LIII");
        add(54, "LIV");
        add(55, "LV");
        add(56, "LVI");
        add(57, "LVII");
        add(58, "LVIII");
        add(59, "LIX");
        add(60, "LX");
        add(61, "LXI");
        add(62, "LXII");
        add(63, "LXIII");
        add(64, "LXIV");
        add(65, "LXV");
        add(66, "LXVI");
        add(67, "LXVII");
        add(68, "LXVIII");
        add(69, "LXIX");
        add(70, "LXX");
        add(71, "LXXI");
        add(72, "LXXII");
        add(73, "LXXIII");
        add(74, "LXXIV");
        add(75, "LXXV");
        add(76, "LXXVI");
        add(77, "LXXVII");
        add(78, "LXXVIII");
        add(79, "LXXIX");
        add(80, "LXXX");
        add(81, "LXXXI");
        add(82, "LXXXII");
        add(83, "LXXXIII");
        add(84, "LXXXIV");
        add(85, "LXXXV");
        add(86, "LXXXVI");
        add(87, "LXXXVII");
        add(88, "LXXXVIII");
        add(89, "LXXXIX");
        add(90, "XC");
        add(91, "XCI");
        add(92, "XCII");
        add(93, "XCIII");
        add(94, "XCIV");
        add(95, "XCV");
        add(96, "XCVI");
        add(97, "XCVII");
        add(98, "XCVIII");
        add(99, "XCIX");
        add(100, "C");

    }};

    public static void RomanianTehnologi(String Chislo, String Chislo2) {
        try {
            for (int i = 1; i <= 10; i++) {
                if (Chislo.equalsIgnoreCase(RomanNumerals.get(i))) {
                    Calculator.pervayaPeremennaya = RomanNumerals.indexOf(Chislo);
                    for (int j = 1; j <= 10; j++)
                        if (Chislo2.equalsIgnoreCase(RomanNumerals.get(j)))
                            Calculator.vtorayaPeremennaya = RomanNumerals.indexOf(Chislo2);
                    System.out.println(RomanNumerals.get(Sign.Prevrashenie()));
                }
            }
        } catch (Exception e) {
            System.out.println("Римское число не может быть меньше 0");
        }
    }
}
