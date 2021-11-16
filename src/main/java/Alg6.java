import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alg6 {
    /*
    Problem 27
This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])", you should return true.

Given the string "([)]" or "((()", you should return false.
     */
    public static boolean remove(List<Character> characters){
        String temp;
        for (int i = 0; i < characters.size() -1 ; i++) { //
            temp = String.valueOf(characters.get(i)) +  String.valueOf(characters.get(i + 1));
            if (temp.equals("[]") || temp.equals("()")){
                characters.remove(i);
                characters.remove(i);
                return true;
            }
        }
        return false;
    }


    public static boolean check(String brackets) {

        List<Character> ch = new ArrayList<Character>();

        if (brackets.length()%2 == 1){
            return false;
        }

        for (int i = 0; i < brackets.length(); i++) {
            ch.add(brackets.charAt(i));
        }

        for (int i = 0; i < ch.size()/2; i++) {
            if (remove(ch) == false){
                return false;
            }
        }




        return true;

    }

    public static void main(String[] args) {
        System.out.println(check("(([(]]))"));
    }

}
