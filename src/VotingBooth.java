import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("how old are you?");
		int was = Integer.parseInt(input);
		if(was>=18) {
			String wer = JOptionPane.showInputDialog("who do you think should be the next president?");
			if(wer.equals("")) {
				
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "no one cares what you think!");
		}
	}
}
