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
                    "8 - add a movie\n" +
                    "\n");
            int userOptions = userInput.getInt(0, 8);

            if (userOptions == 0) {
                break;
            } else if (userOptions == 1) {
                for (Movie movie : listOfMovies) {
                    System.out.printf("%-34s %8s\n", movie.getName(), movie.getCategory());
                }
            } else if (userOptions == 2) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("animated")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userOptions == 3) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("drama")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userOptions == 4) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("horror")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userOptions == 5) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("scifi")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userOptions == 6) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("musical")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userOptions == 7) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().toLowerCase().startsWith("comedy")) {
                        System.out.printf("\t%-34s %8s\n", movie.getName(), movie.getCategory());
                    }
                }
            }

         else if (userOptions == 8) {
            listOfMovies = addMovie(listOfMovies);
            System.out.println("movie added");
        }
//            System.out.println("Would you like to continue browsing? [y/N]");
//                kontinue = userInput.yesNo();
        } while (kontinue);
    }

    public static Movie[] addMovie(Movie[] oldMovies) { // add a new movie and accepts the old array of movies as a parameter
        int length = oldMovies.length + 1;//length of the new array is = to the original array + 1
        Movie[] newMoviesArr = new Movie[length];// new array has elements = to the length of the old array
        String newCat = "";
        Input input = new Input();
        System.out.println("Enter movie title to be added");
        String newTitle = input.getString();
        System.out.println("Enter a category: " +
                "\n\"1- animated\\n\" +\n" +
                "\"2 - drama\\n\" +\n" +
                "\"3 - horror\\n\" +\n" +
                "\"4 - scifi\\n\" +\n" +
                "\"5 - musical\\n\" +\n" +
                "\"6 - comedy\\n\"");
        int catOptions = input.getInt(1, 7);

        if (catOptions == 1) {
            newCat = "animated";
        } else if (catOptions == 2) {
            newCat = "drama";
        } else if (catOptions == 3) {
            newCat = "horror";
        } else if (catOptions == 4) {
            newCat = "scifi";
        } else if (catOptions == 5) {
            newCat = "musical";
        } else if (catOptions == 6) {
            newCat = "comedy";
        }
            for ( int i = 0; i < oldMovies.length; i++){// loop through the original array
                newMoviesArr[i] = oldMovies[i];// new array at i is = to the old array at i
            }
            Movie newMovieAdded = new Movie (newTitle, newCat);
            newMoviesArr[oldMovies.length] = newMovieAdded;// new arr at the length of the old array( which is now the new index for the new movie) = the new movie
            return newMoviesArr;// return the new array
        }


    }

