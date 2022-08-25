import java.util.*;
import java.io.*;
public class BT3 {
    private int age;
    public BT3(int initialAge){
        // Add some more code to run some checks on initialAge
        if(initialAge<0){
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            age=initialAge;
        }
        
    }
    public void amIOLD(){
        // Write code determining if this person's age is old and print the correct statement:
        String ans;
        if(age<13){
            ans="You are young.";
        }else if(age>=13 && age<18){
            ans="You are a teenager.";
        }else{
            ans="You are old.";
        }
        /*Insert correct print statement here*/
        System.out.println(ans);
    }
    public void yearPasses(){
        // Increment this person's age.
        age+=1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=0;i<n;i++){
            int age=sc.nextInt();
            BT3 person= new BT3(age);
            person.amIOLD();
            for(int j=0;j<3;j++){
                person.yearPasses();
            }
            person.amIOLD();
            System.out.println();
         }sc.close();
    }
    }

