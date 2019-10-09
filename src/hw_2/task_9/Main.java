package hw_2.task_9;

public class Main {
    public static void main(String[] args) {
        int count = 4;

        //the first triangle
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j >= count - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        //the second triangle
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        //the third triangle
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j <= count - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //the fourth triangle
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
