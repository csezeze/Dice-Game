package ZeynepOzkanHW1;

import java.util.Random;

    /**
     * The six-sided die represented by the Dice class can be rolled,
     * its face value set, or it can be retrieved.
     */
public class Die {
    private int faceValue; // the current face value of the die
    private static final int MAX = 6; // the maximum face value of the die

    /**
     * Constructs a new Die object and rolls it to set the initial face value.
     */
    public Die() {
        roll();
    }

    /**
     * Rolls the die to generate a random face value between 1 and 6.
     */
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(MAX) + 1;
    }

    /**
     * If the value is a valid face value,
     * it changes the die's face value to the value supplied (between 1 and 6).
     *
     * @param value the value to set as the face value of the die
     */
    public void setFaceValue(int value) {
        if (value >= 1 && value <= MAX) {
            faceValue = value;
        }
    }

    /**
     * Returns the current face value of the die.
     *
     * @return the current face value of the die
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a string representation of the die.
     *
     * @return a string representation of the die
     */
    @Override
    public String toString() {
        return "Die [faceValue=" + faceValue + "]";
    }

    /**
     * Compares this die to another object to see if they are equal.
     *
     * @param obj the object to compare to this die
     * @return true if the object is a die with the same face value, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Die other) {
            return faceValue == other.faceValue;
        }
        return false;
    }
}
