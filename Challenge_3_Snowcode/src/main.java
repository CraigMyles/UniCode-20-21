import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getRecipient(String message, int position) {
        
        List<String> regMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("(?<=^|(?<=[^a-zA-Z0-9-_\\\\.]))@[A-Za-z0-9_-]+").matcher(message);

        while (m.find()){
            regMatches.add(m.group());
        }

        return (regMatches.get(position-1)).substring(1);
    }
}