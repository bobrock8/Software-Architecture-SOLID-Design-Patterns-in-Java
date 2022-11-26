package solid.singleresposibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibility {


    public static final int THRESHOLD = 5;

    public SingleResponsibility() {
        System.out.println("SOLID - #1 - Single Responsibility Principle");

        List<Integer> nums = collectNumbers();
        Collections.sort(nums);

        showNumbers(nums);
    }

    private static List<Integer> collectNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");


        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if (!isValid(s)) {
                continue;
            }

            int num = Integer.parseInt(s);
            nums.add(num);
        }

        scanner.close();

        return nums;
    }

    private static boolean isValid(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        int num = Integer.parseInt(s);

        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }

        return true;
    }

    private static void showNumbers (List<Integer> nums ) {
        for(int num : nums)
            System.out.print(num+" ");
    }
}
