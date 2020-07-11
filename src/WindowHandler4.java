import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowHandler4 extends WindowAdapter
{
	 ViewFrame vf;
		
	 public WindowHandler4(ViewFrame vf) 
	 {
		this.vf=vf;
	}


	 	
	 	public void windowClosing(WindowEvent e) 
	 	{
	 		vf.dispose();
	 	}
}
