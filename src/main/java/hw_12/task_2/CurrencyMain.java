package hw_12.task_2;

import java.util.function.Function;

public class CurrencyMain {
    public static void main(String[] args) {
        Function<Integer, String> getCurrencyString = x -> x.toString() + " USD"; // думаю окончание может меняться, сократи
        System.out.println(getCurrencyString.apply(10));
    }
}
