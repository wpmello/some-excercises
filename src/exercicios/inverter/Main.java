package exercicios.inverter;

public class Main {
    public static void main(String[] args) {

        int[] numbersList1 = {1,5,4,8,5,4,4,8};
        int[] numbersList2 = {2,1,9,5,4,9,8};
        int[] numbersList3 = {1,2};
        int[] numbersList4 = {9,8,7,1,6,5,4,9};
        int[] numbersList5 = {9,9,9,9,9,9,8,9,9,9};
        int[] numbersList6 = {1,6,5,4,8,9,1};


        int numbersQuantity1 = numbersList1.length;
        int[] reversedNumbers1 = new int[numbersQuantity1];
        int vectorStartedAtZero1 = numbersQuantity1 - 1;

        for (int i =0; i < numbersQuantity1; i++) {
            reversedNumbers1[i] = numbersList1[vectorStartedAtZero1 - i];
            System.out.print(reversedNumbers1[i]);
        }
        System.out.println();
// =================================================================================

        int numbersQuantity2 = numbersList2.length;
        int[] reversedNumbers2 = new int[numbersQuantity2];
        int vectorStartedAtZero2 = numbersQuantity2 - 1;

        for (int i =0; i < numbersQuantity2; i++) {
            reversedNumbers2[i] = numbersList2[vectorStartedAtZero2 - i];
            System.out.print(reversedNumbers2[i]);
        }
        System.out.println();

        // =================================================================================

        int numbersQuantity3 = numbersList3.length;
        int[] reversedNumbers3 = new int[numbersQuantity3];
        int vectorStartedAtZero3 = numbersQuantity3 - 1;

        for (int i =0; i < numbersQuantity3; i++) {
            reversedNumbers3[i] = numbersList3[vectorStartedAtZero3 - i];
            System.out.print(reversedNumbers3[i]);
        }
        System.out.println();

        // =================================================================================

        int numbersQuantity4 = numbersList4.length;
        int[] reversedNumbers4 = new int[numbersQuantity4];
        int vectorStartedAtZero4 = numbersQuantity4 - 1;

        for (int i =0; i < numbersQuantity4; i++) {
            reversedNumbers4[i] = numbersList4[vectorStartedAtZero4 - i];
            System.out.print(reversedNumbers4[i]);
        }
        System.out.println();

        // =================================================================================

        int numbersQuantity5 = numbersList5.length;
        int[] reversedNumbers5 = new int[numbersQuantity5];
        int vectorStartedAtZero5 = numbersQuantity5 - 1;

        for (int i =0; i < numbersQuantity5; i++) {
            reversedNumbers5[i] = numbersList5[vectorStartedAtZero5 - i];
            System.out.print(reversedNumbers5[i]);
        }
        System.out.println();

        // =================================================================================

        int numbersQuantity6 = numbersList6.length;
        int[] reversedNumbers6 = new int[numbersQuantity6];
        int vectorStartedAtZero6 = numbersQuantity6 - 1;

        for (int i =0; i < numbersQuantity6; i++) {
            reversedNumbers6[i] = numbersList6[vectorStartedAtZero6 - i];
            System.out.print(reversedNumbers6[i]);
        }
        System.out.println();
    }
}
