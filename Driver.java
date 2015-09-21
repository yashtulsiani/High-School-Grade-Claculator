import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.io.*;
/* 
 * Program designed to output what is required by a certain student on their final exam given both test scores.
 * The grades for each student are stored into an ArrayList of Student objects
 * Each student object contains the first and second semester grades of a student
 * The final exam score needed is calculated in the GradeSet object
 * Loads data in file at start of program. Saves data at end of program at request.
 */
public class Driver
{
public static void main(String[] args) throws IOException
{
runner();
}
public static void runner() throws IOException
{
    ArrayList<Student> studentList = new ArrayList<>();//arrayList that stores student information created
    boolean menuOpen=true;//declares and lets system go through loop first time
    Icon icon = new ImageIcon("saxons.jpg");//image declared for the welcome screen
    Icon zickertNow=new ImageIcon("ZickertNow.jpg");
    Icon zickertYoung=new ImageIcon("ZickertYoung.jpg");
    JFrame frame = new JFrame();//JFrame delared for use throughout system
    File dataFile = new File("studentData.txt");//declares data file that needs to be took for the system to load data
    BufferedReader br = new BufferedReader(   //next few lines used to take data from the studentData.txt file
        new InputStreamReader(new FileInputStream(dataFile)));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                String[] theParts= line.split(" ");
                int fileID = Integer.parseInt(theParts[0]);
                String fileGradeOne=theParts[1];
                String fileGradeTwo=theParts[2];
                Student fileStudent = new Student(fileID, fileGradeOne, fileGradeTwo);
                studentList.add(fileStudent);
            }
        } finally {
                    br.close();}//end taking data from studentData.txt fuke
    String welcomeMessage = "Hello User!\nThis program is designed to store semester grades for students in a certain class.\nThe program can additionally calculate what a student needs on their final exam.\nYou require student IDs & both semester grades to continue!";
    String optionMenuDialog = "Enter one of the following choices: \n 1. Add a student \n 2. Access student data \n 3. Edit student data \n 4. Delete student \n 5. Exit";
    JOptionPane.showMessageDialog(frame, welcomeMessage, "WELCOME",  JOptionPane.INFORMATION_MESSAGE, icon);//Pane that shows you what the program does and how to use
    int optionNumber=0;//optionNumber declared for menu use
    while(menuOpen == true)
    {
      String optionMenu = JOptionPane.showInputDialog(optionMenuDialog);
      try{
       optionNumber = Integer.parseInt(optionMenu);}
      catch (NumberFormatException e) {}
      switch(optionNumber){
        case 1://Will create a new student object that stores both semester grades and the student ID
                boolean caseOneMenu=true;
                int newStudentID=0;
                while(caseOneMenu==true)
                {
                        while(caseOneMenu){
                        caseOneMenu=false;
                        String newStudentIDString = JOptionPane.showInputDialog("Enter the student ID");
                        try {
                              newStudentID=Integer.parseInt(newStudentIDString);
                        }
                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(frame, "Enter a valid ID!", "WARNING",  JOptionPane.WARNING_MESSAGE);
                            caseOneMenu=true;
                        }
                    }
                    caseOneMenu=false;
                    for(int x=0; x<studentList.size(); x++)
                    {
                        if(studentList.get(x).getID() == newStudentID)
                        {
                         JOptionPane.showMessageDialog(frame, "Student already exists, use option 2 to edit student data", "WARNING",  JOptionPane.WARNING_MESSAGE);
                         caseOneMenu=true;
                        }
                    }        
                }
                if(caseOneMenu==false)
                {
                    String stuOne = GradeSet.createGradeLooper("first");
                    String stuTwo = GradeSet.createGradeLooper("second");
                    Student genericStudent = new Student(newStudentID, stuOne, stuTwo);
                    studentList.add(genericStudent);
                }
                break;
        case 2: //lets user access data for user in the system
                boolean menuOptionTwo=true;
                int checkIDC2=0;
                if(studentList.size()==0)
                {
                    JOptionPane.showMessageDialog(frame, "Create a new student first. Use option 1 to do this", "Warning",  JOptionPane.WARNING_MESSAGE);
                }
                else{
                    while(menuOptionTwo){
                        menuOptionTwo=false;
                        String checkIDStringC2 = JOptionPane.showInputDialog("Enter ID of student you want to access");
                            try {
                              checkIDC2=Integer.parseInt(checkIDStringC2);
                            }
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(frame, "Enter a valid ID!", "Warning",  JOptionPane.WARNING_MESSAGE);
                                menuOptionTwo=true;
                            }
                    }
            }
                for(int x=0; x<studentList.size(); x++) //Searches the array and finds the information by the given student ID
                {
                    if(studentList.get(x).getID() == checkIDC2)
                    {
                        Student theNeededStudent = studentList.get(x);
                        System.out.println(theNeededStudent);
                        break;
                    }
                    else if(!(studentList.get(x).getID() == checkIDC2) && x==studentList.size()-1) 
                    {
                        JOptionPane.showMessageDialog(frame, "Student not found.\nUse option 1 to create a new student", "WARNING",  JOptionPane.WARNING_MESSAGE);
                    }
                }
                break;
        case 3://lets user edit a user that is already present in the system
                boolean menuOptionThree=true;
                int checkIDC3=0;
                if(studentList.size()==0)
                {
                    JOptionPane.showMessageDialog(frame, "Create a new student first. Use option 1 to do this", "WARNING",  JOptionPane.WARNING_MESSAGE);
                }
                else{
                    while(menuOptionThree){
                    menuOptionThree=false;
                    String checkIDStringC3 = JOptionPane.showInputDialog("Enter ID of student you want to access");
                        try {
                              checkIDC3=Integer.parseInt(checkIDStringC3);
                        }
                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(frame, "Enter a valid ID!", "WARNING",  JOptionPane.WARNING_MESSAGE);
                            menuOptionThree=true;
                        }
                }
            }
                boolean forC3Loop=true;
                int z=0;
                while(forC3Loop) //loop checks for the user in the studentList array
                {
                if(z>=studentList.size())
                    forC3Loop=false;
                if(forC3Loop){
                    if(studentList.get(z).getID() == checkIDC3) //if user is found
                    {
                        String editOne = GradeSet.createGradeLooper("first"); //asks and verifys input for new first grade
                        String editTwo = GradeSet.createGradeLooper("second"); //asks and verifys input for new second grade
                        Student editStudent = new Student(checkIDC3,editOne,editTwo);
                        studentList.set(z, editStudent); //deletes old student data and replaces it with the new student data
                        forC3Loop=false;//ends th
                    }
                   else if(!(studentList.get(z).getID() == checkIDC3) && z==studentList.size()-1) 
                    {
                        JOptionPane.showMessageDialog(frame, "Student not found.\nUse option 1 to create a new student", "WARNING",  JOptionPane.WARNING_MESSAGE);
                    }
                    z++;
                }
            }
                break;
        case 4://command that lets user delete a student
                boolean menuOptionSix=true;
                int checkIDC6=0;
                if(studentList.size()==0)
                {
                    JOptionPane.showMessageDialog(frame, "Create a new student first. Use option 1 to do this", "WARNING",  JOptionPane.WARNING_MESSAGE);
                }
                else{
                    while(menuOptionSix){
                    menuOptionSix=false;
                    String checkIDStringC6 = JOptionPane.showInputDialog("Enter ID of student you want to delete");
                    if(checkIDStringC6.equals("")){
                        menuOptionSix=true;
                        JOptionPane.showMessageDialog(frame, "Enter a valid ID!", "Warning",  JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                     checkIDC6 = Integer.parseInt(checkIDStringC6);//gets the ID of the student
                    }
                }
                for(int x=0; x<studentList.size(); x++) //loop checks for the user in the studentList array
                {
                    if(studentList.get(x).getID() == checkIDC6) //if user is found
                    {
                        studentList.remove(x);
                    }
                   else if(((x==studentList.size()-1) && (studentList.get(x).getID() != checkIDC6)) || studentList.size() == 0)
                    {
                        JOptionPane.showMessageDialog(frame, "Student not found.\nUse option 1 to create a new student", "Warning",  JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
                break;
        case 5://exit command. Gives user option to save the data.
               int dialogButton=JOptionPane.showConfirmDialog(null,"Would you like to save the changed data before exiting?","Save" , JOptionPane.YES_NO_OPTION);//asks user if wants to save data
                if(dialogButton == JOptionPane.YES_OPTION){ //if user desides to save data, the next few lines will overwrite and save data to studentData.txt
                String content="";
                String NEW_LINE = System.getProperty("line.separator");  
                for(int x=0; x<studentList.size();x++)
                {
                    content= content + studentList.get(x).getID() + " " + studentList.get(x).getFirstGrade()+ " " + studentList.get(x).getSecondGrade()+ NEW_LINE;
                }
                try {
                    File file = new File("studentData.txt");
                 if (!file.exists()) {
                     file.createNewFile();
                }
                  FileWriter fw = new FileWriter(file.getAbsoluteFile());
                  BufferedWriter bw = new BufferedWriter(fw);
                  bw.write(content);
                  bw.close();
                  JOptionPane.showMessageDialog(frame, "Sucessfully wrote to file", "Done",  JOptionPane.INFORMATION_MESSAGE);
                } 
                     catch (IOException e) {
                     e.printStackTrace();
                 }
               }//end lines to save data to studentData.txt
                JOptionPane.showMessageDialog(frame, "Goodbye!\nProgram Design by Yash Tulsiani\nMay 2013", "Goodbye",  JOptionPane.INFORMATION_MESSAGE, zickertNow);
                menuOpen = false;//ends the loop, letting the menuOpen loop terminate
                break;
        default://tells user that imput was not a valid option
                JOptionPane.showMessageDialog(frame, "Not a valid choice!\nPlease try again or enter 5 to exit", "Warning", JOptionPane.WARNING_MESSAGE, zickertYoung);
                break;
            }
    }
}
}