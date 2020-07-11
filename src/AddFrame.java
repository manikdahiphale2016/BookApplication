import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class AddFrame extends Frame 
{
	
   MainFrame frame;
   Book b;
   Label lbook_id,ltitle,lprice,lauthor;
   TextField tfbook_id,tftitle,tfprice,tfauthor;
   Button btncreate;
	public AddFrame(MainFrame mf)
	{
		frame=mf;
		this.setVisible(true);
		this.setTitle("AddFrame");
		this.setBounds(0,0,400, 400);
		this.setLayout(new GridLayout(6,2));
		
		
		AddFrameHandler afh=new AddFrameHandler(this,frame);
		
		//WindowHandler2 wh2=new WindowHandler2(this);
		this.addWindowListener(new WindowHandler2(this));
		
		lbook_id=new Label("Book_ID");this.add(lbook_id);
		tfbook_id=new TextField();this.add(tfbook_id);
		
		ltitle=new Label("Tite");this.add(ltitle); 
		tftitle=new TextField();this.add(tftitle);
		
		lprice=new Label("Price");this.add(lprice);
		tfprice=new TextField();this.add(tfprice);
		
		lauthor=new Label("Author");this.add(lauthor);
		tfauthor=new TextField();this.add(tfauthor);
		
		
		
		
		
		
		
		
		btncreate=new Button("Create");this.add(btncreate);btncreate.addActionListener(afh);
		
 }
	

	
}
