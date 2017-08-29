import java.util.*;
public class Assignment3 {
     public void pattern(int size,char c){
    	 for (int row=0;row<size;row++){
    		 for(int col=0;col<size;col++){
    			 if(row==col||(row+col)==size-1){
    				 System.out.print(c);
    			 }
    			 else{
    				 System.out.print(" ");
    			 }
    		 }
    		 System.out.println();
    	 }
     }
     
     public static void main(String args[]){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the size");
    	 int size=sc.nextInt();
    	 System.out.println("Enter the char");
    	 char c=sc.next().charAt(0);
    	 Assignment3 a=new Assignment3();
    	 a.pattern(size, c);
     }
     
}
