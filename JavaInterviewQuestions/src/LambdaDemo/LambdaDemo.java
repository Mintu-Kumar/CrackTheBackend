package LambdaDemo;

interface  Operation {
    int apply(int a,int b);
}
public class LambdaDemo {

    public static void main(String[] args) {
        Operation operation =   (a,b)->a-b;
        System.out.println(operation.apply(7,2));
    }
}

