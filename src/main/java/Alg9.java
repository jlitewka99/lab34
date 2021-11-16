public class Alg9 {
/*
Problem 70
A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
 */
    public static int getNumber(int a){
        String str = String.valueOf(a);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += (int) str.charAt(i) - '0';
        }


        String temp = String.valueOf(sum);

        int last = temp.charAt(temp.length() -1 ) - '0';

        System.out.println("Last");
        System.out.println(last);
        if (10 - last == 10)
            str += 0;
        else
        str += (10 - last);


        return Integer.parseInt(str);
    }


    public static void main(String[] args) {
        System.out.println(getNumber(100));
        System.out.println(getNumber(99));
        System.out.println(getNumber(19));
    }

}
