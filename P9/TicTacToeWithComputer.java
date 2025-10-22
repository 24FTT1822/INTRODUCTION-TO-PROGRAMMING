import java.util.Random;
import java.util.Scanner;

public class TicTacToeWithComputer {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static boolean gameOver = false;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initializeBoard();
        System.out.println("Welcome to Tic-Tac-Toe! You are 'X', the computer is 'O'.");
        printBoard();

        while (!gameOver) {
            if (currentPlayer == 'X') {
                playerMove();
            } else {
                computerMove();
            }
            printBoard();
            checkGameState();
            switchPlayer();
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void playerMove() {
        int row, col;
        while (true) {
            System.out.println("Player 'X', enter your move (row and column, 1-3):");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
    }

    private static void computerMove() {
        System.out.println("Computer 'O' is making a move...");
        int row, col;
        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);

            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            }
        }
    }

    private static void checkGameState() {
        if (checkWinner()) {
            System.out.println("Player '" + currentPlayer + "' wins!");
            gameOver = true;
        } else if (isBoardFull()) {
            System.out.println("The game is a draw!");
            gameOver = true;
        }
    }

    private static boolean checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
