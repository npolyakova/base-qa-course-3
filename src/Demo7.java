import java.util.Scanner;

public class Demo7 {

    //���� ����������� �����. ����������:
    //�������� �� ��� ������;
    //������������ �� ��� ������ 7
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 10){
            number %=10;
        }

        if ((number % 2) == 0){
            System.out.println("����� ������");
        }
        else if (number == 7){
            System.out.println("����� ������������ �� 7");
        }
        else {
            System.out.println("�� ���� ������� �� �����������");
        }
    }
}
