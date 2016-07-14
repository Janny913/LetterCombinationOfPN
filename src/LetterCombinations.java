import java.util.List;
import java.util.ArrayList;
/**
 * Created by jianiyang on 16/7/13.
 */
public class LetterCombinations {
    public static List<String> letterCombinations(String digits){
        if(digits == null || digits.length() == 0)
            return null;

        List<String> res = new ArrayList<String>() ;
        res.add("");

        for(int i = 0; i < digits.length(); i++){
            String letters = getLetters(digits.charAt(i));
            ArrayList<String> newRes = new ArrayList<String>();

            for(int j = 0; j < res.size(); j++){
                for(int k = 0; k < letters.length(); k++){
                    newRes.add(res.get(j) + Character.toString(letters.charAt(k)));// transfer char from letters to string to add into newRes
                }
            }
            res = newRes;
        }
        return res;

    }

    private static String getLetters(char digit){
        switch (digit){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            case '0':
                return " ";
            default:
                return "";
        }
    }

    public static void main(String[] args){
        System.out.println(letterCombinations("23"));
    }
}
