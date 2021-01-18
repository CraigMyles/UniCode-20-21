public class AttackCleanup {
    public static String restoreData(String message) {
        StringBuilder result = new StringBuilder();

        //Add the following line to score 100% instead of 80%
        message = message.replaceAll("[^a-zA-Z0-9]", "");

        String ciphered = message.codePoints()
        .map(c -> (c >= 'a' && c <= 'z') ? 'a' + 'z' - c : c)
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
        .toString();

        String ciphered2 = ciphered.codePoints()
        .map(c -> (c >= 'A' && c <= 'Z') ? 'A' + 'Z' - c : c)
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
        .toString();

        String charValue = "";
        String currentNumber = "";
        Boolean flag1 = false;
        
        for (int i = 0; i < ciphered2.length(); i++) {
            char c = ciphered2.charAt(i);
            int j = i + 1;
            charValue = "";
            flag1 = false;

            if (Character.isDigit(c)) {
                currentNumber += c;

                if (i == (ciphered2.length() - 1)) {
                    currentNumber = "0";
                    flag1 = true;
                }

                while (!flag1) {
                    if (Character.isDigit(ciphered2.charAt(j))) {
                        currentNumber += ciphered2.charAt(j);
                        j++;
                    } else if (!Character.isDigit(ciphered2.charAt(j))) {
                        charValue += ciphered2.charAt(j);
                        flag1 = true;

                    }
                }
                
                //.repeat() didnt work with UniCode IDE but makes for a cleaner solution.
                    //result.append(charValue.repeat(Integer.parseInt(currentNumber)));

                result.append(String.format("%0"+currentNumber+"d",0).replace("0", charValue));

                i += ((currentNumber).length());
                currentNumber = "";

            } else if (!(Character.isDigit(c))) {
                result.append(c);
            } else {
                result.append("problem");
            }
        }
        return result.toString();
    }
}