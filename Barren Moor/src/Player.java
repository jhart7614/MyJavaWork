import java.util.Scanner;

public class Player {
	
	public int px;
	public int py;
	
	public Player(int px, int py) {

		this.px = px;
		this.py = py;
	}

	
public static int ChangePosition(int px, int py, int tx, int ty, int swamp[][], int gridx, int gridy) {
		
		Scanner PlayerPosition = new Scanner(System.in);
		
		while (px != tx || py != ty ) 
		{
			
		swamp[px][py] = 0;
		
		String direction = PlayerPosition.nextLine();
		
		switch (direction) 
		{
		
		case "west":
			py = py + 1;
			break;
		
		case "south":
			px = px + 1;
			break;
			
		case "east":
			py = py - 1;
			break;
		
		case "north":
			px = px - 1;
			break;
			
		}
		
	swamp[px][py] = 1;
	for(int i = 0;i < gridx; i++) {
		for(int j = 0; j < gridy; j++) {
				System.out.print(" " + swamp[i][j] + " ");
				}
			System.out.println();
}
		}
		
	  System.out.println("Treasure Found!");
	  return 0;

}
}
   


