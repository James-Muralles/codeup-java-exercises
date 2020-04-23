import java.lang.Math;

public class HighLow {

    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 99) + 1;
        playHighLow(randomNum, 0);

    }

    public static void playHighLow(int rand, int guesses){
        int numberToGuess = MethodsExercises.getInteger(1, 100);
        guesses += 1;
        if(guesses == 10){
            System.out.println("YOU LOSE!");
        }else if(numberToGuess > rand){
            System.out.println("LOWER!");
            System.out.println("Number of guesses = " + guesses);
            playHighLow(rand, guesses);
        }else if (numberToGuess < rand){
            System.out.println("HIGHER!");
            System.out.println("Number of guesses = " + guesses);
            playHighLow(rand, guesses);
        }else if (numberToGuess == rand){
            System.out.println("GOOD GUESS!");
            System.out.println("Number of guesses = " + guesses);
        }
    }

}