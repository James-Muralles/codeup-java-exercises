public class Person {
    private String firstName;
    private String lastName;
    public static long personCount;


    public Person() {
        System.out.println("Here is a new person");
        personCount++;
    }

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    // returns the person's name
        public String getName(){
        return firstName + " " + lastName;
        }

        public void setName (String first, String last){
            this.firstName = first;
            this.lastName = last;
        }
// changes the name property to the passed value



    // prints a message to the console using the person's name
        public void sayHello(){
            System.out.printf("Hello from %s %s", firstName, lastName);
        };

    public static void main(String[] args) {
        System.out.println("Number of people: " + personCount);
        Person p1 = new Person("Jimmy", "Muralles");
        System.out.println(p1.getName());
        System.out.println("Number of people: " + personCount);
        Person a = new Person();
        a.firstName = "James";
        a.lastName = "Muralles";
        System.out.println(a.getName());
        System.out.println("Number of people: " + personCount);
        a.setName("Jim", "Muralles");
        Person b = new Person("Hey", "Arnold");
        System.out.println(b.getName());
        System.out.println(personCount);

//        Person person1 = new Person("John", "Doe");
//        Person person2 = new Person("John", "Doe");
//        System.out.println(person1.getName().equals(person2.getName()));// true because same same value
//        System.out.println(person1 == person2);// false because different address

//        Person person1 = new Person("John", "Doe");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println(person1);
//        System.out.println(person2);

//        Person person1 = new Person("John", "Doe");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane", "Doe");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}
