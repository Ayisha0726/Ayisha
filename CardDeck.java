import java.util.Scanner;

public class CardDeck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Card Number(1-52): ");
            int cardNumber = scanner.nextInt();
            if (cardNumber < 1 || cardNumber > 52){
                System.out.println("Illegal card number");
                continue;
            }
            String card = getCardName(cardNumber);
            System.out.println("The card you picked is " + card);
        }
    }

    public static String getCardName(int cardNumber) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {
                "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"
        };

        int suitIndex = (cardNumber - 1) / 13;
        int valueIndex = (cardNumber - 1) % 13;

        return values[valueIndex] + " of " + suits[suitIndex];
    }
}
