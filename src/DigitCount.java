import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        int[] counts = count(num);

        for(int i = 0; i < counts.length; i++){
            if(counts[i] > 0){
                System.out.printf("Digits %d occurs %d times%s\n", i, counts[i] > 1 ? "s" : "");
            }
        }
    }

    public static int[] count(long num){
        int[] counts = new int[10];
        String numStr = String.valueOf(num);
        for(int i = 0; i < numStr.length(); i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            counts[digit]++;
        }

        return counts;
    }
}


