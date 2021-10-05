package zPro23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Nekfliks extends JFrame {

	private JPanel contentPane;
	private JTextField temail;
	int xx,xy;
	private JTextField tad;
	private JPasswordField tparola;
	private JPasswordField tparola2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nekfliks frame = new Nekfliks();
					frame.setUndecorated(true);
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
	public Nekfliks() {
		setUndecorated(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 557);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("menu"));
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
				Nekfliks.this.setLocation(x-xx,y-xy);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 481, 557);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 456, 250);
		lblNewLabel_1.setIcon(new ImageIcon(Nekfliks.class.getResource("/images/netf2.jpg")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Nekfliks.class.getResource("/images/netf5.png")));
		lblNewLabel_2.setBounds(10, 264, 456, 250);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(571, 453, 292, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("E-posta adresi:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(571, 106, 124, 28);
		contentPane.add(lblNewLabel);
		
		temail = new JTextField();
		temail.setColumns(10);
		temail.setBounds(571, 144, 292, 32);
		contentPane.add(temail);
		
		JLabel lblifre = new JLabel("Parola:");
		lblifre.setToolTipText("");
		lblifre.setHorizontalAlignment(SwingConstants.LEFT);
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblifre.setBounds(571, 186, 124, 28);
		contentPane.add(lblifre);
		
		JLabel lblifreTekrar = new JLabel("Parolay\u0131 yeniden yaz\u0131n:");
		lblifreTekrar.setToolTipText("");
		lblifreTekrar.setHorizontalAlignment(SwingConstants.LEFT);
		lblifreTekrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblifreTekrar.setBounds(571, 266, 201, 28);
		contentPane.add(lblifreTekrar);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			System.exit(0);
			
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 0, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(905, 0, 40, 40);
		contentPane.add(lblNewLabel_3);
		
		JComboBox<String> tfavoritur2 = new JComboBox<String>();
		tfavoritur2.setBounds(730, 377, 107, 21);
		contentPane.add(tfavoritur2);
		tfavoritur2.addItem("Aksiyon ve Macera");
		tfavoritur2.addItem("Belgesel");
		tfavoritur2.addItem("Korku");
		tfavoritur2.addItem("Gerilim");
		tfavoritur2.addItem("Drama");
		tfavoritur2.addItem("Komedi");
		tfavoritur2.addItem("Romantik");
		tfavoritur2.addItem("Bilim Kurgu ve Fantastik");
		tfavoritur2.addItem("Çocuk ve Aile");
		tfavoritur2.addItem("Bilim ve Doða");
		tfavoritur2.addItem("Reality Program");
		tfavoritur2.setSelectedItem(null);
				
		JComboBox<String> tfavoritur3 = new JComboBox<String>();
		tfavoritur3.setBounds(730, 408, 107, 21);
		contentPane.add(tfavoritur3);
		tfavoritur3.addItem("Aksiyon ve Macera");
		tfavoritur3.addItem("Belgesel");
		tfavoritur3.addItem("Korku");
		tfavoritur3.addItem("Gerilim");
		tfavoritur3.addItem("Drama");
		tfavoritur3.addItem("Komedi");
		tfavoritur3.addItem("Romantik");
		tfavoritur3.addItem("Bilim Kurgu ve Fantastik");
		tfavoritur3.addItem("Çocuk ve Aile");
		tfavoritur3.addItem("Bilim ve Doða");
		tfavoritur3.addItem("Reality Program");
		tfavoritur3.setSelectedItem(null);
		
		JLabel lblFavoriTrSeimi = new JLabel("Favori T\u00FCr \r\nSe\u00E7imi:");
		lblFavoriTrSeimi.setToolTipText("");
		lblFavoriTrSeimi.setHorizontalAlignment(SwingConstants.LEFT);
		lblFavoriTrSeimi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFavoriTrSeimi.setBounds(571, 340, 147, 28);
		contentPane.add(lblFavoriTrSeimi);
		
		JComboBox<String> tfavoritur1 = new JComboBox<String>();
		tfavoritur1.setBounds(730, 346, 107, 21);
		contentPane.add(tfavoritur1);
		tfavoritur1.addItem("Aksiyon ve Macera");
		tfavoritur1.addItem("Belgesel");
		tfavoritur1.addItem("Korku");
		tfavoritur1.addItem("Gerilim");
		tfavoritur1.addItem("Drama");
		tfavoritur1.addItem("Komedi");
		tfavoritur1.addItem("Romantik");
		tfavoritur1.addItem("Bilim Kurgu ve Fantastik");
		tfavoritur1.addItem("Çocuk ve Aile");
		tfavoritur1.addItem("Bilim ve Doða");
		tfavoritur1.addItem("Reality Program");
		tfavoritur1.setSelectedItem(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinner.setModel(new SpinnerDateModel(new Date(1483218000000L), new Date(-2208999600000L), new Date(1590354000000L), Calendar.ERA));
		spinner.setBounds(571, 408, 149, 35);
		contentPane.add(spinner);
		
		Button button = new Button("Kay\u0131t Ol");
		button.addMouseListener(new MouseAdapter() {//KULLANICININ KAYIT BÝLGÝSÝ ALINIYOR
			@Override
			public void mouseClicked(MouseEvent e) {

				
				String email,ad,parolaa,parola2a;
				Object birthday;
				char[] parola,parola2;
				
				birthday= spinner.getValue();
				email=temail.getText();
				parola=tparola.getPassword();
				parola2=tparola2.getPassword();
				parolaa=tparola.getText();
				parola2a=tparola2.getText();
				ad=tad.getText();
				String value1=(String)tfavoritur1.getSelectedItem();
				String value2=(String)tfavoritur2.getSelectedItem();
				String value3=(String)tfavoritur3.getSelectedItem();
				
				
				System.out.println("parola"+parolaa);
				System.out.println("parolaa"+parola2a);
				System.out.println("Birthday:"+birthday);
				System.out.println("email:"+email);
				System.out.println("ad:"+ad);
				
				
				if(      parolaa.isEmpty()     ||    parola2a.isEmpty()     ){
					System.out.println("PAROLA BOS OLAMAZ");
				}
				
				else if(  ad.isEmpty()  ) {
					System.out.println("AD BOS OLAMAZ");
				}
				
				else if(  email.isEmpty()  ) {
					System.out.println("EMAIL BOS OLAMAZ");
				}
				
				else if(    value1==null ||    value2==null     ||     value3==null    ) {
					System.out.println("FAVORI TUR  BOS OLAMAZ");
					
				}
				//else if(tfavoritur1.get)
				
				

				else if(  parolaa.equals(parola2a)   ) {
					
					button.setVisible(false);
				NetGiris netgiris= new NetGiris();
				netgiris.setVisible(true);
				//System.out.println("email: "+email);
				dispose();	
				
				String kaydetSQL ="INSERT INTO kullanici_bilgi (user_name,user_mail, user_sifre,user_birthday,oneri1,oneri2,oneri3,durum)"+
						"VALUES ('"+ad+"','"+email+"', '"+parolaa+"','"+birthday+"','"+value1+"','"+value2+"','"+value3+"','"+0+"')";
				System.out.println(kaydetSQL);
				zpro23.kaydet(kaydetSQL);
				
				
				
				
				
				
				}
				
				else {
					System.out.println("HATA");
				}
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 0, 51));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		button.setBounds(571, 461, 147, 36);
		contentPane.add(button);
		
		tad = new JTextField();
		tad.setColumns(10);
		tad.setBounds(571, 64, 292, 32);
		contentPane.add(tad);
		
		JLabel lblAd = new JLabel("Ad\u0131:");
		lblAd.setToolTipText("");
		lblAd.setHorizontalAlignment(SwingConstants.LEFT);
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAd.setBounds(571, 26, 124, 28);
		contentPane.add(lblAd);
		
		JLabel lblDoumTarihi = new JLabel("| Do\u011Fum tarihi |");
		lblDoumTarihi.setToolTipText("");
		lblDoumTarihi.setHorizontalAlignment(SwingConstants.LEFT);
		lblDoumTarihi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDoumTarihi.setBounds(571, 381, 147, 28);
		contentPane.add(lblDoumTarihi);
		
		
		
		tparola = new JPasswordField();
		tparola.setBounds(571, 224, 292, 32);
		contentPane.add(tparola);
		
		tparola2 = new JPasswordField();
		tparola2.setBounds(571, 304, 292, 32);
		contentPane.add(tparola2);
		button.addActionListener((ActionListener) new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {

				
			}
				});
		baglanListele();
	}
		void baglanListele	() {
			zpro23.baglan();
			String ListeleSql="select * from kullanici_bilgi";
			ResultSet rs=zpro23.listele(ListeleSql);
			
			int sayac=0;
			String mailler;
			String sifreler;
			String idler;
			String isimler;
			String birthday;
			
			
			
			try {
				System.out.println("ID\tNAME\t\tBIRTHDAY\t\tMAIL\t\tSIFRE");
				while(rs.next()) {
					mailler=rs.getString("user_mail");
					sifreler=rs.getString("user_sifre");
					idler=rs.getString("user_id");
					isimler=rs.getString("user_name");
					birthday=rs.getString("user_birthday");
					
					
					System.out.println(idler+"\t"+isimler+"\t\t"+birthday+"\t\t"+mailler+"\t\t"+sifreler+"\t");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}