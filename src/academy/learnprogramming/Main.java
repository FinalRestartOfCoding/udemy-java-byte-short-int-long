package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 1. int - Integer

        // Stores the minimum value that can be stored in an int variable.
        int myMinIntValue = Integer.MIN_VALUE;

        // Stores the maximum value that can be stored in an int variable.
        int myMaxIntValue = Integer.MAX_VALUE;

        // Using the "+" operator, we can join text and number in the same line.
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Adding 1 to the maximum integer value will cause overflow.
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        // Subtracting 1 from the minimum integer value will cause underflow.
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        // 2. byte - Byte

        // Stores the minimum value that can be stored in a byte variable.
        byte myMinByteValue = Byte.MIN_VALUE;

        // Stores the maximum value that can be stored in a byte variable.
        byte myMaxByteValue = Byte.MAX_VALUE;

        // Prints the minimum and maximum values of the byte data type.
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // 3. short - Short

        // Stores the minimum value that can be stored in a short variable.
        short myMinShortValue = Short.MIN_VALUE;

        // Stores the maximum value that can be stored in a short variable.
        short myMaxShortValue = Short.MAX_VALUE;

        // Prints the minimum and maximum values of the short data type.
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // 4. long - Long

        // Stores the minimum value that can be stored in a long variable.
        long myMinLongValue = Long.MIN_VALUE;

        // Stores the maximum value that can be stored in a long variable.
        long myMaxLongValue = Long.MAX_VALUE;

        // Prints the minimum and maximum values of the long data type.
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // The letter L is appended at the end which tells the compiler that the number is a long literal.
        long myLong = 100L;

        // Prints the value stored in variable myLong.
        System.out.println("myLong = " + myLong);
    }
}