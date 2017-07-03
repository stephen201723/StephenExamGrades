import java.util.Scanner;

public class PracticeStudentDemo{
    
	public static void main(String args []) {
      
		Scanner input = new Scanner(System.in);//This was created for non-string input
        Scanner cinput = new Scanner(System.in);//This was created for string input from the keyboard 
        PracticeStudent ps = new PracticeStudent();
       
        int option = 0;//declare and initialise option which is used as a variable for exiting the while loop below and for controlling the 
        //switch statement cases also.
        int signal = 0;//declare and initialise the flag variable
        String choices[] = {"a. Java", "b. Irish", "c. Maths " , "d. Science", "e.English"};
                            // 0        // 1        // 2          // 3          // 4
        
        while(option !=4){
            //The following is the main menu
            System.out.println("Welcome to student test Report");
            System.out.println("1. Enter student details");
            System.out.println("2. Get Student Report");            
            System.out.println("3. You have chosen option 3 to get subjectStatus");
            System.out.println("4. Quit");
            System.out.println("Enter an option from the above menu");
            
            option = input.nextInt();//assigns user input from scanner to this variable called option
            
            switch(option){//the option variable is placed in the switch statement function so whichever number is entered 1 for example
                           //brings the user to case 1: if 2 is entered it brings the user to case 2
                case 1:
                    System.out.println("You have chosen option 1 to enter student details");
                    System.out.println("Generating Student number");
                    System.out.println("Please enter a name");//Prompts user to enter a name
                    ps.setStudentDetails(ps.studentNumber(), cinput.nextLine());//The studentNumber method is called and passed as an argument for 
                    //number , the second argument cinput.nextLine()
                   
                    for(int i=0; i<5; i++){
                    System.out.println("Can you now enter the marks for the subject: "+choices[i]);
                    ps.setMarks(input.nextInt(), i+1);// the i+1 goes is the argument passed for int subjectId
                    //which is also the argument in the switch statement so i+1 will pass the argument 1
                    // so java will go to case 1: in the switch statement
                   }
                    signal = 1;//signal is assigned a value of 1 here because the values have been entered for student details
                break;
                    
                case 2:
                    if(signal !=0){//
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
                        System.out.println("a. Java \n"+
                                "b. Irish \n"+
                                "c. Maths \n"+
                                "d. Science \n"+
                                "e. English");                        
                        
                       
                      //  System.err.println("input.nextInt() #################" + input.nextInt());
                  //      chosen = input.nextInt();
                        
                        ps.subjectStatus(ps.getMarks(chosen = input.nextInt()));
                       System.err.println("input.nextInt() #################" + input.nextInt());
                        System.out.println("you have chosen "+choices[chosen]);
                     System.out.println("The Percentage Grade for "+choices[chosen] + " was " + ps.getMarks(chosen) + "%");
                       System.out.println("The Pass or Fail Grade for "+choices[chosen]+" was "+ps.subjectStatus(ps.getMarks(chosen)));                                               
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