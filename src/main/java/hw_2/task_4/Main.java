package hw_2.task_4;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

// Main -> Task_4
public class Main {
    public static void main(String[] args) {
        int firstNum, secondNum, buffer, multResult;
        multResult = 0;
        try {
            firstNum = Integer.parseInt(args[0]);
            secondNum = Integer.parseInt(args[1]);

            System.out.print(firstNum + " * " + secondNum + " = ");

            if (firstNum < 0 && secondNum < 0) {
                  firstNum = Math.abs(firstNum);
                  secondNum = Math.abs(secondNum);
            }

           
            if ((Math.abs(firstNum) > Math.abs(secondNum)) || (firstNum < 0)) {
                //swap to get less number of iterations
                //or to get positive number of iterations
                buffer = firstNum;
                firstNum = secondNum;
                secondNum = buffer;
            }
            for (int i = 0; i < firstNum; i++) {
                multResult += secondNum;
            }

            // я думаю что 'не используя операцию умножения' относилось ко всей программе
            // multResult *= isPos;
            // done
            System.out.println(multResult);
        } catch (Exception e) {
            System.out.println("You should put in only integers");
        }
    }
}
