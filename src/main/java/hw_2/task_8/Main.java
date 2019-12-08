package hw_2.task_8;
/*
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class Main {
    public static void main(String[] args) {
        int oddNum, evenNum, maxOddNum, maxEvenNum, sumOdd, sumEven;
        evenNum = 2; //the first not zero even num
        oddNum = 1; //the first oddSum num
        maxEvenNum = 100; //  если твоей программе, передать диапазон шире или последнее число будет нечетным, то придется переписывать код
        maxOddNum = maxEvenNum - 1; // если используешь переменную внизу, то лучше заводить ее там же, рядом

        sumOdd = 0;
        sumEven = 0;

        while (evenNum <= maxEvenNum){
            sumEven += evenNum;
            sumOdd += oddNum;

            evenNum +=2;
            oddNum +=2;
        }
        System.out.println("Sum of even numbers from 0 to 100 is " + sumEven);
        System.out.println("Sum of odd numbers from 0 to 100 is " + sumOdd);
        System.out.println("Sum of all numbers from 0 to 100 is " + (sumOdd + sumEven));

        //or if we don't need to use cycles, we can use the formula of sum of arithmetic progression
        evenNum = 2; //the first not zero even num
        oddNum = 1; //the first oddSum num

        int numberOfEven =  (maxEvenNum - evenNum)/2 + 1;
        int numberOfOdd =  (maxOddNum - oddNum)/2 + 1;

        sumEven = numberOfEven * (maxEvenNum + evenNum)/2;
        sumOdd = numberOfOdd * (maxOddNum + oddNum)/2;

        System.out.println("\nSum of arithmetic progression:");
        System.out.println("Sum of even numbers from 0 to 100 is " + sumEven);
        System.out.println("Sum of odd numbers from 0 to 100 is " + sumOdd);
        System.out.println("Sum of all numbers from 0 to 100 is " + (sumOdd + sumEven));
    }
}
