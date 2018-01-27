package se1403.lesson13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;
import javax.swing.Timer;

public class TimerProgressBar extends JProgressBar implements ActionListener{
	Timer timer = new Timer(1000, this);
	int value = 0;
	
	public TimerProgressBar(int max) {
		this.setMaximum(max);
		value = max;
		this.setValue(value);
		this.setStringPainted(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		value--;
		this.setValue(value);
		
	}
	
	public void start(){
		timer.start();
		value = getMaximum();
		this.setValue(value);
		
	}
	
	public void stop(){
		timer.stop();		
	}

}
