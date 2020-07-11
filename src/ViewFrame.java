import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;


public class ViewFrame extends Frame
{
  Label lbook_id,ltitle,lprice,lauthor,lbook_id1,ltitle1,lprice1,lauthor1;;
Book b;

	public ViewFrame(Book b1) 
	{
		b=b1;
		this.setVisible(true);
		setTitle("View Frame");
		setBounds(0, 0, 400, 400);
		setLayout(new GridLayout(5,2));
		
		this.addWindowListener(new WindowHandler4(this)); 
	   lbook_id=new Label("Book ID");add(lbook_id);
	   lbook_id1=new Label();add(lbook_id1);
	   
	   ltitle=new Label("Title"); add(ltitle);
	   ltitle1=new Label();add(ltitle1);
	   
	   lprice=new Label("Book ID"); add(lprice);
	   lprice1=new Label();add(lprice1);
	   
	   lauthor=new Label("Price"); add(lauthor); 
	   lauthor1=new Label();add(lauthor1);
	   
	   
	   

/*	   lbook_id1=new Label(); add(lbook_id1);
	   ltitle1=new Label();add(ltitle1);
	   lprice1=new Label();add(lauthor1);
	   lauthor1=new Label();add(lprice1);*/
	   
	   int id=b.getId();
	   String strid=Integer.toString(id);
	   
	   String t=b.getTitle();
	   
	   int p=b.getPrice();
	   String strp=Integer.toString(p);
	   
	   String a=b.getAuthor();
	   
	   
	   lbook_id1.setText(strid);
	   ltitle1.setText(t);
	   lprice1.setText(strp);
	   lauthor1.setText(a);
	   
	}

}
