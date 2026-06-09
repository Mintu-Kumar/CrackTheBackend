package IteratorSpliterator;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.StreamSupport;

public class IteratorSpliterator {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Iterator<Integer> iterator =  numbers.iterator();
        int totalSum = 0;
        while (iterator.hasNext()){
            totalSum+=iterator.next();
        }
        System.out.println("Sequential Sum :"+ totalSum);

        Spliterator<Integer> spliterator = numbers.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> sum1 = executorService.submit(()-> StreamSupport.stream(spliterator1,false)
                .mapToInt(Integer::intValue).sum());

        Future<Integer> sum2 = executorService.submit(()-> StreamSupport.stream(spliterator,false)
                .mapToInt(Integer::intValue).sum());

        int finalSum =  sum1.get()+sum2.get();

        System.out.println("Parallel sum : "+finalSum);


    }



}
