public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) (Math.random()*6) + 1;

    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int successful = 0;
        for (int i=0;i<10000;i++){
            int six= 0;
            for (int x=0;x<6;x++){
                int rolled = rollDie();
                if (rolled==6){
                    six++;
            }

            }
            if (six>=1){
                successful++;
            }
        }
        return 100*(successful/10000.0);

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int successful = 0;
        for (int i=0;i<10000;i++){
            int sixes= 0;
            for (int x=0;x<12;x++){
                if (rollDie()==6){
                    sixes++;
                }

                }
            if (sixes>=2){
                successful++;
            }
        }
        return 100*(successful/10000.0);
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int successful = 0;
        for (int i=0;i<10000;i++){
            int sixes= 0;
            for (int x=0;x<18;x++){
                if (rollDie()==6){
                    sixes++;
                }

                }
            if (sixes>=3){
                successful++;
            }
        }
        return 100*(successful/10000.0);
    }

    public static void main(String[] args) {
        System.out.println("The probability of rolling a 6 in 6 rolls is " + probabilityOneSix() + " percent");
        System.out.println("The probability of rolling a 2 sixes in 12 rolls is " + probabilityTwoSixes() + " percent");
        System.out.println("The probability of rolling a 3 sixes in 18 rolls is " + probabilityThreeSixes() + " percent");
    }
}
