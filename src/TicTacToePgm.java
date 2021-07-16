//Importing java util package
import java.util.*;

public class TicTacToePgm {
	/*
	 * Creating Board Method
	 */
	public static char[] createBoard() {
	/*
	 * Creating Board array with size 10
	 */
		char[] board = new char[10];
		//Assigning empty space for each value
		//neglecting zero index from board
		for(int i = 1;i < board.length; i++) {
		board[i]= ' ';
		} 
		return board;
		}
	
		/*
		 * Creating giving input method to give user input
		 */
	public static char givingInput() {	
		//Determining the player letter and computer letter
		System.out.println("Computer letter is X ");
		System.out.println("Player letter is O ");
		//Scanner package to take input from user
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter the X or O character to play :" );
		char input =sc.next().charAt(0);
		System.out.println("Entered Character is:" +input );
		return input;
		}	
		
		/*
		 * Declaring main method here
		 * Calling createBoard method in main method
		 * Calling giving input method in main method
		 */
	public static void main(String[] args) {
		char[] board=createBoard();
		givingInput();
	}
}