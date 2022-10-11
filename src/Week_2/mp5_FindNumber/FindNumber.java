package Week_2.mp5_FindNumber;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 25, 26, 30, 40, 42};
        int number = 25;

        boolean isExist = false;

        for (int element : numbers) {
            if (number == element) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            System.out.println(number + " exists in array.");
        } else {
            System.out.println(number + " does not exist in array.");
        }
    }
}
