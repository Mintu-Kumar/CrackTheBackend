import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVSComparator {


    public static void main(String[] args) {

      /*  List<movie> movies =  new ArrayList<>();
        movies.add(new movie("3 Idiot",2009));
        movies.add(new movie("ZNMD", 2012));
        movies.add(new movie("DDLJ",2000));

        Collections.sort(movies);
        movies.forEach(m-> System.out.println(m.name+ " "+m.year));*/

        List<customOrderExample> customOrderExamples =  new ArrayList<>();

        customOrderExamples.add(new customOrderExample("3 Idiot",9.8));
        customOrderExamples.add(new customOrderExample("ZNMD", 9.0));
        customOrderExamples.add(new customOrderExample("DDLJ",9.7));

        Collections.sort(customOrderExamples,new RatingOrder());
        customOrderExamples.forEach(m-> System.out.println(m.name+" "+m.rating));
    }

}


class movie implements Comparable<movie> {
    String name;
    int year;

    public movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(movie o) {
        return o.year-this.year;
    }
}

class  customOrderExample {
    String name;
    double rating;


    public customOrderExample(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}


class RatingOrder implements Comparator<customOrderExample>{

    @Override
    public int compare(customOrderExample o1, customOrderExample o2) {
        return Double.compare(o1.rating,o2.rating);
    }
}


