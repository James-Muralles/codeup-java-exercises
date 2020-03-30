import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);// when this is run it gives you the address of the data [I@5a39699c
//        System.out.println(Arrays.toString(numbers));//Array.toString is  necessary so that it can you show you what the array actually looks like [1, 2, 3, 4, 5]


        String[] peopleArr = new String[3]; // made a string array with 3 string elements
        Person arrA = new Person("Bobby", "Hill");// created a new person with a first and last name
        Person arrB = new Person("Hank", "Hill");
        Person arrC = new Person("Peggy", "Hill");
        peopleArr[0] = arrA.getName(); // set the arrays to the new person and got their name
//        System.out.println(peopleArr[0]);
        peopleArr[1] = arrB.getName();
        peopleArr[2] = arrC.getName();
        for (String personName : peopleArr) {//iterated through the people array and printed out the person names
            System.out.println(personName);
        }

        Person[] peopleArr2 = new Person[3]; // created a person array with one new person instance in each element
        peopleArr2[0] = new Person("Timmy", "Turner"); // created a new person with a first and last name and made it equal to each array
        peopleArr2[1] = new Person("Hey", "Arnold");
        peopleArr2[2] = new Person("Doug", "Dimmadome");
        Person newPerson = new Person("Clark", "Kent");

        for (Person person : peopleArr2) { //iterated through each person and used the get name method to print the names
            System.out.println(person.getName());
        }
     addPerson(peopleArr2, newPerson); // call the method and add new person to the original array
        System.out.println(addPerson(peopleArr2, newPerson).length); //get the new length of the array
        System.out.println(addPerson(peopleArr2, newPerson)[3].getName());// get the name of the last person added which is the new person
        for (Person person : addPerson(peopleArr2, newPerson)){
            System.out.println(person.getName());// loop through each  person and get their name
        }
            System.out.println(Arrays.toString(addPerson(peopleArr2, newPerson)));

    }

    public static Person[] addPerson(Person[] peopleOriginal, Person personToAdd) { //method to add person accepts the old person array and the new person to be added
        int length = peopleOriginal.length + 1;//length of the new array is = to the original array + 1
        Person[] newPeopleArr = new Person[length];// new array has elements = to the length of the old array

       for ( int i = 0; i < peopleOriginal.length; i++){// loop through the original array
           newPeopleArr[i] = peopleOriginal[i];// new array at i is = to the old array at i
        }
        newPeopleArr[peopleOriginal.length] = personToAdd;// new arr at the length of the old array( which is now the new index for the new person) = the new person
        return newPeopleArr;// return the new array
    }

}
