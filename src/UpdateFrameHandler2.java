import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpdateFrameHandler2 implements ActionListener
{
  UpdateFrame uf;
  Book b;
	public UpdateFrameHandler2(UpdateFrame uf1,Book b1)
	{
     uf=uf1;
     b=b1;
	}

	public void actionPerformed(ActionEvent e)
	{
	   if(e.getActionCommand()=="Submit")
	   {
		   System.out.println("Submit Clicked");
		     String strId=uf.tf1.getText();
		     int id1=Integer.parseInt(strId);
		     
		     String strTitle=uf.tf2.getText();
		     
		     String strPrice=uf.tf3.getText();
		     int price1=Integer.parseInt(strPrice);
		     
		     String strAuthor=uf.tf4.getText();
		     
		     b.setId(id1);
		     b.setTitle(strTitle);
		     b.setPrice(price1);
		     b.setAuthor(strAuthor);
	   }
		
	}

}
