import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrameHandler implements ActionListener
{
    MainFrame mf;
   
    Label msg;
    Book b;
	public MainFrameHandler(MainFrame mf)
	{
		this.mf=mf;
	}

	public void actionPerformed(ActionEvent e) 
	{ 
			
		if(e.getActionCommand()=="Add")
		{
			new AddFrame(mf);
		}
		else if(e.getActionCommand()=="View")
		{
			String str=mf.tf1.getText();
			 int id1=Integer.parseInt(str);
			for(int i=0;i<mf.count;i++)
			{
				//if(mf.b[i].getId()==id1)
				{
					//new ViewFrame(mf.b[i]);
					break;
				}
				
			}
			
		}
		else if(e.getActionCommand()=="Delete")
		{
			
			String strdel=mf.tf1.getText();
			  int delid=Integer.parseInt(strdel);
			  for(int i=0;i<mf.count;i++)
			  {
				 // if(mf.b[i].getId()==delid)
				  {
					  for(int j=i+1;j<mf.count;j++)
					  {
					//	  mf.b[j-1]=mf.b[j];
					  }
				  }
			  }
			  Label l1=new Label("Record Deleted");mf.add(l1);  
		}
		else if(e.getActionCommand()=="Update")
		{    
			String str=mf.tf1.getText();
			 int id1=Integer.parseInt(str);
			for(int i=0;i<mf.count;i++)
			{
			//	if(mf.b[i].getId()==id1)
				{
					//new UpdateFrame(mf.b[i]);
					break;
				}
				
			}		
		}
	}

}
