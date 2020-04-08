package extrapractice;

public class Dogs {
    private String breed;
    private String size;
    private int age;
    private static int dogsCreatedCount;

    public Dogs(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        dogsCreatedCount++;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String dogBarks(String barks) {
        if (barks.contains("barks")) {
            return "dog is barking";
        }
        else {
            return "good boy";

        }

    }

    public int humanYearsTodogYears(int humanYears) throws Exception {
        int conversion = humanYears * 7;
        if (conversion > 91) {
            throw new Exception("Dogs dont live that long");
        }
        return conversion;
    }


//

//    public static void main(String[] args) throws Exception {
//        Dogs jameson = new Dogs("pit mix", "medium", 6);
//        System.out.println(jameson.getAge());
//        System.out.println(jameson.getBreed());
//        System.out.println(jameson.getSize());
//        System.out.println(jameson.humanYearsTodogYears(91));
//        System.out.println(jameson.dogBarks("no"));
//    }

}
