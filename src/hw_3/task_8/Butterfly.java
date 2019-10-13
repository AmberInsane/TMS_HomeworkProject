package hw_3.task_8;

import java.util.Scanner;

/*Нарисовать на консоли бабочку. Пример вывода в butterfly.png
  Как пользователь, я бы хотел иметь возможность задать размер бабочки (высоту и ширину)
*/

// бабочка супер, молодец
public class Butterfly {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int height, width;

        try {
            System.out.println("Put in height of butterfly, please");
            height = scanner.nextInt();
            System.out.println("Put in width of butterfly, please");
            width = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Ok, I'll show you butterfly anyway"); // top-1 :)
            height = 17;
            width = 17;
        }
        int k; // k - так себе название
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i >= height / 2) // {}
                    k = height - i - 1;
                else // {}
                    k = i;

                if ((j <= k) || (j >= width - k - 1)) {
                    if (j >= width / 2) // {}
                        k = width - j;
                    else // {}
                        k = j + 1;
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
