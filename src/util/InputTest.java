package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        System.out.println("Are you true or false? ");
//        System.out.println(userInput.yesNo());
//        System.out.println(userInput.getInt());
        System.out.println(userInput.getInt(2, 8));

        System.out.println("text from InputTest");
    }
}
