import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getRecipient(String message, int position) {
        
        List<String> regMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("\\B@[a-zA-Z0-9\\-\\_]+").matcher(message); //updated regex

        while (m.find()){
            regMatches.add(m.group());
        }

        if (position>regMatches.size()){
            return "";
        }
        else{
            return (regMatches.get(position-1)).substring(1);
        }
    }
}