import java.util.Scanner;

public class Demo10 {

    //��������� ���������, ������� � ����������� �� ����������� ������ ��� ������ (1, 2, ..., 7) ������� �� �����
    // ��� �������� (�����������, �������, ..., �����������).
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer day = scanner.nextInt();

        switch (day){
            case (1) : //day == 2
                System.out.println("�����������");
                break;
            case (2) :
                System.out.println("�������");
                break;
            case (3) :
                System.out.println("�����");
                break;
            case (4) :
                System.out.println("�������");
                break;
            case (5) :
                System.out.println("�������");
                break;
            case (6) :
                System.out.println("�������");
                break;
            case (7) :
                System.out.println("�����������");
                break;
            default:
                System.out.println("������ ��� ������ �� ����������");
                break;
        }
    }
}
