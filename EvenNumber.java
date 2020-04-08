package dz_lesson11;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = number.nextInt();
        if (n % 2 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
