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
		
		System.out.println("Here is my playdoh circle.");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCircle);
		
		System.out.println("Bare witness to the almighty PlayDohSnake!");		
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
		System.out.println("How old are you????");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old.");
		
		PlayDohCircle changeCircle = new PlayDohCircle ();
		System.out.println("Here is the circle before I Change it");
		System.out.println(changeCircle);
		System.out.println("Type in a new size- use numbers please");
		int mySize = firstScanner.nextInt();
		changeCircle.setSize(mySize);
		System.out.println("Now look at the circle");
		System.out.println(changeCircle);
		
		
	}
}
