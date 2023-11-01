package debuggerLab;

import java.util.Scanner;

public class Triangles
{
	private boolean quit;
	private Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		Triangles t = new Triangles();
		t.go();

	}
	
	public void go()
	{
		while (!quit)
		{
			printTriangle();
			askToQuit();
		}
	}
	
	private void printTriangle()
	{
		for (int i=0; i < 10; i++)
			
			
		{

			
			for (int j=0; j <= i; j++)
			{
				System.out.print(".");
			}
			System.out.println();
		}
	}
	
	private void askToQuit()
	{
		quit = false;
		System.out.println("Should we quit [y/n]?");
		String input = console.next();
		if (input.equals("y"))
		{
			quit = true;
		}		
	}
}
