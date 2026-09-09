package StringCompare;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        return this.name.equals(other.name); // equality based on name
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // must be consistent with equals
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("java interview", 101);
        Student s2 = new Student("java interview", 102);
        Student s3 = new Student("Java", 103);

        System.out.println("s1 equals s2? " + s1.equals(s2)); // true (same name)
        System.out.println("s1 equals s3? " + s1.equals(s3)); // false (different name)
    }
}

