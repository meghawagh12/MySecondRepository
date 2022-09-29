package com.capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	//Integer a=10,b=20,result;
	//result=a+b;
	//System.out.println("Addition is :- "+result);

	Integer a=Integer.parseInt(args[0]);
	Integer b=Integer.parseInt(args[1]);
	Integer result=a+b;
	System.out.println("Sum is :- "+result);
        
    }
}
