package interview.backtracking;

public class Sudoku {
	public static boolean isSafeToInsert(int [][] mat, int k, int x, int y) {
		for(int i = 0; i < mat.length; ++i){
			if(mat[i][y] == k){
				return false;
			}
			
			if(mat[x][i] == k) {
				return false;
			}
		}
		return true;
	}
	
	public static void printMatrix(int [][] mat, int size){
		for(int i = 0; i < size; ++i) {
			System.out.println("");
			for(int j = 0; j < size; ++j) {
				System.out.print(+mat[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	public static boolean checkForUnassignedValue(int [][] mat, int matrixSize){
		for(int i = 0; i < matrixSize; ++i){
			for(int j = 0; j < matrixSize; ++j){
				if(mat[i][j] == 0){
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean sudokuSolver(int [][] mat, int matrixSize) {
		
		if(matrixSize != mat.length && matrixSize != mat[0].length) {
			System.out.println("Check the size of the matrix and matrix size passed as a parameter");
			return false;
		}
		
		if(!checkForUnassignedValue(mat, matrixSize)){
			return true;
		}
		
		for(int i = 0; i < matrixSize; ++i) {
			for(int j = 0; j < matrixSize; ++j) {
				if(mat[i][j] == 0){
					for(int k = 1; k <= matrixSize; ++k ) {
						if(isSafeToInsert(mat,k, i, j)){
							mat[i][j] = k;
							if(sudokuSolver(mat,matrixSize)){
								return true;
							}
							mat[i][j] = 0;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		
		   int [][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                   {5, 2, 0, 0, 0, 0, 0, 0, 0},
                   {0, 8, 7, 0, 0, 0, 0, 3, 1},
                   {0, 0, 3, 0, 1, 0, 0, 8, 0},
                   {9, 0, 0, 8, 6, 3, 0, 0, 5},
                   {0, 5, 0, 0, 9, 0, 6, 0, 0},
                   {1, 3, 0, 0, 0, 0, 2, 5, 0},
                   {6, 9, 0, 0, 5, 1, 8, 7, 4},
                   {7, 4, 5, 2, 8, 6, 3, 1, 9}};	
		   
		   int [][] grid2 = {{2,0},
		   					 {0,2}};	
		   
		   int [][] grid3 = {{0, 6, 4, 3, 2, 0},
				   {5, 3, 0, 0, 6, 4},
				   {4, 0, 0, 0, 0, 1},
				   {3, 0, 0, 0, 0, 2},
				   {6, 4, 0, 0, 1, 3},
				   {0, 1, 3, 4, 5, 0}};
		   
		   if(sudokuSolver(grid, 9)){
			   System.out.println("Sudoku solved, just for u");
			   printMatrix(grid, 9);
		   }
		   else{
			   System.out.println("Sudoku cannot be solved with the current configuration");
		   }
                   
		   }
}
