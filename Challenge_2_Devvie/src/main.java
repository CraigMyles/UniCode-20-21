public class main {
    public static int devvie(String input) {
        //String input;
        //input = "RF"; // = 3
        //input = "FxLxLxFx"; // = 0
        //input = "RFRFL"; // = 4
        //input = "FRFLFRFLFFRFRFLFLFRF"; // =(5,4),(E) = 11?
        //input = "FRxxFLyFR34FL*FF+RF+RF6LFBLFlbRF"; // =(5,4),(E) = 11?
        int x, y;
        x = 0;
        y = 0;
        char orientation;
        int minDistanceToTravel;

        orientation = 'N'; //north,east,south,west|N,E,S,W
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            /**CHAR = R **/
            if (orientation == 'N' && (input.charAt(i) == 'R')){
                //turn right
                orientation = 'E';
            }

            else if (orientation == 'E' && (input.charAt(i) == 'R')){
                //turn right
                orientation = 'S';
            }

            else if (orientation == 'S' && (input.charAt(i) == 'R')){
                //turn right
                orientation = 'W';
            }

            else if (orientation == 'W' && (input.charAt(i) == 'R')){
                //turn right
                orientation = 'N';
            }

            /**CHAR = L **/
            if (orientation == 'N' && (input.charAt(i) == 'L')){
                //turn left
                orientation = 'W';
            }

            else if (orientation == 'W' && (input.charAt(i) == 'L')){
                //turn left
                orientation = 'S';
            }

            else if (orientation == 'S' && (input.charAt(i) == 'L')){
                //turn left
                orientation = 'E';
            }

            else if (orientation == 'E' && (input.charAt(i) == 'L')){
                //turn right
                orientation = 'N';
            }

            /**CHAR = F **/
            if (orientation == 'N' && (input.charAt(i) == 'F')){
                y++;
            }

            else if (orientation == 'E' && (input.charAt(i) == 'F')){
                x++;
            }

            else if (orientation == 'S' && (input.charAt(i) == 'F')){
                y--;
            }

            else if (orientation == 'W' && (input.charAt(i) == 'F')){
                x--;
            }

        }

        minDistanceToTravel = (Math.abs(x)+Math.abs(y)); //+1 if must turn (which is always unless either x or y = 0;

        //(+,+) = S|W, +1 if N|E
        //(+,-) = N|W, +1 if S|E
        //(-,-) = N|E, +1 if S|W
        //(-,+) = S|E, +1 if N|W

        if (x>0 & y>0){
            //turn once
            if (orientation == 'S' | orientation == 'W'){
                minDistanceToTravel = minDistanceToTravel+1;
            }
            //turn twice
            if (orientation == 'N' | orientation == 'E'){
                minDistanceToTravel = minDistanceToTravel+2;
            }
        }

        if (x>0 & y<0){
            //turn once
            if (orientation == 'N' | orientation == 'W'){
                minDistanceToTravel = minDistanceToTravel+1;
            }
            //turn twice
            if (orientation == 'S' | orientation == 'E'){
                minDistanceToTravel = minDistanceToTravel+2;
            }
        }

        if (x<0 & y<0){
            //turn once
            if (orientation == 'N' | orientation == 'E'){
                minDistanceToTravel = minDistanceToTravel+1;
            }
            //turn twice
            if (orientation == 'S' | orientation == 'W'){
                minDistanceToTravel = minDistanceToTravel+2;
            }
        }

        if (x<0 & y>0){
            //turn once
            if (orientation == 'S' | orientation == 'E'){
                minDistanceToTravel = minDistanceToTravel+1;
            }
            //turn twice
            if (orientation == 'N' | orientation == 'W'){
                minDistanceToTravel = minDistanceToTravel+2;
            }
        }

        //What to do if X or Y are on the axes?

        //(+,0)
        //(0,-)
        //(-,0)
        //(0,+)
        if (x>0 & y==0){
            if (orientation == 'N'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'E'){
                minDistanceToTravel += 2;
            }
            if (orientation == 'S'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'W'){
                minDistanceToTravel += 0;
            }
        }
        if (x==0 & y<0){
            if (orientation == 'N'){
                minDistanceToTravel += 0;
            }
            if (orientation == 'E'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'S'){
                minDistanceToTravel += 2;
            }
            if (orientation == 'W'){
                minDistanceToTravel += 1;
            }
        }
        if (x<0 & y==0){
            if (orientation == 'N'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'E'){
                minDistanceToTravel += 0;
            }
            if (orientation == 'S'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'W'){
                minDistanceToTravel += 2;
            }
        }
        if (x==0 & y>0){
            if (orientation == 'N'){
                minDistanceToTravel += 2;
            }
            if (orientation == 'E'){
                minDistanceToTravel += 1;
            }
            if (orientation == 'S'){
                minDistanceToTravel += 0;
            }
            if (orientation == 'W'){
                minDistanceToTravel += 1;
            }
        }



        //(0,0)
        if (x==0 & y==0){
            minDistanceToTravel = 0;

        }

        //System.out.println("Moves to travel home: "+minDistanceToTravel);
        return minDistanceToTravel;
    }
}
