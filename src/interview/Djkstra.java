package interview;

import java.util.HashSet;
import java.util.Set;

public class Djkstra {

	public static int minIndex(Set<Integer> set, int [] dist) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0; i < dist.length; ++i) {
			if(min > dist[i] && !set.contains(i)) {
				min = dist[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void updateDist(int index, int [] dist, int [][] grid, Set<Integer> set) {
		
		for(int i = 0; i < dist.length; ++i) {
			if(grid[index][i] < Integer.MAX_VALUE && !set.contains(i)){
				if(dist[i] > dist[index] + grid[index][i]) {
					dist[i] = dist[index] + grid[index][i];
				}
			}
		}
	}
	public static void print(int [] dist){
		for(int i = 0;i < dist.length;++i) {
			System.out.print(" "+dist[i]);
		}
	}
	public static int [] Dijkstras(int [][] grid) {
		int V = grid.length;
		Set<Integer> set = new HashSet<Integer>();
		int [] dist = new int[V];
		for(int i = 0; i < V; ++i) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[0] = 0;

		while(set.size() < V) {
			int minIndex = minIndex(set, dist);
			set.add(minIndex);
			updateDist(minIndex, dist, grid, set);
		}
		
		return dist;
	}
	
	public static void main(String [] args) {
	    int graph[][] = new int[][]{{Integer.MAX_VALUE, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, Integer.MAX_VALUE},
            {4, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 11, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, 8, Integer.MAX_VALUE, 7, Integer.MAX_VALUE, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, 2},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 7, Integer.MAX_VALUE, 9, 14, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 14, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 1, 6},
            {8, 11, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1, Integer.MAX_VALUE, 7},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 6, 7, Integer.MAX_VALUE}
           };
           int [] dist = Dijkstras(graph);
           print(dist);
	}

}
