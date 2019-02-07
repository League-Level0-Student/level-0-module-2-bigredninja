import javax.swing.JOptionPane;

public class Rolercaouter {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("how tall are you in inches?");
		int was = Integer.parseInt(input);
		if(was<48) {
			System.out.println("go big or go home!");
		}
		else {
			System.out.println("run before the grinch gets you!");
		}
	}
}

	
		
	


