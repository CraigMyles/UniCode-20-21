public class Cipher {
    public static String halliday(String message) {
        //ASCII a-z = 97-122
        //ASCII A-Z = 65-90

        int messageLength = message.length();

        String newString = "";
        char currentLetter;
        int newCharNumber;

        for (int i = 0; i < messageLength; i++) {
            currentLetter = message.charAt(i);

            //lower case
            if (currentLetter >= 97 && currentLetter <= 122) {
                newCharNumber = currentLetter + 13;

                if (newCharNumber > 122) {
                    newCharNumber -= 26;
                }
                newString += Character.toString((char) newCharNumber);
            }

            //upper case
            else if (currentLetter >= 65 && currentLetter <= 90) {
                newCharNumber = currentLetter + 13;

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