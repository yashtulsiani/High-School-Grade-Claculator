import java.util.ArrayList;
public class Student
{
    private String gradeOne;
    private String gradeTwo;
    private int studentID;
    private String[] theScores;
    public Student(int idNumber, String firstGrade, String secondGrade)
    {
        studentID=idNumber;
        gradeOne=firstGrade;
        gradeTwo=secondGrade;
        theScores=possibleScores(gradeOne, gradeTwo);
    }
    public void setNewFirst(String firster)
    {
        gradeOne=firster;
    }
    public void setNewSecond(String seconder)
    {
        gradeTwo=seconder;
        
    }
        public String getFirstGrade()
    {
        return gradeOne;
    }
    public String getSecondGrade()
    {
        return gradeTwo;
    }
    public int getID()
    {
        return studentID;
    }
    public String[] possibleScores(String gradeOne, String gradeTwo)
    {
        double theTotal = scoreTotal(gradeOne, gradeTwo);
        String[] theScores = GradeSet.grades(theTotal);
        return theScores;
    }
    private double scoreTotal(String gradeOne, String gradeTwo)
    {
        double first=calculateNumberCode(gradeOne);
        double second=calculateNumberCode(gradeTwo);
        double scoreTotal=first+second;
        return scoreTotal;
    }
    private double calculateNumberCode(String grade)
    {
        if(grade.equals("A+"))
        return 8.6;
        else if(grade.equals("A"))
        return 8;
        else if(grade.equals("A-"))
        return 7.4;
        else if(grade.equals("B+"))
        return 6.6;
        else if(grade.equals("B"))
        return 6;
        else if(grade.equals("B-"))
        return 5.4;
        else if(grade.equals("C+"))
        return 4.6;
        else if(grade.equals("C"))
        return 4;
        else if(grade.equals("C-"))
        return 3.4;
        else if(grade.equals("D+"))
        return 2.6;
        else if(grade.equals("D"))
        return 2;
        else if(grade.equals("F"))
        return 0;
        return -999;
    }
        public String  toString()
    {
        String[] grading = theScores;
        String NEW_LINE = System.getProperty("line.separator");
        String printGrades = "";
        String beforeLine = "If you get ";
        String afterLine = " on your final, you have ";
        String overall = " in the class.";
        for(int x=0; x<grading.length; x++)
        {
            if(x==0)
                printGrades = beforeLine+"A+"+afterLine+grading[0]+overall+NEW_LINE;
            if(x==1)
                printGrades = printGrades + beforeLine+"A"+afterLine+grading[1]+overall+NEW_LINE;
            if(x==2)
                printGrades = printGrades + beforeLine+"A-"+afterLine+grading[2]+overall+NEW_LINE;
            if(x==3)
                printGrades = printGrades + beforeLine+"B+"+afterLine+grading[3]+overall+NEW_LINE;
            if(x==4)
                printGrades = printGrades + beforeLine+"B"+afterLine+grading[4]+overall+NEW_LINE;
            if(x==5)
                printGrades = printGrades + beforeLine+"B-"+afterLine+grading[5]+overall+NEW_LINE;
            if(x==6)
                printGrades = printGrades + beforeLine+"C+"+afterLine+grading[6]+overall+NEW_LINE;
            if(x==7)
                printGrades = printGrades + beforeLine+"C"+afterLine+grading[7]+overall+NEW_LINE;
            if(x==8)
                printGrades = printGrades + beforeLine+"C-"+afterLine+grading[8]+overall+NEW_LINE;
            if(x==9)
                printGrades = printGrades + beforeLine+"D+"+afterLine+grading[9]+overall+NEW_LINE;
            if(x==10)
                printGrades = printGrades + beforeLine+"D"+afterLine+grading[10]+overall+NEW_LINE;
            if(x==11)
                printGrades = printGrades + beforeLine+"F"+afterLine+grading[11]+overall+NEW_LINE;
        
        
        }
        return printGrades;
    }
}
