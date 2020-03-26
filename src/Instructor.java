public class Instructor {
    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static  int numInstructors;

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("\t%s %s was just created!\n", firstName, lastName);
        System.out.printf("\tInstructor count: %d\n\n", numInstructors);
    }

   //Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFrequency) {
        this.brainWaveFrequency = brainWaveFrequency;
    }

    //method to display instructor info

    public String displayStats(){
        return String.format("\t%s %s,Brainwave frequency: %d", firstName,lastName,brainWaveFrequency );
    }


}


