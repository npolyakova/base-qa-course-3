public class Demo2 {

    //���� ���������� ����� 39. �����:
    //����� �������� � ���;
    //����� ������ � ���;
    //����� ��� ����;
    //������������ ��� ����.
    public static void main(String args[]){
        Integer number = 39;
        Integer decimal = 39/10;
        System.out.println("������� " + decimal);
        Integer units = 39%10;
        System.out.println("������� " + units);
        Integer sum = decimal + units;
        System.out.println("����� ���� " + sum);
        Integer product = decimal * units;
        System.out.println("������������ ���� " + product);
    }
}
