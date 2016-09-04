import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;
public class DisplayWindow extends JFrame
{
	public DisplayWindow()
	{
		initUI();
	}
	
	private void initUI()
	{
		
		 JFrame frame = new JFrame("Sudoku");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 frame.setSize(800, 500);
		 frame.setLayout(null); 
		

	
		textField(frame);
	 
	    
	    frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	private void setNumbers()
	{
		Random randomGenerator = new Random();
		int temp = randomGenerator.nextInt(4);
			//Integer.toString(temp+1)
		
		
		
	}
	private void textField(JFrame frame)
	{
		GridLayout grid = new GridLayout(4, 4, 2, 2);
		Container content1 = frame.getContentPane(); 
		content1.setLayout(grid);
		
		
		JTextField[] AllSquare = new JTextField[16];
		 
		for (int i = 0; i < 16; i++) 
		{
			AllSquare[i] = new JTextField("temp");
			AllSquare[i].setEditable(false);
		}
		
		JTextField[] square1 = new JTextField[4];
		square1[0] = AllSquare[1-1];
		square1[1] = AllSquare[2-1];
		square1[2] = AllSquare[5-1];
		square1[3] = AllSquare[6-1];
		JTextField[] square2 = new JTextField[4];
		square2[0] = AllSquare[3-1];
		square2[1] = AllSquare[4-1];
		square2[2] = AllSquare[7-1];
		square2[3] = AllSquare[8-1];
		JTextField[] square3 = new JTextField[4];
		square3[0] = AllSquare[9-1];
		square3[1] = AllSquare[10-1];
		square3[2] = AllSquare[13-1];
		square3[3] = AllSquare[14-1];
		JTextField[] square4 = new JTextField[4];
		square4[0] = AllSquare[11-1];
		square4[1] = AllSquare[12-1];
		square4[2] = AllSquare[15-1];
		square4[3] = AllSquare[16-1];
		
		for (int i = 0; i < 4; i++) 
		{
			content1.add(square1[i]);
		}
		for (int i = 0; i < 4; i++) 
		{
			content1.add(square2[i]);
		}
		for (int i = 0; i < 4; i++) 
		{
			content1.add(square3[i]);
		}
		for (int i = 0; i < 4; i++) 
		{
			content1.add(square4[i]);
		}
	}
	
	
	

}

