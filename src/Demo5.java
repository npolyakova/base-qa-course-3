import java.util.Scanner;

public class Demo5 {

    //���� ����������� �����. �����:
    //����� ������ � ���;
    //����� �������� � ���;
    //����� ��� ����;
    //������������ ��� ����.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        Integer units = (number % 100) % 10;
        Integer decimals = (number / 10) % 10;
        Integer sum = units + decimals + number / 100;
        Integer product = units * decimals * number / 100;

        System.out.println("������� " + units);
        System.out.println("������� " + decimals);
        System.out.println("����� " + sum);
        System.out.println("������������ " + product);
    }
}
