import java.util.Scanner;

public class Task5 {

    //���� ����������� �����. �����:
    //- ����� ������ � ���;
    //- ����� �������� � ���;
    //- ����� ��� ����;
    //- ������������ ��� ����.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        System.out.println("����� ������: " + number%10);
        System.out.println("����� ��������: " + (number%100)/10);
        System.out.println("����� ����: " + (number%10 + (number%100)/10 + number/100));
        System.out.println("������������ ����: " + (number%10 * ((number%100)/10) * (number/100)));
    }
}
