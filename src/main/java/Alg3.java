import java.util.function.Function;

public class Alg3 {
    // problem 10

    /*
This problem was asked by Apple.

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.


     */



    public static int problem10( Function<Integer, Integer> f, int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return (int) f.apply(10);


    }

    public static Integer f(Integer num){
        return num*2;
    }


    public static void main(String[] args) {

        Function<Integer, Integer> f = num -> num*2;

        System.out.println(problem10(f, 1000));
    }

}
