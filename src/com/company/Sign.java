package com.company;

public class Sign {
    public static int Prevrashenie() throws Exception {
        int result;
        switch (Calculator.vvod[1]) {
            case "+":
                result = Calculator.pervayaPeremennaya + Calculator.vtorayaPeremennaya;
                break;
            case "-":
                result = Calculator.pervayaPeremennaya - Calculator.vtorayaPeremennaya;
                break;
            case "%":
                result = Calculator.pervayaPeremennaya / Calculator.vtorayaPeremennaya;
                break;
            case "/":
                result = Calculator.pervayaPeremennaya / Calculator.vtorayaPeremennaya;
                break;
            case "*":
                result =Calculator.pervayaPeremennaya * Calculator.vtorayaPeremennaya;
                break;
            default:
                throw new Exception("Введен неверный знак, используйте + - * %");
        }
        return result;
    }
}