package mavenCalculatorProject;

import java.util.Scanner;

public class MavenCalc {

public int add(int i, int j) {
		
		System.out.println("Addition:"+ (i+j));
		return i+j;
	}
	
	public int mul(int i, int j) {
		
		System.out.println("Multiplication:"+(i*j));
		return i*j;
	}
	public int sub(int i, int j) {
		System.out.println("Subtract:"+(i-j));
		return i-j;
	}
	public double div(double i, double j) {
		if (i!=0) {
		System.out.println("Division:"+(i/j));
		return i/j;
		}
		else 
			System.out.println("number not divid by zeero");
		return 0;
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MavenCalc cal = new MavenCalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a, b;
		a= sc.nextInt();
		b= sc.nextInt();
		cal.add(a, b);
		cal.sub(a, b);
		cal.div(a, b);
		cal.mul(a, b);
		
		sc.close();

	}
}

