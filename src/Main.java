import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
//    1 - Greetings player message! And some info about the game ( X - player, O - Pc)
//       2 - Draw a game grid!
//       3 - Ask player to do their move!
//       4 - Draw a grid with a players 'X' mark
//       5 - Program should check if player win - if win game is over
//       6 - There is any space left? - if no, the game is draw
//       7 - Pc should do their move
//       8 - Draw a grid with a Pc '0' mark
//       9 - Program should check if pc win - if win game is over - if no go to step 3
    public static void main(String[] args)
    {
        Scanner can = new Scanner(System.in);
        char [] grid = {'1', '2', '3', '4', '5', '6', '7', '8', '9', };
        drawGrid(grid);
        System.out.println("place an X on the cell of ur choice");
        while (true)
        {

        }





        for (int i = 0; i < grid.length; i++)
        {

        }
    }
    public static void startGrid(char [] grid)
    {
        for (int i = 0; i < grid.length; i++)
        {
          grid[i]=' ';
        }
    }
    private static void drawGrid(char[] grid) {
        System.out.println(grid[0]+" | "+ grid[1]+" | "+ grid[2]+"\n__________\n"+ grid[3]+" | "+ grid[4]+" | "+ grid[5]
                +"\n__________\n"+ grid[6]+" | "+ grid[7]+" | "+ grid[8]);
    }


}


