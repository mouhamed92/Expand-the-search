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
            String contact ;
                for (int j = 0 ; j<array.length ; j++) {
                    contact = search(array[i], word);
                }
        }
    }

    private static String search(String a,String w) {

        String result = "unknown\n" +
                "No matching people found." ;
        String[] arrOfStr = a.split(" ");

            for (int i = 0 ; i<arrOfStr.length ; i++){
                if(arrOfStr[i].equalsIgnoreCase(w) || arrOfStr[i].contains("@")){
                  result = "Found people:\n"+a ;
                    break;
                }
            }

        return result ;
    }
}

