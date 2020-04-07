package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int numPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter all people:");
        String[] data = readPeople(scanner, numPeople);

        System.out.println("\nEnter the number of search queries:");
        int numOfQueries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfQueries; i++) {
            System.out.println("\nEnter data to search people:");
            String query = scanner.nextLine().toLowerCase().trim();

            System.out.println("\nFound people:");
            boolean found = false;

            for (String lineWithData : data) {
                if (lineWithData.toLowerCase().contains(query)) {
                    System.out.println(lineWithData);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Not found");
            }
        }
    }

    public static String[] readPeople(Scanner sc, int numOfPeople) {
        String[] allPeople = new String[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            allPeople[i] = sc.nextLine();
        }
        return allPeople;
    }
}
