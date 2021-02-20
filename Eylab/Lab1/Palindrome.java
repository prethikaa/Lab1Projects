package Lab1;

import java.util.Scanner;

public class Palindrome {


	    public static void main(String[] args) {

	        int num, reversedInteger = 0, remainder, originalInteger;
	        int temp = 0 ;
	        int c=0;
	        int a;
	        Scanner s = new Scanner(System.in);
		    num=s.nextInt();
	        
	        originalInteger = num;

	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	        temp = num;
	        while(num>0)  
	        {  
	        a=num%10;  
	        num=num/10;  
	        c= c +(a*a*a);  
	        } 
	        int sum = 0;
			if(temp==c)  
	            System.out.println("armstrong number"); 
	        else
	        	for(int i = 1; i < num; i++)
	            {
	                if(num % i == 0)
	                {
	                    sum = sum + i;
	                }
	            }
	            if(sum == num)
	            {
	                System.out.println("Given number is Perfect");
	            }
	            else
	            	System.out.println("Not a palindrome or amstrong or perfect number");
	    }

}
