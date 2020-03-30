package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] listOfMovies = MoviesArray.findAll();
        boolean kontinue = true;
            Input userInput = new Input();
        do {
            System.out.println("\nWhat would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - view movies in the comedy category\n" +
                    "\n" +
                    "Enter your choice: ");
            int userOptions = userInput.getInt(0,8);

                if (userOptions == 0) {
                    break;
                }
                else if(userOptions == 1) {
                    for (Movie movie : listOfMovies) {
                        System.out.printf("%-34s %8s\n", movie.getMovie(), movie.getCategory());
                    }
                }

             else if(userOptions == 2){
                        for (Movie movie : listOfMovies) {
                            if (movie.getCategory().toLowerCase().startsWith("animated")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                            }
                        }
            }

                else if(userOptions == 3){
                    for (Movie movie : listOfMovies) {
                        if (movie.getCategory().toLowerCase().startsWith("drama")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                        }
                    }
                }

                else if(userOptions == 4){
                    for (Movie movie : listOfMovies) {
                        if (movie.getCategory().toLowerCase().startsWith("horror")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                        }
                    }
                }

                else if(userOptions == 5){
                    for (Movie movie : listOfMovies) {
                        if (movie.getCategory().toLowerCase().startsWith("scifi")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                        }
                    }
                }

                else if(userOptions == 6){
                    for (Movie movie : listOfMovies) {
                        if (movie.getCategory().toLowerCase().startsWith("musical")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                        }
                    }
                }

                else if(userOptions == 7){
                    for (Movie movie : listOfMovies) {
                        if (movie.getCategory().toLowerCase().startsWith("comedy")){
                            System.out.printf("\t%-34s %8s\n", movie.getMovie(), movie.getCategory());
                        }
                    }
                }
//            System.out.println("Would you like to continue browsing? [y/N]");
//                kontinue = userInput.yesNo();
        } while (kontinue);
    }
}