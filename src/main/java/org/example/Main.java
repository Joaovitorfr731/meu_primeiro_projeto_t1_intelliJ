/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] argumentos) {
	    Scanner leitor = new Scanner(System.in);
	    double area;

		System.out.println("Digite o Valor do Lado: ");
		double lado = leitor.nextDouble();
		
		area= lado*lado;

		
		
		System.out.println("O valor da area eh: " + area);
		
	}
}
