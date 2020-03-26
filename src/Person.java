public class Person {
    private String firstName;//property of the Person
    private String lastName;// property of the Person
    public static long personCount; //keeps track of


    public Person() {//constructor wit no definitions  use setter or getter
        System.out.println("Here is a new person");
        personCount++;//every time a person is constructed increase the count of people made
    }

    public Person (String firstName, String lastName){//constructor with properties defined
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    // returns the person's name
        public String getName(){
        return firstName + " " + lastName;
        }

// changes the name property to the passed value
        public void setName (String first, String last){
            this.firstName = first;
            this.lastName = last;
        }



    // prints a message to the console using the person's name
        public void sayHello(){
            System.out.printf("Hello from %s %s", firstName, lastName);
        };

    public static void main(String[] args) {

//        System.out.println("Number of people: " + personCount);
        Person p1 = new Person("Jimmy", "Muralles"); // makes new person p1 using the Person constructor with parameters
        System.out.println(p1.getName()); //gets the name and prints it
        System.out.println("Number of people: " + personCount);
        Person a = new Person(); // creates a new person a with properties not defined
        a.firstName = "James"; // giving the new person a value for their firstName
        a.lastName = "Muralles";// giving the new person a value for lastName
        System.out.println(a.getName());//gets and prints the Person a's name
        System.out.println("Number of people: " + personCount);
        a.setName("Jim", "Muralles");//changing person a's name from Jimmy to Jim
        System.out.println(a.getName());
        Person b = new Person("Hey", "Arnold");
        System.out.println(b.getName());
        System.out.println(personCount);
        b.sayHello();

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
