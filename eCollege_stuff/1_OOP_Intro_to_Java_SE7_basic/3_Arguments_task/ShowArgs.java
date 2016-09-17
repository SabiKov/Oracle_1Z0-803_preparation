/*
	Author: Szabolcs Kovacs
	
	1.3 Arguments
		1. In the programs you have encountered so far, you will have seen that 
			the main method used something like this: public static void main(String[] args)
		2. The args part of the program can accept values (parameters) when the program is called (run).  
			Write a Java program called ShowArgs using Using Notepad++ or another plain code editor. 
			This java program should accept two command line arguments 
			when you are running the program. It should then output these arguments.  
			Note: You will need to research outside of the course contents to 
			complete this part of the assignment. 
			Include comments to show that you understand fully what 
			the program is doing. Compile and run this .java source code 
			from a command line.  Place the command line arguments as 
			words after the program name when you are running 
			it with spaces between them, as in apples and oranges below.

			Example: 
				javac ShowArgs.java 
				java ShowArgs apples oranges 
				apples oranges 
*/

public class ShowArgs {
	
	//Main Java method in order to run the code
	public static void main(String[] args) {
		
		//Method Invokation, passing args 
		displayArguments(args);

	} // end main
	
	// Display values of passed arguments 
	public static void displayArguments(String[] str) {
		
		//make sure the args values are passed
		if(str.length > 1){
			System.out.println("The first argument: " + str[0] + " and the second argument: " + str[1]);
		}
		else {
			System.out.println("Hey! You did not pass enough args's values, please try again!" );
		}
	} // end displayArguments()
	
} // end class