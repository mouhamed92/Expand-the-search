import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String op = "";

        double operand1 = sc.nextDouble();
               op = sc1.nextLine();
        double operand2 = sc.nextDouble();

        switch (op){
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "*"  :
                System.out.println(operand1*operand2);
                break;
            case "-"  :
                System.out.println(operand1-operand2);
                break;
            case "/"  :
                if (operand2==0)
                    System.out.println("Division by 0!");
                else
                System.out.println(operand1/operand2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}