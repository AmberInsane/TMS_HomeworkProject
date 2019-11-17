package hw_12.task_2;

public class CurrencyMain {
    public static void main(String[] args) {
        CurrencyStringInterface printCurrencyString = x -> System.out.println(x.toString() + " рублей");
        printCurrencyString.print(10);
    }
}
