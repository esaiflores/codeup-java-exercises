
import java.util.Random;
public class ServerNameGenerator {

    public static String[] nouns = {"Dani", "flower", "candy", "puppy", "kitten", "saw", "roller coaster", "Bev", "computer", "Mark"};
    public static String[] adjectives = {"sleepy", "funny", "hungry", "happy", "sad", "hairy", "ugly", "big", "small", "dark"};

    public static String randomWords() {
        Random random = new Random();
        int ranNoun = random.nextInt(nouns.length);
        int ranAdj = random.nextInt(adjectives.length);
        return adjectives[ranAdj] + " " + nouns[ranNoun];
    }

    public static void main(String[] args) {
        System.out.println(randomWords());
    }
}
