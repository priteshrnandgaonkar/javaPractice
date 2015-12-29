package interview.backtracking;

public class KnightTourProblem {
private static final int numSides = 8;

	public static boolean isValidBox(int x, int y, int [][] sol){
		if(x >= 0 && x < numSides && y >= 0 && y < numSides && sol[x][y]==-1){
			return true;
		}
		else{
			return false;
		}
	}


    static void printSolution(int sol[][]) {
        for (int x = 0; x < numSides; x++) {
            for (int y = 0; y < numSides; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

	public static void solveKT(int x, int y) {
		int [][] sol = new int[numSides][numSides];
		
		 for(int i = 0; i < numSides; ++i) {
			 for(int j = 0; j < numSides; ++j){
				 sol[i][j] = -1;
			 }
		 }
		 
		 sol[x][y] = 0;
	        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
	        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
		
		if(KTSolverUtil(x, y, 1, sol, xMove, yMove)) {
			System.out.println("Knight Tour exist sol exist");
			printSolution(sol);
		}
		else{
			System.out.println("Poor horse can't move through the entire battle field");
		}
	}
	
	public static boolean KTSolverUtil(int x, int y, int moveNum, int[][] sol, int [] xMove, int [] yMove){
		if(moveNum == numSides * numSides){
			return true;
		}
		
		for(int i = 0; i < 8; ++i){
			int nextX = x + xMove[i];
			int nextY = y+ yMove[i];
			if(isValidBox(nextX, nextY,sol)) {
				sol[nextX][nextY] = moveNum;
				 if(KTSolverUtil(nextX, nextY, moveNum + 1, sol, xMove, yMove)){
					return true;
				 }
				else {
					sol[nextX][nextY] = -1;
				}
			}
		}
		return false;
	}
	
	   public static void main(String args[]){
		   solveKT(0,0);
	    }

}
