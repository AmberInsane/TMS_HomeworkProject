package hw_3.task_2;
//Есть массив чисел. Найти среднее арифметическое число элементов массива
public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,3,2,4,5,45,24435,436,546,45,654,6,5464,23,2,-1,2342,-234};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
               sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Average is " + average);
    }

}
