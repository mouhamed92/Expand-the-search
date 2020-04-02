package search;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int np = sc.nextInt();
        String [] array = new String[np];

        for (int i=0 ; i<np ; i++){
            array[i] = sc1.nextLine();
        }

        int nq = sc.nextInt();

        for (int i=0 ; i<nq ; i++){
            String word = sc2.nextLine();
                List<String> list = search(array,word);
        }
    }

    private static List<String> search(String[] a,String w) {
        List<String> list = new ArrayList<>();

        for (int i = 0 ; i<a.length ; i++){
            String[] arrOfStr = a[i].split(" ", -2);

        }

        return null ;
    }
}

