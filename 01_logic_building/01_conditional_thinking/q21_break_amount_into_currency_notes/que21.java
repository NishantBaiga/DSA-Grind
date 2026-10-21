

// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
public class que21 {
    public static void main(String[] args) {
        int amount = 3800; // Change this to test different amounts

        // The smallest note is 100, so the amount must be a multiple of 100
        // It must also be greater than 0 to be valid for distribution
        if (amount > 0 && amount % 100 == 0) {
            System.out.println("Yes, the amount can be evenly divided.");

            // Optional: Calculate the breakdown
            int notes2000 = amount / 2000;
            amount %= 2000;

            int notes500 = amount / 500;
            amount %= 500;

            int notes100 = amount / 100;

            System.out.println("2000 Notes: " + notes2000);
            System.out.println("500 Notes: " + notes500);
            System.out.println("100 Notes: " + notes100);
        } else {
            System.out.println("No, the amount cannot be evenly divided.");
        }
    }
    // Include ₹50, ₹20, ₹10 notes for next level
}
