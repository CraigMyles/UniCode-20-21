public class Solution {
    public static String cipher(String input, int key) {
        //ASCII a-z = 97-122
        //ASCII A-Z = 65-90
        if(key>26){
            key=key%26;
        }
        else if (key<0){
            while(key < 0)
            {
                key+=26;
            }
            key=key%26;
        }

        int messageLength = input.length();
        String newString = "";
        char currentLetter;
        int newCharNumber;

        for (int i = 0; i < messageLength; i++) {
            currentLetter = input.charAt(i);
            //lower case
            if (currentLetter >= 97 && currentLetter <= 122) {
                newCharNumber = currentLetter + key;

                if (newCharNumber > 122) {
                    newCharNumber -= 26;
                }
                newString += Character.toString((char) newCharNumber);
            }
            //upper case
            else if (currentLetter >= 65 && currentLetter <= 90) {
                newCharNumber = currentLetter + key;

                if (newCharNumber > 90) {
                    newCharNumber -= 26;
                }
                newString += Character.toString((char) newCharNumber);
            } else {
                newString += currentLetter;
            }
        }
        return newString;
    }
}
