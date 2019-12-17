import javax.swing.JFrame;

public class BallController {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("DragDemo");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new DragBallPanel());
		window.pack();
		window.show();
	}
}
