package dz_lesson11;

import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        double n1, n2, n3;
        System.out.print("Введите первое число: ");
        n1 = numb.nextDouble();
        System.out.print("Введите второе число: ");
        n2 = numb.nextDouble();
        System.out.print("Введите третье число: ");
        n3 = numb.nextDouble();
        if (n1 > n2 && n1 > n3){
            System.out.println("Максимальное число: " + n1);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println("Максимальное число: " + n2);
        }
        else {
            System.out.println("Максимальное число: " + n3);
        }

    }
}
