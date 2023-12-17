package OOP_WEEK_10.TASK2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        List<Integer> gradeList = new ArrayList<>();

        gradeList.add(100);
        gradeList.add(99);
        gradeList.add(80);
        gradeList.add(100);
        gradeList.add(99);
        gradeList.add(95);

        Student student = new Student("Denis", 37, gradeList);

        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradeList);

        gradeAnalyzer.printInfo();


        Field[] myStudentFiels = student.getClass().getDeclaredFields();

        for (Field field : myStudentFiels){
            field.setAccessible(true);
            System.out.println("Fields in Student : " + field.getName());
        }

        Field [] myGradeAnalyzerFields = gradeAnalyzer.getClass().getDeclaredFields();

        for (Field field : myGradeAnalyzerFields){
            field.setAccessible(true);
            System.out.println("Fields in GradeAnalyzer : " + field.getName());
        }


        Method[] myStudentMethods = student.getClass().getDeclaredMethods();

        for (Method method : myStudentMethods){
            method.setAccessible(true);
            System.out.println("Methods in Student class : " + method.getName());
        }

        Method[] myGradeAnalyzerMethods = gradeAnalyzer.getClass().getDeclaredMethods();
        for (Method method : myGradeAnalyzerMethods){
            method.setAccessible(true);
            System.out.println("Methodsd in GradeAnalyzer class : " + method.getName());
        }

        for (Method method : myGradeAnalyzerMethods){
            if (method.getName().startsWith("calculate") || method.getName().startsWith("printInfo")){
                System.out.println("Method name : " + method.getName() + ", result : " + method.invoke(gradeAnalyzer));
            }
        }
    }
}
