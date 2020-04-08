package dz_lesson11;

import java.util.Scanner;

public class SumOfTwoStrings {
    public static void main(String[] args) {
        Scanner numbstr = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String n1 = numbstr.nextLine();
        System.out.print("Введите второе число: ");
        String n2 = numbstr.nextLine();
        double n1Double = Double.parseDouble(n1);
        double n2Double = Double.parseDouble(n2);
        double sumDouble = n1Double + n2Double;
        String sum = Double.toString(sumDouble);
        System.out.print("Сумма: " + sum);
    }
}
