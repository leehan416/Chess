package manager;

import javax.swing.JFrame;

public class UI {
	static public JFrame frame = new JFrame("Chess");

	public UI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 610); // canvas size set
		frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
	}
	
	
	public int r = 70;

	public void BoardPrint() {
		for (int h = 0; h < 8; h++) {
			for (int w = 0; w < 8; w++) {
				UI.frame.getGraphics().drawRect(20 + (w * r), 40 + (h * r), r, r);
				if (((h + w) % 2) == 1)
					UI.frame.getGraphics().fillRect(20 + (w * r), 40 + (h * r), r, r);
			}
		}
	}
	
	
}
