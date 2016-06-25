import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   protected String firstName;
   protected String lastName;
   int phone;
   Student(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;
       
   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
   }

}



class Grade extends Student{
	
   Grade(String fname, String lname, int p,int s) {
		super(fname, lname, p);
		score=s;
		
	}
private int score;
   private String firstName;
   private String lastName;
   private int phone; 

    public char calculate(){
        if (score<40){
            return 'D';
        }
        if(score>39 && score<60){
            return 'B';
        }
        if (score>59 && score<75){
            return 'A';
        }
        if(score>74 && score<90){
            return 'E';
        }
        else{
            return 'O';
        }
    }
    
   
}
public class A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());
        
    }
}