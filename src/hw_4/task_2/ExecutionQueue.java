package hw_4.task_2;
// 1. static 2. regular 3. constructor => constructor value
public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }
    {
        msg = "regular init block";
    }

    public ExecutionQueue(){
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(executionQueue.msg);
    }

}
