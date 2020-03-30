public class ServerNameGenerator {
    static String[] adjectives = {"big", "small", "tall", " fat", "slow", "tan", "fast", "smart", "skinny", "furry"};
    static String[] nouns = {"Jimmy", "Washington", "apple", "street", "London", "milk", "house", "boy", "girl", "baby"};

    public static String randomReturn(String[] arr) {
        return arr[(int) (Math.random() * arr.length)];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your servername: \n%s %s", randomReturn(adjectives), randomReturn(nouns));
    }
}
