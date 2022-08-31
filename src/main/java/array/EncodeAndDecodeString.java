package array;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
 *
 * Please implement encode and decode
 *
 */
public class EncodeAndDecodeString {

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();

    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("^(\\d+)#.*");

        while (!str.isEmpty()){
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()){
                String number = matcher.group(1);
                result.add(str.substring(number.length() + 1,Integer.valueOf(number) + 2));
                str = str.substring(Integer.valueOf(number) + 2);
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(new EncodeAndDecodeString().encode(Arrays.asList("#Test","This#","H#a")));
        System.out.println(new EncodeAndDecodeString().decode("5##Test5#This#3#H#a"));

//        Pattern pattern = Pattern.compile("^(\\d+#).*");
//        Matcher matcher = pattern.matcher("5##Test5#This#3#H#a");
//        if (matcher.find()){
//            System.out.println(matcher.group(1));
//        }
//
//        System.out.println();

    }

}
