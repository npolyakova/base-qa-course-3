import java.util.Scanner;

public class Demo7 {

    //Дано натуральное число. Определить:
    //является ли оно четным;
    //оканчивается ли оно цифрой 7
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 10){
            number %=10;
        }

        if ((number % 2) == 0){
            System.out.println("Число чётное");
        }
        else if (number == 7){
            System.out.println("Число оканчивается на 7");
        }
        else {
            System.out.println("Ни одно условие не выполняется");
        }
    }
}
