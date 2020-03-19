package db;

import java.awt.FlowLayout;
import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ScrollTest {

		 
		    private JFrame f;
		    Scrollbar bar1, bar2, bar3, bar4, bar5;
		    
		    public ScrollTest(){
		        f = new JFrame();
		        f.setLayout(new FlowLayout());
		        bar1=new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 450, 300);
		        f.add(bar1);
		        for (int i = 0; i < 100; i++) {
		        	JButton b1 = new JButton("버튼.");
		        	f.add(b1);
				}
		        
		        //좌측부터 차례대로 (스크롤 할 방향,초기위치,스크롤바가 표시하는 화면 크기,화면의 넓이 최소값,화면의 넓이 최대값)
		        bar2=new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 450, 300);
		        bar3=new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 300);
		        bar4=new Scrollbar(Scrollbar.VERTICAL, 0, 150, 0, 250);
		        bar5=new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 250);

		        f.setSize(500, 400);
		        f.setVisible(true);
		    }
		    
		    public static void main(String[] args){
		        ScrollTest sbt = new ScrollTest();
		    }

	}

