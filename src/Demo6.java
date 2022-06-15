import java.util.Scanner;

public class Demo6 {

    public static void main(String args[]){
        //Известны площади круга и квадрата. Определить:
        //уместится ли круг в квадрате?
        //уместится ли квадрат в круге?
        //Поместится, если диаметр круга меньше или равен стороне квадрата

        Scanner scanner = new Scanner(System.in);
        Integer circleS = scanner.nextInt();
        Integer squareS = scanner.nextInt();

        Double squareSide = Math.sqrt(squareS);
        Double circleD = Math.sqrt(circleS / Math.PI);

        if (squareSide >= circleD){
            System.out.println("Круг поместится в квадрате");
        }
        else {
            System.out.println("Круг не поместится в квадрате");
        }

        if (circleD >= squareSide){
            System.out.println("Квадрат поместится в круге");
        }
        else {
            System.out.println("Квадрат не поместится в круге");
        }
    }
}
