package Wbuider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parse extends JFrame {

	private JPanel contentPane;
	private JTextField txtnhap;
	private JTextArea lblketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parse frame = new Parse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Parse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp chu\u1ED7i JSON");
		lblNewLabel.setBounds(10, 25, 302, 29);
		contentPane.add(lblNewLabel);
		
		
		
		
		lblketqua = new JTextArea();
		lblketqua.setBounds(10, 224, 302, 88);
		contentPane.add(lblketqua);
		

		txtnhap = new JTextField();
		txtnhap.setBounds(10, 79, 302, 19);
		contentPane.add(txtnhap);
		txtnhap.setColumns(10);
		
		
		
		JButton btnParse = new JButton("Parse");
		btnParse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JSONArray arrObj;
					JSONObject obj = new JSONObject();
					JSONParser par = new JSONParser();
					
					String jsonString = txtnhap.getText().trim();
					arrObj = (JSONArray) par.parse(jsonString);
					for(int i = 0; i<arrObj.size(); i++) {
						obj = (JSONObject) arrObj.get(i);
						lblketqua.append("\nM� s�ch: " + obj.get("book_id"));
						lblketqua.append("\nT�n s�ch: " + obj.get("title"));
						lblketqua.append("\nGi� s�ch: " + obj.get("price"));
						lblketqua.append("\n");
					}
				}catch(Exception e2) {
					
				}
			}
		});
		btnParse.setBounds(10, 131, 85, 21);
		contentPane.add(btnParse);
		
	}

}
