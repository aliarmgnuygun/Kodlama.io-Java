package Week_1.recapDemo_1;

public class BiggestNumber {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 2;
        int number3 = 12;

        int biggestNumber = number1;

        if (biggestNumber < number2) {
            biggestNumber = number2;
        }
        if (biggestNumber < number3) {
            biggestNumber = number3;
        }

        System.out.println("Biggest number is: " + biggestNumber);
    }
}
