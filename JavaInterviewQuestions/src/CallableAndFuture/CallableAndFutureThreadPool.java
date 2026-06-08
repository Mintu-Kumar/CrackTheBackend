package CallableAndFuture;

import java.util.concurrent.*;

public class CallableAndFutureThreadPool {

    static class CallableTask implements Callable<String>{

        private final int taskId;

        public CallableTask(int taskId){
            this.taskId = taskId;
        }
        @Override
        public String call() throws Exception {
            System.out.println("Task" + taskId + " is running");

            Thread.sleep(2000);
            return  "Task" +  taskId + " is completed";
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfThread = 3;

       ExecutorService threadpool =  Executors.newFixedThreadPool(numberOfThread);

        Future<String> future1 = threadpool.submit(new CallableTask(1));
        Future<String> future2 = threadpool.submit(new CallableTask(2));
        Future<String> future3 = threadpool.submit(new CallableTask(3));
        Future<String> future4 = threadpool.submit(new CallableTask(4));
        Future<String> future5  = threadpool.submit(new CallableTask(5));

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());

        threadpool.shutdown();

    }



}
