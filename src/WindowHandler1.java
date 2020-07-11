import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowHandler1 extends WindowAdapter
{
	 MainFrame mf;
		
	 public WindowHandler1(MainFrame mf)
	 {
	     this.mf=mf;
	 }
	 	
	 	public void windowClosing(WindowEvent e) 
	 	{
	 		mf.dispose();
	 	}
}
