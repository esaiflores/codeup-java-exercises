import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Say something to Bob");
            String saySomething = input.nextLine();

            if (saySomething.endsWith("?")) {
                System.out.println("sure..");
            } else if (saySomething.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (saySomething.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever..");
            }

            System.out.println("Do you wanna say anything else to Bob? Y/N");

        } while (input.nextLine().equalsIgnoreCase("y"));

        System.out.println("Bob says bye..he guesses");

    }

}

