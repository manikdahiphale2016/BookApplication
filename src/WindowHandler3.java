import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowHandler3 extends WindowAdapter
{
	 UpdateFrame uf;
		
	 public WindowHandler3(UpdateFrame uf1) 
	 {
		uf=uf1;
	}


	 	
	 	public void windowClosing(WindowEvent e) 
	 	{
	 		uf.dispose();
	 	}
}
