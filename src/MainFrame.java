import java.awt.*;
import java.util.LinkedList;


public class MainFrame extends Frame 
{

   //	Book b[]=new Book[100];
//	List<Book>l=new LinkedList<Book>();
   	int count=0;
	 Button btnadd,btndel,btnupdate,btnview;
	 TextField tf1;
	 Label l1;
	 
	public MainFrame() 
	{
	
	  this.setTitle("Book Application");
	  setVisible(true);
	  setLayout(new GridLayout(4,2));
	  setBounds(0, 0, 500,500);
	  
	   
	  MainFrameHandler mfh=new MainFrameHandler(this); 
	  
	 
	  this.addWindowListener(new WindowHandler1(this));
	  
	  l1=new Label("Book ID ");this.add(l1);
	   
	  tf1=new TextField();this.add(tf1);
	  
	  btnadd=new Button("Add"); this.add(btnadd); btnadd.addActionListener(mfh); 
	  
	  btndel=new Button("Delete"); this.add(btndel); btndel.addActionListener(mfh);
	  
	  btnupdate=new Button("Update");this.add(btnupdate);btnupdate.addActionListener(mfh);
	  
	  btnview=new Button("View");this.add(btnview); btnview.addActionListener(mfh);
	  
	  
	}

}
