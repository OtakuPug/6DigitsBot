 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;
 public class Testing extends Applet implements ActionListener{
	 Button b;
	 Button a;
	 int numClicks = 0;
     public void init() {
         setLayout(new GridLayout(1,2));
         b = (Button) add(new Button("1"));
         b.addActionListener(this);
         a = (Button) add(new Button("2"));
         a.addActionListener(this);
     }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object k =e.getSource();
		Object j = k.toString();
		int l = 1;
		while () {
			if(j.equals("java.awt.Button[button0,0,0,100x200,label=1]")) {
			System.out.print("button 1");
		} else {
			if(j.equals("java.awt.Button[button0,100,0,100x200,label=2]")) {
				System.out.print("Button 2 ");
			}
		}
		}
		
		
	}
 }