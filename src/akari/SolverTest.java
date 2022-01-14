package akari;

public class SolverTest extends Akari{
    public static void main(String[] args) {
        String[][] board = Generator.generate(boardSize());
        printBoard(board);
        Solver solver=new Solver();
        String[][] solvedboard= solver.solve(board);
        System.out.println("Rozwiązanie: ");
        printBoard(solvedboard);
    }
}
