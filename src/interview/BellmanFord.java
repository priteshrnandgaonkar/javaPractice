package interview;

public class BellmanFord {
	static int maxValue = Integer.MAX_VALUE;
	
	public static int bellmanFord(int [][] mat, int src, int target) {
		int v = mat.length;
		int [] dist = new int [v];
		for(int i = 0; i < v; ++i) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[src] = 0;
		
		for(int i = 0; i < v-1; ++i) {
			for(int j = 0; j < v; ++j){
				for(int k = 0; k < v; ++k){
					if(mat[j][k] < maxValue){
						dist[k] = dist[j] != Integer.MAX_VALUE && dist[k] > dist[j] + mat[j][k] ? dist[j] + mat[j][k] : dist[k];
					}
				}
			}
		}
		
		return dist[target];
	}
	
	public static void main(String [] args) {
		int [][] mat = {{0, 1, 2, maxValue, maxValue},
				{1, 0, maxValue, 10, 5},
				{2, maxValue, 0, 1, maxValue},
				{maxValue, 1, 1, 0, 1},
				{maxValue, 5, maxValue, 1, 0}
		};
		
		int [][] mat2 = {{0, -1, maxValue, maxValue, 4},
				{maxValue, 0, 2, 2, 3},
				{maxValue, maxValue, 0, -3, maxValue},
				{maxValue, 1, maxValue, 0, 5},
				{maxValue, maxValue, maxValue, maxValue, 0}
				};
		
		int min = bellmanFord(mat2, 0, 4);
		System.out.println("Min value to reach target = " + min);
	}

}
