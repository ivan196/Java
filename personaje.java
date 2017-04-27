package juegoprueba;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class personaje extends JPanel implements ActionListener, KeyListener {

	//declarar controles a usar y definir valor
	Timer tiempo = new Timer(20,this);
	int x = 0, y = 0, velX = 0, velY = 0;
	
	
	public personaje(){
		
		tiempo.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
				
	}
	
	
	public void init(){}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 50, 40);
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		x = x + velX;
		y = y + velY;
		repaint();
		
	}


	public void keyPressed1(KeyEvent e) {
		
		
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		int b = e.getKeyCode();
        
        if(b == KeyEvent.VK_LEFT){
            velX = -1;
            velY = 0;
        }
            
        if(b == KeyEvent.VK_UP){
            velX = 0;
            velY = -1;
        }
        if(b == KeyEvent.VK_RIGHT){
            velX = 1;
            velY = 0;
        }
        if(b == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 1;
        }
		
	}


	public void actionReleased(ActionEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] arg){
		
		personaje ver = new personaje();
		JFrame form = new JFrame();
		form.setTitle("en movimiento");
		form.setSize(600,500);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.add(ver);
		
		
	}


	
	
}
