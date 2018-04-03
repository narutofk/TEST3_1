package demo2;

import javax.swing.JFrame;

public class Answer {
	
	public void show() {
	JFrame f1=new JFrame("000");
	f1.setTitle("在线答题系统");
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //f.setExtendedState(JFrame.MAXIMIZED_BOTH);  
    f1.setVisible(true);  
  
    //设置窗口的大小和位置  
    f1.setSize(600,500);  
    f1.setLocation(400,100);  
    f1.setLayout(null); 
	}
}