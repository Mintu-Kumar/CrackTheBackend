Problem Statement - What id difference between Callable Runnable and Future interface.


1. Runnable
   > Using this interface we define a thread.
   > The Runnable interface does not allow returning a result.
   > Only defines the run() method, which is void.


2. Callable:
    > The Callable interface is similar to Runnable.
    > But it can return a result (or throw an exception) when the task is completed.
    > Callable Interface has a call() method
    > Callable tasks can be executed by a thread pool, and they return a Future object that
    can be used to retrieve the result of the computation


3. Future:
    > The Future interface represents the result of an asynchronous computation. 
    > It allows you to query the status of a task and retrieve its result once it's done.
    > A Future object is returned when submitting a Callable to an executor.
    > The Future.get() method blocks until the result is available.
   > 
> 
> ExecutorService executorService =  Executors.newFixedThreadPool(3)