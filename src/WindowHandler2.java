import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowHandler2 extends WindowAdapter
{
	 AddFrame af;
		
	 public WindowHandler2(AddFrame addFrame) 
	 {
		this.af=addFrame;
	}


	 	
	 	public void windowClosing(WindowEvent e) 
	 	{
	 		af.dispose();
	 	}
}
