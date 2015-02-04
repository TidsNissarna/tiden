package tidsräknare;

import javax.swing.JFrame;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Maze();

	}
	
	public Maze(){
		JFrame f = new JFrame();
		f.setTitle("Maze game");
		//f.add(new board())
		f.setSize(500,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
