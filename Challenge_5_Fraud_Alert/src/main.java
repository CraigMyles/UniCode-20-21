import java.util.Arrays;
public class PairValidator {
    public static Boolean validate(String input, String input2) {
        
        if (input.length() != input2.length()) {
            return false;
        }
        
        if (input.length() == 0) {
            return false;
        }

        int[] input1Array = new int[input.length()];
        int[] input2Array = new int[input2.length()];

        for (int i = 0; i < input.length(); i++) {
            input1Array[i] = (int) input.charAt(i);
            input2Array[i] = (int) input2.charAt(i);
        }

        Arrays.sort(input1Array);
        Arrays.sort(input2Array);

        for (int j = 0; j < input.length(); j++) {
            if ((input2Array[j]-input1Array[j] == 1 || input2Array[j]-input1Array[j] == -1 || input2Array[j]-input1Array[j] == 0)==false){
                return false;
            }
        }
        return true;
    } 
    
}
