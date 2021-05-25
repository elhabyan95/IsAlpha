
package pipeline.test;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IsAlpha {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.err.println("please enter any string");
        String s1 = in.nextLine();

        System.out.println(func(s1));
    }
    public static boolean func(String s) {
        if (!s.isEmpty()) {
            boolean res = s.chars().allMatch(str -> Character.isLetter(str));
            return res;

        } else {
            System.out.println("you have entered an empty string");
        }
        return false;

    }

}
}
