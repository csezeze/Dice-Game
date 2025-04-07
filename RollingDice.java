package ZeynepOzkanHW1;
    /**
     * A driver class for testing the Die class.
     */
public class RollingDice {
    public static void main(String[] args) {
        // Create an array of dice and roll them
        Die[] dice = new Die[3];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
            dice[i].roll();
        }
        System.out.println("*** The dice are rolled ***");
        // Print out the face values of the dice
        System.out.print("The dice are: ");
        for (int i = 0; i < dice.length; i++) {
            System.out.print(dice[i].getFaceValue() + " ");
        }
        System.out.println();

        // Calculate the total value of the dice
        int total = 0;
        for (int i = 0; i < dice.length; i++) {
            total += dice[i].getFaceValue();
        }
        System.out.println("The total value is: " + total);
    }
}
