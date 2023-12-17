package OOP_WEEK_10.TASK2;

import java.util.ArrayList;
import java.util.List;

public class GradeAnalyzer {

    private List<Integer> grades;


    public GradeAnalyzer(List<Integer> grades){
        this.grades = grades;
    }

    public double calculateGrade(){
        int average = 0;
        List<Double> gradeList = new ArrayList<>();
        for (Integer grade : grades){
            average+= grade;
            gradeList.add(Double.valueOf(grade));
        }
        return (double) average / grades.size();
    }

    public String printInfo(){
        return String.valueOf(grades);
    }
    
}
