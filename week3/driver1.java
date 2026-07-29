public class driver1 {

    public static void main(String[] args) {

        Card[] cards = new Card[5];

        Card[] input = {
            new Card("Ace", "Spades"),
            new Card("King", "Hearts"),
            new Card("Queen", "Diamonds"),
            new Card("Ace", "Spades"),   // Duplicate
            new Card("Jack", "Clubs")
        };

        int size = 0;
        boolean duplicateFound = false;

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < size; j++) {
                if (input[i].equals(cards[j])) {
                    if (!duplicateFound) {
                        System.out.println("Duplicate found: " + input[i]);
                        duplicateFound = true;
                    }
                    break;
                }
            }

            cards[size] = input[i];
            size++;
        }
    }
}