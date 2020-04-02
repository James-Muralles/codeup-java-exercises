package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Student {
    private String name;//property 1
    private ArrayList<Integer> grades;// property 2
    private HashMap<String, String> attendence;

    public void recordAttendance(String date, String value) {
        this.attendence.put(date, value);
    }

    public String attendancePer() {
        double absenceCount = Collections.frequency(attendence.values(), "Absent");
        return String.format("%.2f",(attendence.size() - absenceCount) / attendence.size()*100);
    }


    public Student(String name) {// constructor
        this.name = name;// giving value to property name
        this.grades = new ArrayList<Integer>();//setting grades property to an empty new ArrayList
        this.attendence = new HashMap<>();
    }

    public String getName() {//getter
        return name;
    }

    public String getGrades() {
        String gradesL = "";
        for (int i = 0; i < grades.size(); i++) {
            gradesL = gradesL + grades.get(i) + " ";
        }
        return gradesL;
    }


    public void addGrade(int grade) {
        this.grades.add(grade);

    }
//         public double getGradeAverage(){// one way to iterate through the loop using for loop
//        double sum = 0;
//        for(int i= 0; i < grades.size(); i++ ){
//            sum += grades.get(i);//.get gets grade at the i
//        }
//        return sum/grades.size();
//         }

    public double getGradeAverage() {// another way to iterate through the loop using for loop
        double sum = 0;
        for (double grade : grades) {
            sum += grade;//
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student James = new Student("James");
        Student Jackie = new Student("Jackie");
        James.addGrade(67);
        James.addGrade(94);
        James.addGrade(98);
        James.addGrade(60);
        Jackie.addGrade(50);
        Jackie.addGrade(50);
        Jackie.addGrade(50);
        Jackie.addGrade(50);
        System.out.println(James.grades);
        System.out.println(James.getGradeAverage());
        System.out.println(Jackie.grades);
        System.out.println(Jackie.getGradeAverage());


    }
}
