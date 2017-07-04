package ExamGrader;
import java.util.Scanner;

public class PracticeStudentDemo{
    
	public static void main(String args []) {
      
		Scanner input = new Scanner(System.in);  // Scanner input needs to be closed when finished with
     
        PracticeStudent ps = new PracticeStudent();
       
        int option = 0;
        int flag = 0;
        
        String choices[] = {"a. Java", "b. Irish", "c. Maths ", "d. Science", "e.English"};
                            // 0        // 1        // 2          // 3          // 4
        while(option !=4){
     
            System.out.println("Welcome to student test Report");
            System.out.println("1. Enter student details");
            System.out.println("2. Get Student Report");            
            System.out.println("3. You have chosen option 3 to get subjectStatus");
            System.out.println("4. Quit");
            System.out.println("Enter an option from the above menu");
            
            option = input.nextInt();	
            System.out.println(option);
           
            switch(option){	
            
                case 1: 
                    System.out.println("You have chosen option 1 to enter student details");
                    System.out.println("Generating Student number");
                    // .nextLine() advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line. 
                    String studentName = input.nextLine(); 
                    System.out.println("Please enter a name");
                    studentName = input.nextLine();
                    input.reset();
                    
                    ps.setStudentDetails(ps.studentNumber(), studentName); 
 
                    for(int i=0; i<5; i++){
                    	System.out.print("Can you now enter the marks for the subject: " + choices[i] + " ");
                    	
                    	int marks = input.nextInt();
                    	
                    	ps.setMarks(marks, i);
                    }
                    flag = 1;
                break;
                    
                case 2:
                    if(flag !=0) {
                    	System.out.println("You have entered option 2 to get student Report");
                    	ps.calculateGrade();
                    	ps.getSummary();
                    }
                    else{
                        System.out.println("you must enter student details first");
                    }
                    break;                             
                    
                case 3:
                	System.out.println("You have chosen option 3 to get marks");
                    int chosen;
                    for(int i=0;i<5;i++){
                    	System.out.println("Type in an option either 0,1,2,3,4 from the list below");
                        System.out.println("0. Java \n" + "1. Irish \n" + "2. Maths \n" + "3. Science \n" + "4. English");                        
                        
                        chosen = input.nextInt();
                        		
                        ps.subjectStatus(ps.getMarks(chosen));
                      
                        System.out.println("you have chosen " + choices[chosen]);
                        System.out.println("The Percentage Grade for " + choices[chosen] + " was " + ps.getMarks(chosen) + "%");
                        System.out.println("The Pass or Fail Grade for " + choices[chosen] +" was " + ps.subjectStatus(ps.getMarks(chosen)));                                               
                }
                break;
                    
                case 4:
                    System.out.println("You have chosen option 4 to Quit");
                    System.out.println("goodbye");
                    break;        
            }
        }
    }
}