import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        // put your code here

        Scanner sc = new Scanner(System.in);
        double a, b ,c , r ;
        double res = 0 ;

        String forme = sc.nextLine();

        switch (forme){
            case "rectangle":
                 a = sc.nextDouble();
                 b = sc.nextDouble();
                res = a*b ;
                break;
            case "triangle":
                 a = sc.nextDouble();
                 b = sc.nextDouble();
                 c = sc.nextDouble();
                 res = (a*b)/2;
                 break;
            case "circle":
                r = sc.nextDouble();
                res =  Math.PI*Math.pow(r,2) ;
                break;
        }
        DecimalFormat df = new DecimalFormat("########.0");
        System.out.println(df.format(res));

    }
}