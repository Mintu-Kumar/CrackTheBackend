package DeserializationSingleton;

import java.io.*;

public class DeserializationSingletonDemo  {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton obj1  = Singleton.getInstance();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.ser"));
        outputStream.writeObject(obj1);
        outputStream.close();


        ObjectInputStream objectInputStream =  new ObjectInputStream(new FileInputStream("file.ser"));
        Singleton obj2 =  (Singleton)objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }

}

class Singleton implements  Serializable{
    private static final long serialVersionUID = 1L;
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }
}
