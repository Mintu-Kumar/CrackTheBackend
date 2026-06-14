package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

         Singleton  obj1 =  Singleton.getInstance();
        /* Singleton obj2 =  Singleton.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());*/

       Constructor<Singleton> constructor =  Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj2 = constructor.newInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}

class Singleton{
    private static Singleton instanse;
    private Singleton(){
        throw  new RuntimeException("you can not instantiate the second object of singleton class");
    }

    public  static Singleton getInstance(){

        if(instanse == null){
            instanse =  new Singleton();
        }
        return  instanse;
    }
}
