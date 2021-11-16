public class Alg5 {
    /*
    Problem 29
This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings.
The basic idea is to represent repeated successive characters as a single count and character.
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding.
You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
You can assume the string to be decoded is valid.
     */
    public static String encode(String noEncoded){

        StringBuilder result = new StringBuilder("");

        char lastChar = noEncoded.charAt(0);
        int howMany = 1;

        for (int i = 1; i < noEncoded.length(); i++) {
            if(noEncoded.charAt(i) == lastChar){
                howMany++;
            }else{
                result.append(howMany);
                result.append(lastChar);
                lastChar = noEncoded.charAt(i);
                howMany = 1;
            }
        }

        result.append(howMany);
        result.append(lastChar);


        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(encode("AAAABBBCCDAA"));
    }

}
