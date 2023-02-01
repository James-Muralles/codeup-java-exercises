package YaleChallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class concordance {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // add the file name path
        Scanner sc = new Scanner(
                new File("/Users/smurfkat/IdeaProjects/codeup-java-exercises/src/YaleChallenge/test-1.txt"));// add the
                                                                                                             // file
                                                                                                             // name
                                                                                                             // path

        Map<String, Map<Integer, Integer>> concordance = new TreeMap<>(); // used to store word frequency and sentence
                                                                          // number, Treemap allows for sorting keys
        int sentenceCount = 0; // sentence counter
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] sentences = line.split("[.!?]");// split by sentence

            // Iterate through each sentence in the line
            for (String sentence : sentences) {
                sentenceCount++;
                String[] words = sentence.split("[^a-zA-Z]+"); // Exclude numbers from the split to only include words

                // Iterate through each word in the sentence
                for (int i = 0; i < words.length; i++) {
                    String word = words[i].toLowerCase().trim(); // Convert the word to lowercase and remove any white
                                                                 // spaces

                    if (word.isEmpty()) {
                        continue;
                    }

                    // Check if the word is already in the concordance. If it is it updates the
                    // frequency count. If not it adds the word to the map.
                    if (concordance.containsKey(word)) {
                        Map<Integer, Integer> sentenceNumbers = concordance.get(word);
                        int count = sentenceNumbers.getOrDefault(sentenceCount, 0);
                        count++;
                        sentenceNumbers.put(sentenceCount, count);
                    } else {
                        Map<Integer, Integer> sentenceNumbers = new HashMap<>();
                        sentenceNumbers.put(sentenceCount, 1);
                        concordance.put(word, sentenceNumbers);
                    }
                }
            }
        }

        try (FileWriter writer = new FileWriter(
                "/Users/smurfkat/IdeaProjects/codeup-java-exercises/src/YaleChallenge/concordance.txt")) {
            // Iterate through the concordance and write the result a text file.
            for (Map.Entry<String, Map<Integer, Integer>> entry : concordance.entrySet()) {
                StringBuilder sb = new StringBuilder();// create a StringBuilder
                sb.append(entry.getKey()).append("\t{"); // append the word and a tab with a opening brace
                int total = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();// get the total freq
                                                                                                 // of words
                sb.append(total).append(": "); // append the freq to sb and append a ":"
                List<Integer> sentenceNumbers = new ArrayList<>(entry.getValue().keySet());// change the sentence
                                                                                           // numbers into a list
                for (int i = 0; i < sentenceNumbers.size(); i++) {
                    sb.append(sentenceNumbers.get(i));
                    if (i < sentenceNumbers.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("}\n");// iterate through the sentence numbers, append the sentence number to sb, a
                                 // check is made to determine whether it is the last sentence and if not append
                                 // a "," and appends a closing brace and a new line.
                writer.write(sb.toString());// writes the sb to the concordance text file
            }
        }

    }
}

// The code below will print to the console

// for (Map.Entry<String, Map<Integer, Integer>> entry : concordance.entrySet())
// {
// System.out.print(entry.getKey() + "\t{");
// int total =
// entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
// System.out.print(total + ": ");
// List<Integer> sentenceNumbers = new ArrayList<>(entry.getValue().keySet());
// for (int i = 0; i < sentenceNumbers.size(); i++) {
// System.out.print(sentenceNumbers.get(i));
// if (i < sentenceNumbers.size() - 1) {
// System.out.print(",");
// }
// }
// System.out.println("}");
// }