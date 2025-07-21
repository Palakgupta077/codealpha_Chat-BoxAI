import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String message;

        System.out.println("Hi, I'm ChatBot. You can talk to me. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            message = input.nextLine().toLowerCase();

            if (message.contains("hi") || message.contains("hello")) {
                System.out.println("ChatBot: Hello! How can I help you?");
            }
            else if (message.contains("how are you")) {
                System.out.println("ChatBot: I'm doing fine. How about you?");
            }
            else if (message.contains("your name")) {
                System.out.println("ChatBot: I'm just a simple chatbot written in Java.");
            }
            else if (message.contains("what can you do")) {
                System.out.println("ChatBot: I can respond to basic messages.");
            }
            else if (message.contains("thank")) {
                System.out.println("ChatBot: You're welcome.");
            }
            else if (message.contains("bye")) {
                System.out.println("ChatBot: Goodbye.");
                break;
            }
            else {
                System.out.println("ChatBot: I didn't understand that.");
            }
        }

        input.close();
    }
}
