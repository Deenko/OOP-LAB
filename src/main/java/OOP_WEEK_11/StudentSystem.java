package OOP_WEEK_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StudentSystem {

    List<Student> students;

    List<Integer> ints;

    public StudentSystem(String filename) {

        try {
            this.students = readFile(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public String toString() {
        return "STUDENTS : " + students;
    }


    public List<Student> readFile(String filename) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for (String l : lines) {
            String[] lineParts = l.split(",");
            Student ss = new Student(lineParts[0] != "" ? Integer.parseInt(lineParts[0]) : 000, lineParts[1], lineParts[2], lineParts[3], lineParts[4] != "" ? Double.parseDouble(lineParts[4]) : 000);
            students.add(ss);
        }
        bufferedReader.close();
        return students;
    }

    public Optional<Student> getStudentByIdOPTIONAL(int id) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getId() == id) return Optional.of(student);
        }
        throw new StudentNotFoundException("Student not found!");
    }


    public Student getStudentById(int id) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student does not exist!!!");
    }


    public Student getStudentByGPA(double GPA) throws EmptyStudentListException {
        for (Student student : students) {
            if (student.getGpa() == GPA) {
                return student;
            }
        }
        throw new EmptyStudentListException("List of students is empty");
    }


    public Student getLongestStudentName() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("STUDENT LIST IS EMPTY!");
        }
        Student megastudent = students.get(0);
        for (Student student : students) {
            if (student.getName().length() > megastudent.getName().length()) {
                megastudent = student;
            }
        }
        return megastudent;
    }


    public void studentListOrdered() {
        //A METHOD THAT ORDERS THE STUDENTS ALPHABETICALLY//

        List<String> studentList = new ArrayList<>();
        for (Student student : students) {
            studentList.add(String.valueOf(student));
        }
        Collections.sort(studentList);
        for (String student1 : studentList) {
            System.out.println(student1);
        }
    }


    public void GPAListOrdered() {

        //GETS AN ORDERED GPA LIST//

        List<Double> gpaList = new ArrayList<>();
        for (Student student : students) {
            gpaList.add(student.getGpa());
        }
        Collections.sort(gpaList);
        for (int i = gpaList.size() - 1; i > 0; i--) {
            System.out.println(gpaList.get(i));
        }
    }


    public void calculateAverageGPA() {
        List<Double> gpas = new ArrayList<>();
        for (Student student : students) {
            gpas.add(student.getGpa());
        }
        double average = 0.0;
        int i = 0;
        for (Student student : students) {
            average = average + gpas.get(i);
            i++;
        }
        System.out.println("Average grade is : " + average / i);
    }


    public void seeMostPopularDept() {
        List<String> allUnis = new ArrayList<>();

        for (Student student : students) {
            allUnis.add(student.getDepartment());
        }
        int current = 0;
        int Finance = 0;
        int InformationTechnologywithAccountingAnalytics = 0;
        int InnovationEntrepreneurshipandVentureDevelopment = 0;
        int InternationalBusiness = 0;
        int BusinessAnalytics = 0;
        int FinancialServices = 0;
        int AccountingAnalytics = 0;
        int DigitalMarketing = 0;

        for (int i = 0; i < allUnis.size() - 1; i++) {
            if (allUnis.get(i).equals("Finance")) {
                Finance++;
            } else if (allUnis.get(i).equals("International Business")) {
                InternationalBusiness++;
            } else if (allUnis.get(i).equals("Business Analytics")) {
                BusinessAnalytics++;
            } else if (allUnis.get(i).equals("Information Technology with Accounting Analytics")) {
                InformationTechnologywithAccountingAnalytics++;
            } else if (allUnis.get(i).equals("Financial Services")) {
                FinancialServices++;
            } else if (allUnis.get(i).equals("Innovation Entrepreneurship and Venture Development")) {
                InnovationEntrepreneurshipandVentureDevelopment++;
            } else if (allUnis.get(i).equals("Accounting Analytics")) {
                AccountingAnalytics++;
            } else if (allUnis.get(i).equals("Digital Marketing")) {
                DigitalMarketing++;
            }
        }

        System.out.println("Finance : " + Finance + "\nInternational Business : " + InternationalBusiness +
                "\nBusiness Analytics : " + BusinessAnalytics +
                "\nInformation Technology with Accounting Analytics : " + InformationTechnologywithAccountingAnalytics +
                "\nFinancial Services : " + FinancialServices +
                "\nInnovation Entrepreneurship and Venture Development : " + InnovationEntrepreneurshipandVentureDevelopment +
                "\nAccounting Analytics : " + AccountingAnalytics +
                "\nDigital Marketing : " + DigitalMarketing);

    }


    public Student getHighestGPA(){
        double GPA = 0;
        Student highestGPAStudent = null;
        for (Student student : students){
            if (student.getGpa() > GPA){
                GPA = student.getGpa();
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    public void studentList(){

        for (Student student : students){
            System.out.println("\nStudent name : " + student );
        }
    }
}
