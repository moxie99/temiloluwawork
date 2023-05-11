import java.util.ArrayList;
import java.util.Scanner;

public class CommonLetters {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        prompt user to enter first array
        System.out.println("Enter first list: ");
        int listsize = input.nextInt();
        char[] list1 = new char[listsize];
        for(int i = 0; i < listsize; i++){
            list1[i] = input.next().charAt(0);
        }

        //        prompt user to enter second array
        System.out.println("Enter second list: ");
        int list2size = input.nextInt();
        char[] list2 = new char[listsize];
        for(int i = 0; i < list2size; i++){
            list1[i] = input.next().charAt(0);
        }

        ArrayList<Character> commonLetters = new ArrayList<>();
        for(char letter: list1){
            if(contains(list2, letter) && !commonLetters.contains(letter)){
                commonLetters.add(letter);
            }
        }

        System.out.print("The common elements are: ");
        for(char letter: commonLetters){
            System.out.print(letter + " ");
        }

    }

    private static boolean contains(char[] arr, char c){
        for(char element : arr) {
            if (element == c){
                return true;
            }
        }
        return false;
    }
}
