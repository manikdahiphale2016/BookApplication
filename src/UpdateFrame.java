import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class UpdateFrame extends Frame
{
	 Label lbook_id,ltitle,lprice,lauthor;
	 TextField tf1,tf2,tf3,tf4;
	 Button btnUpdate;
	 Book b;
	public UpdateFrame(Book b1) 
	{
		b=b1;
		this.setVisible(true);
		this.setTitle("Update");
		this.setBounds(0,0,400,400);
		this.setLayout(new GridLayout(5, 2));
		
		//UpdateFrameHandler ufh=new UpdateFrameHandler(this);
		UpdateFrameHandler2 ufh2=new UpdateFrameHandler2(this,b);
		this.addWindowListener(new WindowHandler3(this));
		lbook_id=new Label("Book ID");add(lbook_id);
		tf1=new TextField();add(tf1);
		
		 ltitle=new Label("Title"); add(ltitle);
		 tf2=new TextField();add(tf2);
		 
		 lprice=new Label("Price"); add(lprice);
		 tf3=new TextField();add(tf3);
		 
		 lauthor=new Label("Author"); add(lauthor);
		 tf4=new TextField();add(tf4);
		 
		  int id=b.getId();
		   String strid=Integer.toString(id);
		   
		   String t=b.getTitle();
		   
		   int p=b.getPrice();
		   String strp=Integer.toString(p);
		   
		   String a=b.getAuthor();
		  
		   tf1.setText(strid);
		   tf2.setText(t);
		   tf3.setText(strp);
		   tf4.setText(a);
		 
		 btnUpdate=new Button("Submit");add(btnUpdate); btnUpdate.addActionListener(ufh2);
	}

}
