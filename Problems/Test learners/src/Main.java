import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        switch (r){
            case 1 :
                System.out.println("Yes!");
                break;
            case 2 :
                System.out.println("No!");
                break;
            case 3 :
                System.out.println("No!");
                break;
            case 4 :
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}