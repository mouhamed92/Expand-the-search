package search;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


      String fileName = "D:\\pfeworkspace\\todoapp\\Simple Search Engine\\Simple Search Engine\\task\\src\\search\\file.txt";
      File file = new File(fileName);

      Scanner sc = new Scanner(System.in);

      int choix ;
        do {
            Scanner scanner = new Scanner(file);
            System.out.println("=== Menu ===\n" +
                    "1. Find a person\n" +
                    "2. Print all people\n" +
                    "0. Exit");
            choix = Integer.parseInt(sc.nextLine());

            switch (choix){
                case 1 :
                    System.out.println("Enter a name or email to search all suitable people.\n");
                    String data = sc.nextLine().toLowerCase().trim();
                    try {
                        search(scanner,data);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                case 2 :

                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        System.out.println(line);
                    }
                    break;
                case 0 :
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Unkown entred !");
            }
        }while (choix!=0);
    }

    private static void search(Scanner scanner, String data) {
        System.out.println("\nFound people:");
        boolean find = false ;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.toLowerCase().contains(data)){
                System.out.println(line);
                find = true ;
            }
        }
        if(!find){
            System.out.println("Not found");
        }
        scanner.close();
    }
}

