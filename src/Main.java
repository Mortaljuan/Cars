import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, What's your name?");
        String customerName = input.nextLine();

        System.out.println("Nice to meet you " + customerName);

        String path = "./welcome.txt";
        FileReader reader = new FileReader(path);
        while (reader.ready()){
            System.out.print((char) reader.read());
        }
        reader.close();

        FileWriter output = new FileWriter("./customerReview.txt");
        System.out.println("\nPlease, provide a review: ");
        String review = input.nextLine();
        String customerReview = customerName + ": " + review;
        output.write(customerReview);
        output.close();
    }
}