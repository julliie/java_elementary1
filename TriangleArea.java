package dz_lesson11;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        double side1, side2, side3;
        System.out.print("Введите первую сторону треугольника: ");
        side1 = numb.nextDouble();
        if (side1 <= 0) {
            System.out.print("Введите правильное значение первой стороны треугольника: ");
            side1 = numb.nextDouble();
        }
        System.out.print("Введите вторую сторону треугольника: ");
        side2 = numb.nextDouble();
        if (side2 <= 0) {
            System.out.print("Введите правильное значение второй стороны треугольника: ");
            side2 = numb.nextDouble();
        }
        System.out.print("Введите третью сторону треугольника: ");
        side3 = numb.nextDouble();
        if (side3 <= 0) {
            System.out.print("Введите правильное значение третьей стороны треугольника: ");
            side3 = numb.nextDouble();
        }
        if (side3 < side1 + side2 && side2 < side1 + side3 && side1 < side2 + side3) {
            double halfperim = (side1 + side2 + side3)/2;
            double triangle_area = Math.sqrt(halfperim * (halfperim-side1) * (halfperim-side2) * (halfperim-side3));
            System.out.println("Площадь треугольника: " + triangle_area);
        }
        else {
            System.out.println("Такой теугольник не существует");
        }


    }
}
