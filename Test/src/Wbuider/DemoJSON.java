package Wbuider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoJSON extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txttitle;
	private JTextField txtprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoJSON frame = new DemoJSON();
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
	public DemoJSON() {
		
		JSONArray arrObj = new JSONArray();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblid = new JLabel("book_id");
		lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblid.setBounds(37, 41, 99, 23);
		contentPane.add(lblid);
		
		JLabel lbltitle = new JLabel("title");
		lbltitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltitle.setBounds(37, 79, 99, 23);
		contentPane.add(lbltitle);
		
		JLabel lblprice = new JLabel("price");
		lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblprice.setBounds(37, 112, 99, 23);
		contentPane.add(lblprice);
		
		txtid = new JTextField();
		txtid.setBounds(146, 45, 160, 19);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		txttitle = new JTextField();
		txttitle.setColumns(10);
		txttitle.setBounds(146, 83, 160, 19);
		contentPane.add(txttitle);
		
		txtprice = new JTextField();
		txtprice.setColumns(10);
		txtprice.setBounds(146, 116, 160, 19);
		contentPane.add(txtprice);
		
		JTextArea lblketqua = new JTextArea();
		lblketqua.setBounds(37, 243, 547, 102);
		lblketqua.setLineWrap(true);
		contentPane.add(lblketqua);
		
	
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSONObject obj = new JSONObject();
				
				String id = txtid.getText().trim();
				String title = txttitle.getText().trim();
				String price = txtprice.getText().trim();
				
				obj.put("book_id", id);
				obj.put("title", title);
				obj.put("price", price);
				
				arrObj.add(obj);
				
			}
		});
		btnAdd.setBounds(172, 175, 85, 21);
		contentPane.add(btnAdd);
		
		JButton btnJson = new JButton("JSON");
		btnJson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblketqua.setText(arrObj.toJSONString());
				
			}
		});
		btnJson.setBounds(37, 175, 85, 21);
		contentPane.add(btnJson);
		
		
		
		
	}
}
