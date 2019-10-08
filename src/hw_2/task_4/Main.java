package hw_2.task_4;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Main {
    public static void main(String[] args) {
        int fistNum, secondNum, buffer, multResult;
        multResult = 0;
        fistNum = 7;
        secondNum = 9;
        if (fistNum > secondNum){
            //меняем местами, чтобы итераций было меньше
            buffer = fistNum;
            fistNum = secondNum;
            secondNum = buffer;
        }
        for (int i = 0; i < fistNum; i++) {
            multResult += secondNum;
        }
        System.out.println(fistNum + " * " + secondNum + " = " + multResult);

    }

}
