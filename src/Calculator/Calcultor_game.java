package Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calcultor_game {
	
	
	
	
	static void mul()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  first number:");
		int no=sc.nextInt();
		System.out.println("Enter your second number:");
		int no2=sc.nextInt();
		int c=no*no2;
		System.out.println("Multiplication is :" + c);
		
	}
	
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
        int no=sc.nextInt();
        System.out.println("Enter second number:");
        int no2=sc.nextInt();

        int c=no+no2;
         System.out.println("Addition of two number is :" + c);


		
	}
	
	
	static void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();

        int e=b-a;
       System.out.println("Subtraction of two number is :" + e);
	
	}
	
	
	static void div()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();

        int e=b/a;
       System.out.println("Division of two number is :" + e);
	
		
	}
	
	static void per()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();

        int e=b%a;
       System.out.println("Percentage of two number is :" + e);
		
	}
	
	
	
	static void fib()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first fibonacci number ");
		int fib1=sc.nextInt();
		System.out.println("Enter your second  fibonacci number ");
		int fib2=sc.nextInt();
		System.out.print(fib1 + " " + fib2);
		
		for(int i=1;i<=5;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(" "+ fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
	}
	
	
	
	
	static void evenorodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Its even no:");
			
		}
		else
		{
			System.out.println("Its an odd number:");
		}
	}
	
	
	
	
	
	static void factor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the given number is " + fact);
		
	}
	
	
	
	
	static void Prime()
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		
		for(int i=2;i<no;i++)
		{
			if(no%2==0)
			{
				flag=false;
				break;
				
				
			}
			
			
		}
		if(flag==true)
		{
			System.out.println("Its a prime no:");
			
		}
		else
		{
			System.out.println("Not a prime number:");
		}
	}
	
	
	
	
	static void armstrong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Armstrong number verified:");
			
		}
		else
		{
			System.out.println("Not an Armstrong number:");
		}
	}
	static void strong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
				
			}
			sum=sum+ fact;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Strong number verified:");
			
		}
		else
		{
			System.out.println("Not a Strong number:");
		}
	}
		
	static void numberrev()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println("The reverse of the given number is : " + rev);
		
	}
	
	static void numberpalin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		if(copy==rev)
		{
			System.out.println("Number Palindrome verified:");
			
		}
		else
		{
			System.out.println("Not a number Palindrome:");
		}
		
	}
	
	static void stringrev()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("Reverse of the given String is:" + s2);
		
	}
	
	static void stringpalin()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		if(s2.equals(s1))
	       {
			System.out.println("Its a String Palindrome:");
			
		}
		else
		{
			System.out.println("Its not a String Palindrome");
		}
		
	}
	
	static void vowels()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.println(s1.charAt(i));
				
			}
			
		}
		
	}
	
	static void consonants()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!='a'&&s1.charAt(i)!='e'&&s1.charAt(i)!='i'&&s1.charAt(i)!='o'&&s1.charAt(i)!='u')
			{
				System.out.println(s1.charAt(i));
				
			}
			
		}
		
	}
	
	static void sumofeven()
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		for(int i=no;i<=10;i++)
		{
			if(no%2==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("Sum of Even numbers from given range is:" + sum);
		
	}
		
	static void sumofodd()
	{
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter your number:");
		int no=sc.nextInt();
		for(int i=no;i<=10;i++)
		{
			if(no%2!=0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("Sum of Odd numbers from given range is:" + sum);
		
		
	}
	
	static void anagram()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  your 1st String value:");
		String s1=sc.next();
		System.out.println("Enter  your 2nd String value:");
		
		String s2=sc.next();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Its an Anagram String:");
			
		}
		else
		{
			System.out.println("Not an Anagram String:");
		}
		
		
	}
	
	
	

		
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.err.println("****Enter your choice****");
		
		System.out.println("1-Add:\n"+ "2-Subtract:\n"+ "3-Multiplication:\n"+ "4-Division:\n"+ "5-Percentage:\n" + "6-Fibonacci:\n"+"7-Even or Odd check:\n"+ "8-Factorial:\n"+"9-Prime number checking:\n"+"10-Armstrong number checking:\n" +"11-Strong number checking:\n"+"12-Reverse of a number :\n"+"13-Number Palindrome checking:\n"+"14-String Reverse:\n"+"15-String palindrome checking:\n"+"16-vowels printing:\n"+"17-consonants checking:\n"+"18-Sum of even numbers from the given range:\n"+"19-Sum of even numbers from the given range:\n"+"20-Anagram:\n");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:  add();
		break;
		
		
		case 2:  sub();
        break;
		
		case 3: mul();
		break;
		
		case 4: div();
		break;
		
		case 5: per();
		break;
		
		case 6:fib();
		break;
		
		case 7:evenorodd();
		break;
		
		case 8: factor();
		break;
		
		case 9: Prime();
		break;
		
		case 10:armstrong();
		break;
		
		case 11:strong();
		break;
		
		case 12:numberrev();
		break;
		
		case  13:numberpalin();
		break;
		
		case 14:stringrev();
		break;
		
		case 15:stringpalin();
		break;
		
		case 16:vowels();
		break;
		
		case 17:consonants();
		break;
		
		case 18:sumofeven();
		break;
		
		case 19:sumofodd();
		break;
		
		case 20:anagram();
		break;
		
	
		default: System.out.println("Wrong information addded");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}

}
