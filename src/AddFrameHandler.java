import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddFrameHandler implements ActionListener
{
  AddFrame af;
  MainFrame mf;
  Label msg;
  Book b;
	public AddFrameHandler(AddFrame af1,MainFrame mf1)
	{
		af=af1;
		mf=mf1;
	}

	

	public void actionPerformed(ActionEvent e)
	{
		
	  
		  Book b=new Book();
		  String str=af.tfbook_id.getText();
		  int id=Integer.parseInt(str);
		  String title=af.tftitle.getText();
		  int price=Integer.parseInt(af.tfprice.getText());
		  String author=af.tfauthor.getText();
		 
		  b.setId(id);
		  b.setTitle(title);
		  b.setPrice(price);
		  b.setAuthor(author);
		  
		 // mf.b[mf.count]=b;
		  mf.count++;
		  
		  new AddFrame(mf);
	}

}
