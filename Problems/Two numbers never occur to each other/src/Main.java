import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0 ; i<arraySize ; i++ ){
              array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean verif = verifOccur(array,n,m);

        System.out.println(verif);
    }

    private static boolean verifOccur(int[] array, int n, int m) {

        boolean verif = true ;
        for (int i = 0 ; i<array.length-1 ; i++){
            if(((array[i]+array[i+1])==(n+m)) && (array[i]==m || array[i]==n)){

                verif = false ;
            }
        }
        return verif ;
    }
}