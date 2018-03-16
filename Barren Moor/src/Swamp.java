

public class Swamp {
	
	public int tx;
	public int ty;
	public static int gridx;
	public static int gridy;
	public static int[][] swamp; 
	
	
	public Swamp(int tx, int ty, int gridx, int gridy) {
		
		this.tx = tx;
		this.ty = ty;
		this.gridx = gridx;
		this.gridy = gridy;
		swamp = new int [gridx][gridy]; 
	}
	
	public void CreateSwamp(int gridx, int gridy) {
		

	for (int i = 0; i < gridx; i++)
	for (int j = 0; j < gridy; j++)
		swamp [i][j] = 0;
			 
	}
	
	public static int[][] getSwamp(int px, int py, int tx, int ty, int gridx, int gridy) {
			
		swamp[px][py] = 1;
		swamp[tx][ty] = 2;
		
		for( int i = 0; i < gridx ; i++) {
			for(int j = 0; j < gridy; j++)
				System.out.print(" " + swamp[i][j] + " " );
			System.out.println();
			
}
		return null;
}

	public int[][] getGrid() {
		
		return swamp;
	}
	}
