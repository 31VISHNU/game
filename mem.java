import java.awt.*;    
import javax.swing.*;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class mem{    
JFrame f;    
mem(){    
    f=new JFrame();    
    JButton b1=new JButton(" ");    
    JButton b2=new JButton(" ");    
    JButton b3=new JButton(" ");    
    JButton b4=new JButton(" ");    
    JButton b5=new JButton(" ");    
    JButton b6=new JButton(" ");    
    JButton b7=new JButton(" ");    
    JButton b8=new JButton(" "); 
    JButton b9=new JButton(" ");    
    JButton b10=new JButton(" ");    
    JButton b11=new JButton(" ");    
    JButton b12=new JButton(" ");    
    JButton b13=new JButton(" ");    
    JButton b14=new JButton(" ");    
    JButton b15=new JButton(" ");    
    JButton b16=new JButton(" ");  
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b1.setText("1");
        }
    });   
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b2.setText("2");
        }
    });  
    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b3.setText("3");
        }
    });  
    b4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b4.setText("4");
        }
    });  
    b5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b5.setText("5");
        }
    });  
    b6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b6.setText("6");
        }
    });  
    b7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b7.setText("7");
        }
    });  
    b8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b8.setText("8");
        }
    });  
    b9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b9.setText("6");
        }
    });  
    b10.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b10.setText("7");
        }
    });  
    b11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b11.setText("8");
        }
    });  
    b12.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b12.setText("1");
        }
    });
    b13.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b13.setText("2");
        }
    });    
    b14.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b14.setText("3");
        }
    });  
    b15.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b15.setText("4");
        }
    });  
    b16.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            b16.setText("5");
        }
    });  
    f.add(b1); f.add(b2); f.add(b3);  
    f.add(b4); f.add(b5); f.add(b6);  
    f.add(b7); f.add(b8); f.add(b9);    
    f.add(b10); f.add(b11); f.add(b12);  
    f.add(b13); f.add(b14); f.add(b15);  
    f.add(b16); 
    f.setLayout(new GridLayout(4,4));    
    f.setSize(300,300);    
    f.setVisible(true);    
}    

public static void main(String[] args) {    
    new mem();    
}    
}    