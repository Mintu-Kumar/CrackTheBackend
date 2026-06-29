package CloneableSingletonDemo;

public class CloneableSingletonDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 = (Singleton) obj1.clone();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}

class Singleton implements Cloneable{

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    protected  Object clone() throws CloneNotSupportedException {
        //return instance;
        //return    instance;
      throw new CloneNotSupportedException(" Object clone is not possible for this class");
    }
}
