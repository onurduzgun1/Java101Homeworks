package Java101Odevler.MineSweeperGame;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    String [][] yes_mine;
    String [][] no_mine;
    int row_no;
    int col_no;
    boolean IsFinish;
    boolean IsWin;
    int ConditionToWin;

    public MineSweeper(int row, int col){
        this.yes_mine = new String[row][col];
        this.no_mine = new String[row][col];
        this.row_no = row;
        this.col_no = col;
        this.IsFinish = false;
        this.IsWin = false;
    }

    public void CreatingGameBoard(){
        for (int i = 0; i < yes_mine.length; i++){
            for (int j = 0; j < yes_mine[i].length; j++){
                yes_mine[i][j] = "-";
                no_mine[i][j] = "-";
            }
        }
    }

    public void PlacingMine(){
        Random rand = new Random();
        int n = (this.row_no * this.col_no) / 4;
        this.ConditionToWin = (this.row_no * this.col_no) - n;

        for (int i = 0; i < n; i++){
            int randRow = rand.nextInt(row_no);
            int randCol = rand.nextInt(col_no);

            if (yes_mine[randRow][randCol] == "*") i--;
            else yes_mine[randRow][randCol] = "*";
        }
    }

    public void print (int a){
        if (a == 1){
            System.out.println("Place of Mines: => => ");
            print(yes_mine);
            System.out.println("==  ==  ==  ==  ==  ==  ==  ==  ==");
            System.out.println("Welcome to the Mine Sweeper Game    :')     ");
        } else {
            System.out.println("===============================");
            print(no_mine);
        }
    }

    public void print(String[][] arr){
        for (String[] temp: arr){
            for (String temp2 : temp) System.out.print(temp2 + " ");
            System.out.println("");
        }
    }

    public int Control(int line, int column){
        int count = 0;
        for (int i = -1; i < 2; i++){
            for (int j = -1; j < 2; j++){
                if (line + i < 0 || column + j < 0 || line + i >= row_no || column + j >= col_no || (row_no == 0 && col_no == 0)) continue;
                if (yes_mine[line + i][column + j].equals("*")) count++;
            }
        }
        return  count;
    }

    public void RUN(){
        CreatingGameBoard();
        PlacingMine();
        print(1);
        Scanner input = new Scanner(System.in);
        while (!IsFinish){
            print(0);
            System.out.print("Enter Line:  ");
            int line = input.nextInt();
            System.out.print("Enter Column:  ");
            int column = input.nextInt();

            if (line < 0 || line >= row_no || column < 0 || column >= col_no){
                System.out.println("Wrong Input! Error!!\nPlease Check your input. Try Again...");
                continue;
            } else {
                if (yes_mine[line][column].equals("*")){
                    System.out.println("Game Over...");
                    System.out.println(" ");
                    IsFinish = true;
                    IsWin = false;
                    break;
                } else {
                    ConditionToWin--;
                }

                if (ConditionToWin <= 0){
                    System.out.println("Congratulations!! You Won The Game...");
                    System.out.println(" ");
                    IsWin = true;
                    IsFinish = true;
                    break;
                } else {
                    int count = Control(line, column);
                    yes_mine[line][column] = String.valueOf(count);
                }
            }
        }
    }
}
