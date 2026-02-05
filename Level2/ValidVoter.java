package Level2;
import java.util.*;

class StudentVoteChecker{
    public boolean EligibleTovote(int age){
        if(age<0){
            return false;
        }
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ValidVoter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans[]=new int[10];
        for(int i=0;i<10;i++){
            ans[i]=sc.nextInt();
        }

        StudentVoteChecker student=new StudentVoteChecker();
        for(int i=0;i<ans.length;i++){
            if(student.EligibleTovote(ans[i])){
                System.out.println("The student having age "+ans[i] +" is eligible to vote");
            }
            else{
                System.out.println("The student having age "+ans[i] +"  is not eligible to vote");
            }
        }

    }
    
}

