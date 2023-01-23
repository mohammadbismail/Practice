import java.io.LineNumberInputStream;

public class StringAlgo {
    public static void main(String[] args) {
        String xs = "xxxxxxxxxxxx";
        String[] words = { "crack", "poop", "java" };
        String str = "snap crackle poop nincopoop, java, and poop poop poop!";
        String[] xsArr = new String[words.length];
        // Encrypting words with x's
        for (int i = 0; i < words.length; i++) {
            // ["xxxxx","xxxx"]
            xsArr[i] = xs.substring(0, words[i].length());
        }
        // appling encryption to the original text
        for (int i = 0; i < words.length; i++) {
            str = str.replaceAll(words[i], xsArr[i]);
        }
        System.out.println(str);
    }
}
