package zPro23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Label;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class NetGiris extends JFrame {

	private JPanel contentPane;
	private JTextField tmail;
	private JLabel lblNewLabel;
	private JLabel lblifre;
	private Button button;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel txtNetflix;
	int xx,xy;
	private JPasswordField tparola;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetGiris frame = new NetGiris();
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
	public NetGiris() {
		setUndecorated(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 557);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx= e.getX();
				xy= e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x= e.getXOnScreen();
				int y= e.getYOnScreen();
				NetGiris.this.setLocation(x-xx,y-xy);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 10, 926, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setBounds(885, 0, 40, 40);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblNewLabel_3);
		
		tmail = new JTextField();
		tmail.setBorder(new LineBorder(SystemColor.scrollbar, 2));
		tmail.setColumns(10);
		tmail.setBounds(317, 155, 292, 36);
		panel.add(tmail);
		
		tparola = new JPasswordField();
		tparola.setBounds(317, 240, 292, 36);
		panel.add(tparola);
		
		Label label = new Label("    HATALI GIRIS");
		label.setForeground(Color.RED);
		label.setBounds(408, 401, 132, 28);
		panel.add(label);
		label.setVisible(false);
		
		lblNewLabel = new JLabel("E-posta adresi:");
		lblNewLabel.setForeground(SystemColor.info);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(317, 117, 124, 28);
		panel.add(lblNewLabel);
		
		lblifre = new JLabel("Parola:");
		lblifre.setForeground(SystemColor.info);
		lblifre.setToolTipText("");
		lblifre.setHorizontalAlignment(SwingConstants.LEFT);
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblifre.setBounds(317, 201, 124, 28);
		panel.add(lblifre);
		
		Button button = new Button("Giri\u015F Yap");
		button.addActionListener(new ActionListener() {//KULLANICI SÝSTEMDE KAYITLI ÝSE GÝRÝÞ YAPIYOR KAYITLI DEÐÝL ÝSE HATA MESAJI BASTIRIYOR
			public void actionPerformed(ActionEvent e) {
				
				String email,parolaa;
				String mailler,sifreler;
				int sayac=0;
				char[] parola;
				email=tmail.getText();
				parola=tparola.getPassword();
				parolaa=tparola.getText();
				zpro23.baglan();
				String ListeleSql="select * from kullanici_bilgi";
				ResultSet rs=zpro23.listele(ListeleSql);
	
			
				
				
				try {
					while(rs.next()) {
						
						mailler=rs.getString("user_mail");
						sifreler=rs.getString("user_sifre");
						int user_ide=rs.getInt("user_id");
						int hesapta=1;
						//System.out.println(mailler+"    "+sifreler);
						
						if(mailler.equals(email)  &&   sifreler.equals(parolaa)) {
							sayac++;
							String sql = "UPDATE kullanici_bilgi SET durum ="+ hesapta + " WHERE user_id =" +user_ide;
							zpro23.kaydet(sql);
							NetPage netpage = new NetPage();
							button.setVisible(false);
							netpage.setVisible(true);
							dispose();
							
							break;
							
						}
						else {
							
						}
					}
					if(sayac==0) {
						System.out.println("HATALI GIRIS LUTFEN DOGRU GIRINIZ YA DA KAYIT OLUNUZ");
						label.setVisible(true);
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 0, 51));
		button.setBounds(317, 343, 292, 40);
		panel.add(button);
		
		separator = new JSeparator();
		separator.setBounds(317, 285, 292, 2);
		panel.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(317, 335, 292, 2);
		panel.add(separator_1);
		
		txtNetflix = new JLabel();
		txtNetflix.setBorder(null);
		txtNetflix.setBackground(Color.DARK_GRAY);
		txtNetflix.setFont(new Font("Tahoma", Font.BOLD, 70));
		txtNetflix.setForeground(new Color(255, 0, 0));
		txtNetflix.setHorizontalAlignment(SwingConstants.CENTER);
		txtNetflix.setText("NETFL\u0130X");
		txtNetflix.setBounds(133, 20, 660, 72);
		panel.add(txtNetflix);
		
		JButton btnNewButton = new JButton("Yeni Oturum A\u00E7");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBorder(new LineBorder(new Color(176, 196, 222), 2));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setVisible(false);
				Nekfliks nekfliks= new Nekfliks();
				nekfliks.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(317, 297, 157, 28);
		panel.add(btnNewButton);
		
	}
}