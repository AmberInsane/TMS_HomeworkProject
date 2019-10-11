package hw_2.task_3;
/*
Вычислить: 1+2+4+8+...+256
 */

// Main -> Task_3
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.println("1+2+4+8+...+256=" + sum);
    }
}
