package manager;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI {
	static public JFrame frame = new JFrame("Chess");

	static public JButton[][] moveBtn = new JButton[8][8];

	public int r = 70;

	public UI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 610); // canvas size set
		//frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		frame.getContentPane().setLayout(null);
	}

	public void BoardPrint() {
		frame.setVisible(true);
		for (int h = 0; h < 8; h++) {
			for (int w = 0; w < 8; w++) {
				moveBtn[w][h] = new JButton();
				moveBtn[w][h].setBounds(20 + (w * r), 10 + (h * r), r, r);

				if (((h + w) % 2) == 1)
					moveBtn[w][h].setBackground(Color.black);

				frame.getContentPane().add(moveBtn[w][h]);
			}
		}
		frame.setVisible(true);

	}

}