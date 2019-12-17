import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


import javax.swing.JPanel;
import javax.swing.Timer;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final int BALL_DIAMETER = 40;
	private int _ballX = 50;
	private int _ballY = 50;
	private int _moveX = 4;
	private int _moveY = -3;

	private int _dragFromX = 0;
	private int _dragFromY = 0;
	private boolean _canDrag = false;

	public DragBallPanel() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.blue);
		setForeground(Color.yellow);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		g.drawString("Coordonation", 10, 10);
		g.drawString("X: ", 10, 20);
		g.drawString(String.valueOf(_ballX), 30, 20);
		g.drawString("Y: ", 10, 30);
		g.drawString(String.valueOf(_ballY), 30, 30);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (_canDrag) {
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;

			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

			this.repaint();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public Timer timer = new Timer(20,new ActionListener()
			{	@Override
				public void actionPerformed(ActionEvent e) {
				_ballX +=_moveX;
				_ballY +=_moveY;
				if(_ballX >578) {
					_ballX = 578;
					_moveX= -_moveX;
				}
				if(_ballX < 0) {
					_ballX = 0;
					_moveX = -_moveX;
				}
				if(_ballY > 530) {
					_ballY = 530;
					_moveY = -_moveY;
				}
				if(_ballY < 45) {
					_ballY = 45;
					_moveY = -_moveY;
				}
				repaint();
			}
			});

	@Override
	public void mouseClicked(MouseEvent e) {
		int x =e.getX();
		int y =e.getY();
		if(x>=_ballX && x<=(_ballX + BALL_DIAMETER) && y>= _ballY && y<=(_ballY + BALL_DIAMETER)) {
			timer.start();
		} else {
			timer.stop();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;
			_dragFromX = x - _ballX;
			_dragFromY = y - _ballY;
		} else {
			_canDrag = false;
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}

	
}
