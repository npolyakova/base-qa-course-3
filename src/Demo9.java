import java.util.Scanner;

public class Demo9 {

    //�������� ��� �������-��������. ��������, ��� ��� �����, ��� ������ ����� ���� ������� � ����� �� ���� ������� ���������:
    //������ ��� � �� 60 ��;
    //������� ��� � �� 75 ��;
    //������� ��� � �� 91 ��;
    //������������ ��� � � 91 ��.
    //����������, � ����� ��������� ����� ��������� ������ ������.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer weight = scanner.nextInt();

        if (weight < 60){
            System.out.println("˸���� ���");
        }
        else if (weight < 75){
            System.out.println("������� ���");
        }
        else if (weight < 91){
            System.out.println("������ ���");
        }
        else {
            System.out.println("����������� ���");
        }
    }
}
