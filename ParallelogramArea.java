package dz_lesson11;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        double side1, side2, angle;
        System.out.print("Введите длину одной стороны параллелограмма: ");
        side1 = numb.nextDouble();
        System.out.print("Введите длину второй стороны параллелограмма: ");
        side2 = numb.nextDouble();
        System.out.print("Введите угол (в градусах): ");
        angle = numb.nextDouble();
        if (side1 <= 0 || side2 <= 0 || angle <= 0) {
            System.out.println("Неправильно введены данные");
        }
        else {
            double parallelogr_area = side1 * side2 * Math.sin(Math.toRadians(angle));
            System.out.println("Площадь параллелограмма: " + parallelogr_area);
        }


    }

}
