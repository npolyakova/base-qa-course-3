import java.util.Scanner;

public class Demo6 {

    public static void main(String args[]){
        //�������� ������� ����� � ��������. ����������:
        //��������� �� ���� � ��������?
        //��������� �� ������� � �����?
        //����������, ���� ������� ����� ������ ��� ����� ������� ��������

        Scanner scanner = new Scanner(System.in);
        Integer circleS = scanner.nextInt();
        Integer squareS = scanner.nextInt();

        Double squareSide = Math.sqrt(squareS);
        Double circleD = Math.sqrt(circleS / Math.PI);

        if (squareSide >= circleD){
            System.out.println("���� ���������� � ��������");
        }
        else {
            System.out.println("���� �� ���������� � ��������");
        }

        if (circleD >= squareSide){
            System.out.println("������� ���������� � �����");
        }
        else {
            System.out.println("������� �� ���������� � �����");
        }
    }
}
