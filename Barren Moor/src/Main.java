

public class Main {

	public static void main(String[] args) {
		
		int px = 5;
		int py = 2;
		int tx = 12;
		int ty = 7;
		int gridx = 20;
		int gridy = 20;
		
		Swamp swamp = new Swamp(tx, ty, gridx, gridy);
		Player player1 = new Player(px, py);
		
		System.out.println(Swamp.getSwamp(px, py, tx, ty, gridx, gridy));
		
		System.out.println(Player.ChangePosition(px, py, tx, ty, swamp.getGrid(), gridx, gridy));
			
		}
		
	}

	


