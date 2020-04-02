package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();




        Student dummy = new Student("Bob");
        dummy.addGrade(24);
        dummy.addGrade(25);
        dummy.addGrade(29);
        dummy.recordAttendance("2017-10-02", "Present");
        dummy.recordAttendance("2017-10-03", "Absent");
        dummy.recordAttendance("2017-10-04", "Absent");
        Student decent = new Student("Bobby");
        decent.addGrade(88);
        decent.addGrade(83);
        decent.addGrade(77);
        decent.recordAttendance("2017-10-02", "Absent");
        decent.recordAttendance("2017-10-03", "Absent");
        decent.recordAttendance("2017-10-04", "Absent");
        Student smarty = new Student("Thomas");
        smarty.addGrade(100);
        smarty.addGrade(100);
        smarty.addGrade(100);
        smarty.recordAttendance("2017-10-02", "Present");
        smarty.recordAttendance("2017-10-03", "Present");
        smarty.recordAttendance("2017-10-04", "Present");
        Student superDumb = new Student("Ed");
        superDumb.addGrade(3);
        superDumb.addGrade(3);
        superDumb.addGrade(1);
        superDumb.recordAttendance("2017-10-02", "Present");
        superDumb.recordAttendance("2017-10-03", "Present");
        superDumb.recordAttendance("2017-10-04", "Absent");
        students.put("codey-MCcoder", smarty);
        students.put("cantgetright20", superDumb);
        students.put("dontknow", dummy);
        students.put("idojustfine", decent);


//        System.out.println(dummy.getName());
//        students.forEach((key, value) -> System.out.println(("\t\t" + students.get("dontknow").getGradeAverage())));
//        System.out.println(dummy.getGrades());
//
        System.out.println("Enter a username to peep at!\nView all grades for all students by pressing [1]\nView class average by pressing [2]\nPrint csv report for all students by pressing [3]\n \tHere are our current users:");
            students.forEach((key, value) -> System.out.printf("\t |%s| ---- ", key));
        Input input = new Input();
        boolean continueOn = true;
        do {
            System.out.println("\tWhat option will you preform?");
            String userInput = input.getString();
            // check if typed in user actually exists
            if (userInput.equals("1")){
                students.forEach((key, value) -> System.out.printf("\t\t\t%s- %s", value.getName(),value.getGrades()));
//1
            }
            if (userInput.equals("2")){
                    double classAverage = 0;
                    double count = 0;
                for (Map.Entry<String, Student> entry : students.entrySet()) {
                    double average = entry.getValue().getGradeAverage();
                    classAverage += average/students.size();
                }
                System.out.printf("\t\t\tClass Average: %.2f",classAverage);
            }
            if (userInput.equals("3")){
                students.forEach((key, value) -> System.out.printf("\n\t\t\t%s,%s,%.2f", value.getName(),key, value.getGradeAverage()));

            }
            if(!students.containsKey(userInput) && !userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3")){
                System.out.println("\n\t***username does not exist***");
                continue;
            }
            else if (students.containsKey(userInput)){
                // they did type in a matching Github user name / key
                Student currentUser = students.get(userInput);
                System.out.println("\t\t\tName: " + currentUser.getName() + " -GitHub username: " + userInput + "\n\t\t\tAll grades: " + currentUser.getGrades() + "\n\t\t\tGrade average: " + currentUser.getGradeAverage() + "\n\t\t\tAttendance %: " + currentUser.attendancePer());
            }
            System.out.println("\n\n\tWould you like to continue? [y/N]");
            continueOn = input.yesNo();

        } while(continueOn); // once the user says they no longer want to participate, EXIT


    }
}
