public class Solution {
    public static int getScore(String[] input) {
        String[] input2 = new String[input.length];

        for (int j = 0; j < input.length; j++) {
            if(input[j] == "/"){
                if(j+1< input.length) {
                    input2[j] = Integer.toString((10 - (Integer.parseInt(input[j - 1]))) + Integer.parseInt(input[j + 1]));
                }
                else{
                    input2[j] = Integer.toString(10 - (Integer.parseInt(input[j - 1])));
                }
            }
            else if(input[j] == "X"){ 
                if(j+2 < input.length) {
                    int ahead1, ahead2 = 0;
                    ahead1 = Integer.parseInt(input[j + 1]);
                    ahead2 = Integer.parseInt(input[j + 2]);
                    input2[j] = Integer.toString(10+ahead1+ahead2);
                }
                else if(j+1 < input.length) {
                    input2[j] = Integer.toString(10 + Integer.parseInt(input[j + 1]));
                }
                else{
                    input2[j] = Integer.toString(10);
                }
            }
            else{
                input2[j] = input[j];
            }
        }

        int totalScore = 0;
        for (int i = 0; i < input2.length; i++) {
            totalScore += Integer.parseInt(input2[i]);
        }
        
        if(totalScore>300){
            return 300;
        }
        else{
            return totalScore;
        }
    }
}
