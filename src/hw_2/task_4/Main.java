package hw_2.task_4;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Main {
    public static void main(String[] args) {
        int fistNum, secondNum, buffer, multResult;
        int isPos = 1;
        multResult = 0;
        try {
            fistNum = Integer.parseInt(args[0]);
            secondNum = Integer.parseInt(args[1]);

            System.out.print(fistNum + " * " + secondNum + " = ");

            if ((fistNum > 0 && secondNum < 0) || (fistNum < 0 && secondNum > 0)) {
                isPos = -1;
                fistNum = Math.abs(fistNum);
                secondNum = Math.abs(secondNum);
            }

            if (fistNum > secondNum) {
                //swap to get less number of iterations
                buffer = fistNum;
                fistNum = secondNum;
                secondNum = buffer;
            }
            for (int i = 0; i < fistNum; i++) {
                multResult += secondNum;
            }

            multResult *= isPos;
            System.out.println(multResult);
        } catch (Exception e) {
            System.out.println("You should put in only integers");
        }
    }
}
