import java.util.Scanner;

public class Demo9 {

    //»звестен вес боксера-любител€. »звестно, что вес таков, что боксер может быть отнесен к одной из трех весовых категорий:
    //легкий вес Ч до 60 кг;
    //средний вес Ч до 75 кг;
    //т€желый вес Ч до 91 кг;
    //суперт€желый вес Ц с 91 кг.
    //ќпределить, в какой категории будет выступать данный боксер.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer weight = scanner.nextInt();

        if (weight < 60){
            System.out.println("ЋЄгкий вес");
        }
        else if (weight < 75){
            System.out.println("—редний вес");
        }
        else if (weight < 91){
            System.out.println("“€жЄлый вес");
        }
        else {
            System.out.println("—уперт€жЄлый вес");
        }
    }
}
