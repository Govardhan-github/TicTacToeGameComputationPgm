
public class TicTacToePgm {
	/*
	 * Creating Board Method
	 */
	public static char[] createBoard() {
	/*
	 * Creating Board with size 10
	 */
	char[] board = new char[10];
	//Assigning empty space for each value
	//neglecting zero index from board
	for(int i = 1;i < board.length; i++) {
		board[i]= ' ';} 
		return board;
		}	
	/*
	 * Typing main method here
	 * Calling createBoard method in main method
	 */
	public static void main(String[] args) {
		char[] board=createBoard();
	}
}