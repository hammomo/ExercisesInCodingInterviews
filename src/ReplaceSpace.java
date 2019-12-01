/**
* 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer test = new StringBuffer("HelloWorld ");
        System.out.println(replaceSpace(test));
    }

    public static String replaceSpace(StringBuffer str) {
        while (str.indexOf(" ") >= 0) {
            int i = str.indexOf(" ");
            str.replace(i, i+1, "%20");
        }
        return str.toString();
    }
}
