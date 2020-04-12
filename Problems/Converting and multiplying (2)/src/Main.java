import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str = "";

        while (!str.equals("0")){
            str = scanner.nextLine();
            if(str.equals("0"))
                break;
            list.add(str);
        }
        for (String l: list) {
            try {
               int n = Integer.parseInt(l) ;
                System.out.println(n*10);
            }catch (Exception e){
                System.out.println("Invalid user input: "+l);
            }

        }
    }
}