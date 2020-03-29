import java.util.Random;
//
//public class ServerNameGenerator {
//
//    public static void main(String[] args) {
//        String[] adjectives = {"swift", "slow", "narrow", "sparse", "fuzzy", "noisy", "vociferous", "rigid", "aggressive", "energetic"};
//        String[] nouns = {"table", "car", "gate", "star", "sky", "field", "strawberry", "eyes", "tree", "flower"};
//
//        System.out.println(output(adjectives) + " " + output(nouns));
//    }
//
//    public static String output(String[] arrayString) {
//        Random random = new Random();
//
//        int index = random.nextInt(arrayString.length);
//        return arrayString[index];
//    }
//
//}

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] firstArray = {"1", "2", "3", "4"};
        String[] secondArray = {"a", "b", "c"};

        System.out.println(results(firstArray) + " " + results(secondArray));

    }

    public static String results(String[] newArray) {
        Random rand = new Random();

        int item = rand.nextInt(newArray.length);
        return newArray[item];
    }
}