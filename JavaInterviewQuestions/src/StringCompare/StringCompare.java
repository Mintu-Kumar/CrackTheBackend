package StringCompare;

public class StringCompare {


    public static void main(String[] args) {

        String  s1 = new String("java interview");
        String  s2 = new String("java interviewqqqq");
        String  s3 = s1;

       // System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //true
       // System.out.println(s1 == s3);   // true



      /*  String s4 = "java interview";
        String s5 = "java interview";

        System.out.println(s4==s5); // true
        System.out.println(s4.equals(s5)); // true

        String s6 =  new String("java interview");
        System.out.println(s4 == s6);    // false
        System.out.println(s4.equals(s6));   // true*/


    }
}
