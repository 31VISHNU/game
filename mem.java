package memory;
import javax.swing.*;
import java.awt.*;
public class mem {
 public static void main(String[] args) 
 {
	 JFrame frame=new JFrame("i");
	 GridLayout grid = new GridLayout(8,8);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	 frame.setSize(600,600);
	 frame.setLayout(grid);
	 frame.setResizable(false);
	 for(int i=1; i<65; i++)
	 {
		 JButton button=new JButton();
		 if(i<33)
		 {
		 button.setText(String.valueOf(i));
		 frame.add(button);
		 }
		 else
		 {
		  i=i-32;
		  button.setText(String.valueOf(i));
		  frame.add(button);
	     }
	 }
 }
}
