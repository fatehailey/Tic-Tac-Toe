import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {


        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);

        switch (pos){
            case 1:
                gameBoard[0] [0] = 'X';
            case 2:
                gameBoard[0] [2] = 'X';
            case 3:
                gameBoard[0] [4] = 'X';
            case 4:
                gameBoard[2] [0] = 'X';
            case 5:
                gameBoard[2] [2] = 'X';
            case 6:
                gameBoard[2] [4] = 'X';
            case 7:
                gameBoard[4] [0] = 'X';
            case 8:
                gameBoard[4] [2] = 'X';
            case 9:
                gameBoard[0] [4] = 'X';

        }
        printGameBoard(gameBoard);
    }
        public static void printGameBoard(char [] [] gameBoard){
            for (char [] row : gameBoard){
                for(char c : row){
                    System.out.print(c);
                }
                System.out.println();
            }
    }
}

