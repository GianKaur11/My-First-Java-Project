package swapTwoNumbers;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	int num1,num2,temp;
	
	Scanner input = new Scanner(System.in);
	
	void swapTwoNumbers() {
	

    System.out.println("Enter the value for num1");
	num1 = input.nextInt();
	
	System.out.println("Enter the value for num2");
	num2 = input.nextInt();
	
	System.out.printf("Before swapping num1 = %d and num2 = %d\n",num1,num2);
	
	//System.out.println("Before swapping num1 =");
	//System.out.println(num1);
	//System.out.println("num2 =");
	//System.out.println(num2);
	
    temp = num1;
    num1 = num2;
    num2 = temp;
    
    System.out.printf("After swapping num1 = %d and num2 = %d\n",num1,num2);
    
    //System.out.println("After swapping num1 =");
	//System.out.println(temp);
	//System.out.println("num2 =");
	//System.out.println(num1);	
		
	}

}
