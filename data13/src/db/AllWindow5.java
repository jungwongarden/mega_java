package db;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AllWindow5 {
	private static JList<String> jList; // 버튼클릭 이벤트 {}안에 jlist를 쓰기 위해서 전역변수로 선언

	public static void main(String[] args) {
		int[] intList = new int[10];
		ArrayList<Integer> name = new ArrayList<Integer>();
		for (int i = 0; i < intList.length; i++) {
			name.add(i);
		}
		for (int i = 0; i < intList.length; i++) {
			intList[i] = name.get(i);
		}
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JTextField data = new JTextField();
		f.getContentPane().add(data);
		JButton btnNewButton = new JButton("전체 목록 가지고 오기");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO db = new MemberDAO(); // DAO를 사용하기 위한 객체 생성
				ArrayList<MemberDTO> list = db.all(); // DAO내의 add()함수 호출해서 받은 값을 list에 저장
				String[] dtoString2 = new String[list.size()]; // JList에 올릴 문자열들의 배열
				// 배열의 크기는 전체 행의 개수이므로 list의 크기와 같다
				for (int i = 0; i < list.size(); i++) {
					String dtoString = ""; // JList에 올릴 배열
					// dto내의 변수들을 모두 엮어서 하나의 문자열로 만들어줌
					// 즉, 테이블의 행 전체가 하나의 문자열이 됨
					dtoString = dtoString + list.get(i).getId() + " ";
					dtoString = dtoString + list.get(i).getPw() + " ";
					dtoString = dtoString + list.get(i).getName() + " ";
					dtoString = dtoString + list.get(i).getTel();
					dtoString2[i] = dtoString; // 만들어진 문자열(행)을 배열에 넣어줌
				}
				jList = new JList<String>(dtoString2); // JList에 문자열들의 배열을 올려줌
				jList.setVisibleRowCount(list.size());

				jList.addMouseListener(new MouseListener() {

					@Override
					public void mouseReleased(MouseEvent e) {

					}

					@Override
					public void mousePressed(MouseEvent e) {

					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(jList.getSelectedValue());
					}
				});
				f.getContentPane().add(new JScrollPane(jList));
//                f.setVisible(true);
				f.revalidate();
				f.repaint();
			}
		});

		f.setVisible(true);
	}

}
