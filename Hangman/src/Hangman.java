/**
* Author: Bradley Wernick
* Title: Hangman.java
* Date: 2/14/2019
* Abstract: Hangman game using user input.
* 			User inputs a word to guess the letters of.
* 			The user is then prompted to either guess or ask for a hint
* 
* 			On guess,
	* 			The user is prompted for input
	* 			The program then determines if the input is valid
		* 			If not valid, user will be prompted again for input.
		* 			If valid, the guess will be checked to see if it is correct.
			* 			If correct, the display updates, and user is prompted again for guessing or hints
			* 			If not correct, number of guesses remain is deducted and brought back to the prompt for guessing or hints
	* 
* 			On hint, 
	* 			The user is giving a letter from the answer at the first index of a blank spot on the display
	* 			The number of guesses is decreased for using a hint
	* 
* 			When the user runs of guesses, the game tells you that you failed, and gives the answer, then ends
* 			When the user fills the display completely, the game congratulates you, and ends
* 
* 			The most of everything done by the program occurs in the main method. 
*/

import java.util.Scanner;

public class Hangman {
	private static String word;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		//Setup
		System.out.println("--------- Welcome to Hangman ---------");
		System.out.print("\nEnter a word: ");
		String userWord = scan.nextLine();
		setWord(userWord);
		System.out.println();
		
		int numGuesses = 4;
		String display = getDisplay();
		String answer = word;
		int emptyLetters = display.length();
		//End setup
		
		//Message loop
		while(true) {
			//failure case
			if(numGuesses == 0) {
				System.out.println("You failed. The word was " + word);
				break;
			}
			
			//Victory Condition
			emptyLetters = display.length() - display.replace("_", "").length();
			if(emptyLetters == 0) {
				System.out.println("Congratulations! The word was " + display);
				break;
			}
			
			//User prompt
			System.out.println("So far, the word is: " + display);
			System.out.println("You have " + numGuesses + " incorrect guesses left.");
			System.out.print("Enter 1 for guessing, 2 for hint, or -1 to exit: ");
			
			//Non-integer handling
			if(!scan.hasNextInt()) {
			    System.out.println("Incorrect input.");
			    scan.next();
			    continue;
			}
			
			//Integer Handling
			if(scan.hasNextInt()) {
				int input = scan.nextInt();
				
				//Exit condition
				if(input == -1) {
					//System.out.println("Exiting...");
					break;
				}
				
				//Guess
				if(input == 1) {
					//loop so incorrect inputs can continue to be made before a guess
					while(true) {
						System.out.print("Input your guess: ");
						String guess = scan.next();
						char c = guess.charAt(0);
						
						if(!Character.isLetter(c)) {
							System.out.println("Incorrect input.");
							continue;
						}
						
						if(Character.isLetter(c)) {
							//Only gets index values of guess
							int numLettersChanged = 0;
							for (int index = answer.indexOf(c); index >= 0; index = answer.indexOf(c, index + 1)){
								display = display.substring(0, index)  + c + display.substring(index + 1); //swap the _ in display at index with c
								numLettersChanged++;
							}
							
							//Handle guess status
							if(numLettersChanged == 0) {
								System.out.println("Sorry, " + c + " isn't in the word.\n");
								numGuesses--;
							}
							
							if(numLettersChanged > 0) {
								System.out.println("That's right! " + c + " is in the word.\n");
							}
							
							//break regardless
							break;
						}
					}
				}
				
				//hint
				if(input == 2) {
					int hintIndex = display.indexOf("_");
					String hint = word.substring(hintIndex, hintIndex+1); 
					System.out.println("OK! The hint is " + hint);
					numGuesses--;
					System.out.println("But since you used the hint, you can guess " + numGuesses + " more times.\n");
				}
			}
		}
		scan.close();
		//System.out.println("Program closed.");
		return;
	}
	
	//getter / setter
	static void setWord(String s) {
		word = s;
	}
	
	static String getWord() {
		return word;
	}
	
	static String getDisplay() {
		String r = word.replaceAll("\\s", "#");
		String s = r.replaceAll("[a-zA-Z]", "_");
		return s;
	}
	
}
