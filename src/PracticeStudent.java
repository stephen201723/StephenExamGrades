import java.util.Random;

public class PracticeStudent{
	
	int studentNumber;
    int ROLL_NUM_MAX = 99999;
    int ROLL_NUM_MIN = 1000;
    int totalGrade = 0;
    int percentage = 0;
    int cMarks;    
    String finalGrade;
    String status;
    String studentName;
    int subject[] = new int [5];
    
    public int studentNumber(){
        Random in = new Random();
        int number = in.nextInt(ROLL_NUM_MAX-ROLL_NUM_MIN)+ROLL_NUM_MIN ;
        
        return number;
    }
    public void setStudentDetails(int studentNumber, String studentName){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    
    public void setMarks(int marks, int subjectId){
        cMarks = marks = ((marks > 0 && marks < 100 ? marks : 0));
        
        switch(subjectId){
            case 0:
                subject[0] = marks;
                break;
                
            case 1:
                subject [1] = marks;
                break;
                
            case 2: 
                subject [2] = marks;
                break;
                 
            case 3: 
                subject [3] = marks;
                break;
                
            case 4: 
                subject [4] = marks;
                break;
        }   
    }    
    
    public void calculateGrade(){
      //  int fail = 454;
        int total = 0;
        
        for(int i=0; i<5; i++){
            total = total + subject[i];
        }
        totalGrade = total;
        percentage = totalGrade/5;
        
        if(percentage >= 80){
            finalGrade = "A";
            status = "PASS";
        }
        if(percentage >= 60 && percentage <80){
            finalGrade = "B";
            status = "PASS";
        }
        if(percentage >=40 && percentage<60){//Will give null if all marks are 40 if you leave percentage here as >40 instead of >=40
            finalGrade = "C";
            status = "PASS";
        }
        if(percentage >0 && percentage<40){
            //total = percentage - fail;
            finalGrade = "F";
            status = "FAIL";
        }
    
        if(subject [0] < 40){
            finalGrade = "F";
            status = "FAIL";
        }
        if(subject [1] < 40){
            finalGrade = "F";
            status = "FAIL";
        }
        if(subject [2] < 40){
            finalGrade = "F";
            status = "FAIL";
        }
        if(subject [3] < 40){
            finalGrade = "F";
            status = "FAIL";
        }
        if(subject [4] < 40){
            finalGrade = "F";
            status = "FAIL";
        }
    }
    
    public void getSummary(){
    	String choices [] = {"a. Java ", "b. Irish ", "c. Maths " , "d. Science ", "e. English "};
        System.out.println("The student name is:" + studentName);
        System.out.println("The student number is: " + studentNumber);
        
        for(int i=0; i<5; i++){
        	System.out.println("The marks in subject " + choices[i] + "are: " + subject[i]);
        }
       
        System.out.println("Total Marks: " + totalGrade);
        System.out.println("Result: " + status);
        System.out.println("Grade: " + finalGrade);
    }
    
    public int getMarks(int subjectId){
        switch(subjectId){
            
            case 0:
                cMarks = subject [0]; ///correct...correct
                break;
            case 1:
                cMarks = subject [1]; ///correct...correct
                break;
            case 2:
                cMarks = subject [2]; ///correct...correct
                break;
            case 3:
                cMarks = subject [3]; ///correct...correct
                break;
            case 4:
                cMarks = subject [4]; ///correct...correct
                break;
        }
        
        return cMarks;
    }    
    
    public String subjectStatus(int marks){
        if(cMarks >=40){
        return "PASS";
        }
        else{
            return "FAIL";
        }
    }
}

