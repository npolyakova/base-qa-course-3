public class Demo2 {

    //Дано двузначное число 39. Найти:
    //число десятков в нем;
    //число единиц в нем;
    //сумму его цифр;
    //произведение его цифр.
    public static void main(String args[]){
        Integer number = 39;
        Integer decimal = 39/10;
        System.out.println("Десятки " + decimal);
        Integer units = 39%10;
        System.out.println("Единицы " + units);
        Integer sum = decimal + units;
        System.out.println("Сумма цифр " + sum);
        Integer product = decimal * units;
        System.out.println("Произведение цифр " + product);
    }
}
