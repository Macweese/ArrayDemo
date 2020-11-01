/*
 * REDACTED
 */

public class Uppg3
{
    static int[] original;
    static int[] clone1;
    static int[] clone2;

    public static class arrayDemo
    {
        public static void example()
        {
            original = new int[1];
            clone1 = new int[1];
            clone2 = new int[1];
            original[0] = 999;
            // Copy the index
            clone1[0] = original[0];
            // Copy the object
            clone2 = original.clone();
            System.out.println("Original array : " + original[0]);
            System.out.println("Clone array 1  : " + clone1[0]);
            System.out.println("Clone array 2  : " + clone2[0]);

            compare(original, clone1);

        }

        // Demo comparing arrays
        public static void compare(int[] firstArray, int[] secondArray)
        {
            System.out.println("\nComparing indices with '==' comparator");

            if (firstArray[0] == secondArray[0])
                System.out.println("TRUE - They are the same");
            else
            {
                System.out.println("FALSE - They are not the same");
            }

            System.out.println("\nComparing entire array with '==' comparator");

            if (firstArray == secondArray)
                System.out.println("TRUE - They are the same");
            else
            {
                System.out.println("FALSE - They are not the same\n...Why is that?");
                System.out.println("The memory pointing to the first array → " + firstArray);
                System.out.println("Does not match the value which the clone points to → " + secondArray);
            }
        }
    }

    /**
     * Main
     */
    public static void main(String[] args)
    {
        // Example of duplicating arrays
        //arrayDemo.example();

        // Call method dice() from class Simulation
        Simulation.dice();
    }

    public static class Simulation
    {
        static int[] digits = new int[100];

        public static void dice()
        {
            fillArray(digits);
            printResults(digits);
        }

        // Create and return a random number 1-6
        private static int randomizer()
        {
            return (int) (Math.random() * 6) + 1;
        }

        // Fill the array with results
        private static void fillArray(int[] array)
        {
            for (int i = 0; i < array.length; i++)
            {
                array[i] = randomizer();
            }
        }

        // Print the results to console
        private static void printResults(int[] array)
        {
            int col = 0;
            int roll_1 = 0;
            int roll_2 = 0;
            int roll_3 = 0;
            int roll_4 = 0;
            int roll_5 = 0;
            int roll_6 = 0;

            System.out.print("Displaying 10 results per line:\n");
            for (int i = 0; i < array.length; i++)
            {
                if (col == 10)
                {
                    System.out.print("\n" + array[i] + " ");
                    col = 0;
                }
                else
                    System.out.print(array[i] + " ");

                col++;
            }

            // Tally results for compacted view
            for (int j : array)
            {
                if (j == 1)
                {
                    roll_1++;
                }
                if (j == 2)
                {
                    roll_2++;
                }
                if (j == 3)
                {
                    roll_3++;
                }
                if (j == 4)
                {
                    roll_4++;
                }
                if (j == 5)
                {
                    roll_5++;
                }
                if (j == 6)
                {
                    roll_6++;
                }

            }
            System.out.println("\nRolls:" +
                    "\n1 x " + roll_1 +
                    "\n2 x " + roll_2 +
                    "\n3 x " + roll_3 +
                    "\n4 x " + roll_4 +
                    "\n5 x " + roll_5 +
                    "\n6 x " + roll_6);
        }
    }
}
