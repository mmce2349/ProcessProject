package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSnake;//import anything that isn't in the same package.

public class SampleController 
{
	public SampleController() //Default constructor has no code or parameters. 
	{
		
	}
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle= new PlayDohCircle();
		PlayDohCircle thirdCircle;
		thirdCircle= new PlayDohCircle(5);
		
		PlayDohSnake firstSnake = new PlayDohSnake();
		PlayDohSnake secondSnake;
		secondSnake = new PlayDohSnake(15);
		
		System.out.println("This is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object.
		firstScanner = new Scanner(System.in);//Instanciates a Scanner object
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();//User types and computer gets it
		System.out.println("Oh, you like to eat " + answer);
	}
}
