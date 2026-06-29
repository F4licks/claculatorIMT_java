
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.print("введите свой рост в см: ");
        Scanner scan = new Scanner(System.in);
        double height_cm = scan.nextDouble();
        System.err.print("Введите свой вес в кг: ");
        double weight_kg = scan.nextDouble();
        double height_m = height_cm / 100;
        double bmi = weight_kg / (height_m * height_m);

        String cat;

        if (bmi < 18.5) {
            cat = "Недостаточный вес";
        } else if (bmi < 25) {
            cat = "Норма";
        } else if (bmi < 30) {
            cat = "Избыточный вес";
        } else {
            cat = "Ожирение";
        }

        System.out.println("Важ ИМТ " + bmi + " Ваша категория: " + cat);
    }
}