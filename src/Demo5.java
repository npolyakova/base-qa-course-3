import java.util.Scanner;

public class Demo5 {

    //Дано трехзначное число. Найти:
    //число единиц в нем;
    //число десятков в нем;
    //сумму его цифр;
    //произведение его цифр.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        Integer units = (number % 100) % 10;
        Integer decimals = (number / 10) % 10;
        Integer sum = units + decimals + number / 100;
        Integer product = units * decimals * number / 100;

        System.out.println("Единицы " + units);
        System.out.println("Десятки " + decimals);
        System.out.println("Сумма " + sum);
        System.out.println("Произведение " + product);
    }
}
