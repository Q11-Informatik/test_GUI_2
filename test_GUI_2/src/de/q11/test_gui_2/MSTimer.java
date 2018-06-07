package de.q11.test_gui_2;

import javax.swing.Timer;
import java.awt.event.*;
import java.io.Serializable;

public class MSTimer extends Object implements Serializable {
	public MSTimer(){
		int delay = 1000; //milliseconds
		ActionListener taskPerformer = new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				//...Perform a task...
	    	}
		};
		new Timer(delay, taskPerformer).start();
	}
}
