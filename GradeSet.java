import java.util.ArrayList;
import javax.swing.*;
public final class GradeSet
{
    public GradeSet()
    {
    }
    /*
     * The array stores:
     * If you get A+ grade what grade you will get in class in 0
     * If you get A grade what you will get in calss in 1
     * A-=2 B+=3 B=4 B-=5 C+=6 C=7 C-=8 D+=9 D=10 F=11
     */
    public static String[] grades(double totalScore)
    {
        String[] possibleGrades = new String[12];
        if(totalScore==17.2)
        {
            possibleGrades[0]="A+";possibleGrades[1]="A+";possibleGrades[2]="A+";possibleGrades[3]="A";
            possibleGrades[4]="A";possibleGrades[5]="A";possibleGrades[6]="A";possibleGrades[7]="A-";
            possibleGrades[8]="A-";possibleGrades[9]="A-";possibleGrades[10]="A-";possibleGrades[11]="B+";
        }
        else if(totalScore==16.6)
        {
            possibleGrades[0]="A+";possibleGrades[1]="A";possibleGrades[2]="A";possibleGrades[3]="A";
            possibleGrades[4]="A";possibleGrades[5]="A";possibleGrades[6]="A-";possibleGrades[7]="A-";
            possibleGrades[8]="A-";possibleGrades[9]="A-";possibleGrades[10]="A-";possibleGrades[11]="B+";
        }
        else if(totalScore==16)
        {
            possibleGrades[0]="A";possibleGrades[1]="A";possibleGrades[2]="A";possibleGrades[3]="A";
            possibleGrades[4]="A-";possibleGrades[5]="A-";possibleGrades[6]="A-";possibleGrades[7]="A-";
            possibleGrades[8]="A-";possibleGrades[9]="B+";possibleGrades[10]="B+";possibleGrades[11]="B+";
        }
        else if(totalScore==15.4)
        {
            possibleGrades[0]="A";possibleGrades[1]="A";possibleGrades[2]="A-";possibleGrades[3]="A-";
            possibleGrades[4]="A-";possibleGrades[5]="A-";possibleGrades[6]="A-";possibleGrades[7]="B+";
            possibleGrades[8]="B+";possibleGrades[9]="B+";possibleGrades[10]="B";possibleGrades[11]="B";
        }
        else if(totalScore==15.2)
        {
            possibleGrades[0]="A";possibleGrades[1]="A-";possibleGrades[2]="A-";possibleGrades[3]="A-";
            possibleGrades[4]="A-";possibleGrades[5]="A-";possibleGrades[6]="A-";possibleGrades[7]="B+";
            possibleGrades[8]="B+";possibleGrades[9]="B+";possibleGrades[10]="B+";possibleGrades[11]="B";
        }
        else if(totalScore==14.8)
        {
            possibleGrades[0]="A-";possibleGrades[1]="A-";possibleGrades[2]="A-";possibleGrades[3]="A-";
            possibleGrades[4]="A-";possibleGrades[5]="A-";possibleGrades[6]="B+";possibleGrades[7]="B+";
            possibleGrades[8]="B+";possibleGrades[9]="B+";possibleGrades[10]="B+";possibleGrades[11]="B";
        }
        else if(totalScore==14.6)
        {
            possibleGrades[0]="A-";possibleGrades[1]="A-";possibleGrades[2]="A-";possibleGrades[3]="A-";
            possibleGrades[4]="A-";possibleGrades[5]="B+";possibleGrades[6]="B+";possibleGrades[7]="B+";
            possibleGrades[8]="B+";possibleGrades[9]="B+";possibleGrades[10]="B";possibleGrades[11]="B";
        }
        else if(totalScore==14)
        {
            possibleGrades[0]="A-";possibleGrades[1]="A-";possibleGrades[2]="A-";possibleGrades[3]="B+";
            possibleGrades[4]="B+";possibleGrades[5]="B+";possibleGrades[6]="B+";possibleGrades[7]="B+";
            possibleGrades[8]="B";possibleGrades[9]="B";possibleGrades[10]="B";possibleGrades[11]="B-";
        }
        else if(totalScore==13.4)
        {
            possibleGrades[0]="A-";possibleGrades[1]="B+";possibleGrades[2]="B+";possibleGrades[3]="B+";
            possibleGrades[4]="B+";possibleGrades[5]="B+";possibleGrades[6]="B";possibleGrades[7]="B";
            possibleGrades[8]="B";possibleGrades[9]="B";possibleGrades[10]="B";possibleGrades[11]="B-";
        }
        else if(totalScore==13.2)
        {
            possibleGrades[0]="A-";possibleGrades[1]="B+";possibleGrades[2]="B+";possibleGrades[3]="B+";
            possibleGrades[4]="B+";possibleGrades[5]="B+";possibleGrades[6]="B";possibleGrades[7]="B";
            possibleGrades[8]="B";possibleGrades[9]="B";possibleGrades[10]="B-";possibleGrades[11]="B-";
        }
        else if(totalScore==12.8)
        {
            possibleGrades[0]="B+";possibleGrades[1]="B+";possibleGrades[2]="B+";possibleGrades[3]="B+";
            possibleGrades[4]="B+";possibleGrades[5]="B";possibleGrades[6]="B";possibleGrades[7]="B";
            possibleGrades[8]="B";possibleGrades[9]="B-";possibleGrades[10]="B-";possibleGrades[11]="B-";
        }
        else if(totalScore==12.6)
        {
            possibleGrades[0]="B+";possibleGrades[1]="B+";possibleGrades[2]="B+";possibleGrades[3]="B+";
            possibleGrades[4]="B";possibleGrades[5]="B";possibleGrades[6]="B";possibleGrades[7]="B";
            possibleGrades[8]="B";possibleGrades[9]="B-";possibleGrades[10]="B-";possibleGrades[11]="B-";
        }
        else if(totalScore==12)
        {
            possibleGrades[0]="B+";possibleGrades[1]="B+";possibleGrades[2]="B";possibleGrades[3]="B";
            possibleGrades[4]="B";possibleGrades[5]="B";possibleGrades[6]="B";possibleGrades[7]="B-";
            possibleGrades[8]="B-";possibleGrades[9]="B-";possibleGrades[10]="B-";possibleGrades[11]="C+";
        }
        else if(totalScore==11.4)
        {
            possibleGrades[0]="B";possibleGrades[1]="B";possibleGrades[2]="B";possibleGrades[3]="B";
            possibleGrades[4]="B";possibleGrades[5]="B-";possibleGrades[6]="B-";possibleGrades[7]="B-";
            possibleGrades[8]="B-";possibleGrades[9]="B-";possibleGrades[10]="C+";possibleGrades[11]="C+";
        }
        else if(totalScore==11.2)
        {
            possibleGrades[0]="B";possibleGrades[1]="B";possibleGrades[2]="B";possibleGrades[3]="B";
            possibleGrades[4]="B-";possibleGrades[5]="B-";possibleGrades[6]="B-";possibleGrades[7]="B-";
            possibleGrades[8]="B-";possibleGrades[9]="B-";possibleGrades[10]="C+";possibleGrades[11]="C+";
        }
        else if(totalScore==10.8)
        {
            possibleGrades[0]="B";possibleGrades[1]="B";possibleGrades[2]="B";possibleGrades[3]="B-";
            possibleGrades[4]="B-";possibleGrades[5]="B-";possibleGrades[6]="B-";possibleGrades[7]="B-";
            possibleGrades[8]="B-";possibleGrades[9]="C+";possibleGrades[10]="C+";possibleGrades[11]="C+";
        }
        else if(totalScore==10.6)
        {
            possibleGrades[0]="B";possibleGrades[1]="B";possibleGrades[2]="B";possibleGrades[3]="B-";
            possibleGrades[4]="B-";possibleGrades[5]="B-";possibleGrades[6]="B-";possibleGrades[7]="B-";
            possibleGrades[8]="C+";possibleGrades[9]="C+";possibleGrades[10]="C+";possibleGrades[11]="C";
        }
        else if(totalScore==10)
        {
            possibleGrades[0]="B";possibleGrades[1]="B-";possibleGrades[2]="B-";possibleGrades[3]="B-";
            possibleGrades[4]="B-";possibleGrades[5]="B-";possibleGrades[6]="C+";possibleGrades[7]="C+";
            possibleGrades[8]="C+";possibleGrades[9]="C+";possibleGrades[10]="C+";possibleGrades[11]="C";
        }
        else if(totalScore==9.4)
        {
            possibleGrades[0]="B-";possibleGrades[1]="B-";possibleGrades[2]="B-";possibleGrades[3]="B-";
            possibleGrades[4]="C+";possibleGrades[5]="C+";possibleGrades[6]="C+";possibleGrades[7]="C+";
            possibleGrades[8]="C+";possibleGrades[9]="C";possibleGrades[10]="C";possibleGrades[11]="C";
        }
        else if(totalScore==9.2)
        {
            possibleGrades[0]="B-";possibleGrades[1]="B-";possibleGrades[2]="B-";possibleGrades[3]="B-";
            possibleGrades[4]="C+";possibleGrades[5]="C+";possibleGrades[6]="C+";possibleGrades[7]="C+";
            possibleGrades[8]="C+";possibleGrades[9]="C";possibleGrades[10]="C";possibleGrades[11]="C-";
        }
        else if(totalScore==8.8)
        {
            possibleGrades[0]="B-";possibleGrades[1]="B-";possibleGrades[2]="B-";possibleGrades[3]="C+";
            possibleGrades[4]="C+";possibleGrades[5]="C+";possibleGrades[6]="C+";possibleGrades[7]="C+";
            possibleGrades[8]="C";possibleGrades[9]="C";possibleGrades[10]="C";possibleGrades[11]="C-";
        }
        else if(totalScore==8.6)
        {
            possibleGrades[0]="B-";possibleGrades[1]="B-";possibleGrades[2]="C+";possibleGrades[3]="C+";
            possibleGrades[4]="C+";possibleGrades[5]="C+";possibleGrades[6]="C+";possibleGrades[7]="C";
            possibleGrades[8]="C";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="C-";
        }
        else if(totalScore==8)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C+";possibleGrades[2]="C+";possibleGrades[3]="C+";
            possibleGrades[4]="C+";possibleGrades[5]="C";possibleGrades[6]="C";possibleGrades[7]="C";
            possibleGrades[8]="C";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="C-";
        }
        else if(totalScore==7.4)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C+";possibleGrades[2]="C+";possibleGrades[3]="C";
            possibleGrades[4]="C";possibleGrades[5]="C";possibleGrades[6]="C";possibleGrades[7]="C";
            possibleGrades[8]="C-";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="D+";
        }
        else if(totalScore==7.2)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C+";possibleGrades[2]="C+";possibleGrades[3]="C";
            possibleGrades[4]="C";possibleGrades[5]="C";possibleGrades[6]="C";possibleGrades[7]="C-";
            possibleGrades[8]="C-";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="D+";
        }
        else if(totalScore==6.8)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C+";possibleGrades[2]="C";possibleGrades[3]="C";
            possibleGrades[4]="C";possibleGrades[5]="C";possibleGrades[6]="C-";possibleGrades[7]="C-";
            possibleGrades[8]="C-";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="D+";
        }
        else if(totalScore==6.6)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C+";possibleGrades[2]="C";possibleGrades[3]="C";
            possibleGrades[4]="C";possibleGrades[5]="C";possibleGrades[6]="C-";possibleGrades[7]="C-";
            possibleGrades[8]="C-";possibleGrades[9]="C-";possibleGrades[10]="C-";possibleGrades[11]="D+";
        }
        else if(totalScore==6)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C";possibleGrades[2]="C";possibleGrades[3]="C";
            possibleGrades[4]="C-";possibleGrades[5]="C-";possibleGrades[6]="C-";possibleGrades[7]="C-";
            possibleGrades[8]="C-";possibleGrades[9]="D+";possibleGrades[10]="D+";possibleGrades[11]="D+";
        }
        else if(totalScore==5.4)
        {
            possibleGrades[0]="C+";possibleGrades[1]="C";possibleGrades[2]="C-";possibleGrades[3]="C-";
            possibleGrades[4]="C-";possibleGrades[5]="C-";possibleGrades[6]="C-";possibleGrades[7]="D+";
            possibleGrades[8]="D+";possibleGrades[9]="D+";possibleGrades[10]="D+";possibleGrades[11]="D";
        }
        else if(totalScore==5.2)
        {
            possibleGrades[0]="C";possibleGrades[1]="C-";possibleGrades[2]="C-";possibleGrades[3]="C-";
            possibleGrades[4]="C-";possibleGrades[5]="C-";possibleGrades[6]="C-";possibleGrades[7]="D+";
            possibleGrades[8]="D+";possibleGrades[9]="D+";possibleGrades[10]="D+";possibleGrades[11]="D";
        }
        else if(totalScore==4.6)
        {
            possibleGrades[0]="C-";possibleGrades[1]="C-";possibleGrades[2]="C-";possibleGrades[3]="C-";
            possibleGrades[4]="C-";possibleGrades[5]="D+";possibleGrades[6]="D+";possibleGrades[7]="D+";
            possibleGrades[8]="D+";possibleGrades[9]="D+";possibleGrades[10]="D";possibleGrades[11]="D";
        }
        else if(totalScore==4)
        {
            possibleGrades[0]="C-";possibleGrades[1]="C-";possibleGrades[2]="C-";possibleGrades[3]="D+";
            possibleGrades[4]="D+";possibleGrades[5]="D+";possibleGrades[6]="D+";possibleGrades[7]="D+";
            possibleGrades[8]="D";possibleGrades[9]="D";possibleGrades[10]="D";possibleGrades[11]="D-";
        }
        else if(totalScore==3.4)
        {
            possibleGrades[0]="C-";possibleGrades[1]="C-";possibleGrades[2]="D+";possibleGrades[3]="D+";
            possibleGrades[4]="D+";possibleGrades[5]="D+";possibleGrades[6]="D";possibleGrades[7]="D";
            possibleGrades[8]="D";possibleGrades[9]="D";possibleGrades[10]="D";possibleGrades[11]="D-";
        }
        else if(totalScore==2.6)
        {
            possibleGrades[0]="D+";possibleGrades[1]="D+";possibleGrades[2]="D+";possibleGrades[3]="D+";
            possibleGrades[4]="D";possibleGrades[5]="D";possibleGrades[6]="D";possibleGrades[7]="D";
            possibleGrades[8]="D";possibleGrades[9]="D";possibleGrades[10]="D-";possibleGrades[11]="D-";
        }
        else if(totalScore==2)
        {
            possibleGrades[0]="D+";possibleGrades[1]="D+";possibleGrades[2]="D";possibleGrades[3]="D";
            possibleGrades[4]="D";possibleGrades[5]="D";possibleGrades[6]="D";possibleGrades[7]="D-";
            possibleGrades[8]="D-";possibleGrades[9]="D-";possibleGrades[10]="D-";possibleGrades[11]="F";
        }
        else if(totalScore==0)
        {
            possibleGrades[0]="D";possibleGrades[1]="D-";possibleGrades[2]="D-";possibleGrades[3]="D-";
            possibleGrades[4]="D-";possibleGrades[5]="F";possibleGrades[6]="F";possibleGrades[7]="F";
            possibleGrades[8]="F";possibleGrades[9]="F";possibleGrades[10]="F";possibleGrades[11]="F";
        }
        
        return possibleGrades;
    }
    public static String createGradeLooper(String optionNumber)
    {
        boolean caseOneLoop = true;
        String grade="";
        String gradeCreateOne="";
                while(caseOneLoop==true)
                {
                    caseOneLoop=false;
                    JFrame frame = new JFrame("Welcome");
                    String newStudentGradeOne = JOptionPane.showInputDialog("Enter " + optionNumber + " semester grade:\n1.A+\n2.A\n3.A-\n4.B+\n5.B\n6.B-\n7.C+\n8.C\n9.C-\n10.D+\n11.D/D-\n12.F+/F/F-");
                    if(newStudentGradeOne.equals("1")||newStudentGradeOne.equals("2")||newStudentGradeOne.equals("3")||newStudentGradeOne.equals("4")||newStudentGradeOne.equals("5")||newStudentGradeOne.equals("6")||newStudentGradeOne.equals("7")||newStudentGradeOne.equals("8")||newStudentGradeOne.equals("9")||newStudentGradeOne.equals("10")||newStudentGradeOne.equals("11")||newStudentGradeOne.equals("12")) {
                    int grOne = Integer.parseInt(newStudentGradeOne);
                    gradeCreateOne= createLetterGrade(grOne);}
                    else{gradeCreateOne="FALSE";}
                        if(gradeCreateOne.equals("FALSE"))
                        {
                            JOptionPane.showMessageDialog(frame, "Not a valid option!\nTry again!", "INPUT ERROR",JOptionPane.WARNING_MESSAGE);
                            caseOneLoop=true;
                        }
                    grade = gradeCreateOne.toUpperCase();
                }
        return grade;
    }
    public static String createLetterGrade(int gradeNumber)
    {
        switch(gradeNumber)
        {
            case 1: return "A+";
            case 2: return "A";
            case 3: return"A-";
            case 4: return "B+";
            case 5: return "B";
            case 6: return "B-";
            case 7: return "C+";
            case 8: return"C";
            case 9: return "C-";
            case 10: return "D+";
            case 11: return "D";
            case 12: return "F";
            default: return "FALSE";
        }
    }
}
