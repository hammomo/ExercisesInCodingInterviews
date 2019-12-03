/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintPossibleString {
    public static void main(String[] args) {
        PrintPossibleString test = new PrintPossibleString();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        ArrayList<String> result = test.Permutation(str);
        result.forEach(s -> System.out.println(s));
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if (str == null || str.length() == 0) return res;
        perMutationHelper(str.toCharArray(), 0, res);
        Collections.sort(res);
        return res;
    }

    private void perMutationHelper(char[] chars, int i, ArrayList<String> list) {
        if (i == chars.length - 1) {
            String val = String.valueOf(chars);
            // don't add to list if it already exists
            if (!list.contains((val))) {
                list.add(val);
            }
        } else {
            for (int j=i; j < chars.length; j++) {
                swap(chars, i, j);
                perMutationHelper(chars, i+1, list);
                swap(chars, i, j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
