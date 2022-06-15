import java.util.Scanner;

public class Demo8 {

    //Составить программу, которая уменьшает первое введенное число в два раза, если оно больше
    // второго введенного числа по абсолютной величине.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer firstNumber = scanner.nextInt();
        Integer secondNumber = scanner.nextInt();

        if (Math.abs(firstNumber) > Math.abs(secondNumber)){
            firstNumber /= 2;
        }

        System.out.println(firstNumber);
    }
}
