package zPro23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.DebugGraphics;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class NetPage extends JFrame {

	private JPanel contentPane;
	private JTextField searchBar;
	int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		zpro23.baglan();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetPage frame = new NetPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public NetPage() throws SQLException {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
				NetPage.this.setLocation(x-xx,y-xy);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1200, 720);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel fav5 = new JLabel("");
		//fav5.setIcon(new ImageIcon(NetPage.class.getResource("/images/avatar.jpg")));
		//fav5.setForeground(new Color(255, 255, 255));
		fav5.setBounds(967, 50, 183, 273);
		panel.add(fav5);
		
		JLabel fav4 = new JLabel("");
		//fav4.setIcon(new ImageIcon(NetPage.class.getResource("/images/sherlockholmes.jpg")));
		fav4.setBounds(774, 369, 183, 273);
		panel.add(fav4);
		
		JLabel fav3 = new JLabel("");
		//fav3.setIcon(new ImageIcon(NetPage.class.getResource("/images/harrypotter.jpg")));
		fav3.setBounds(774, 50, 183, 273);
		panel.add(fav3);
		
		JLabel fav1 = new JLabel("");
		//fav1.setIcon(new ImageIcon(NetPage.class.getResource("/images/alacakaranl\u0131k.jpg")));
		fav1.setBounds(581, 50, 183, 273);
		panel.add(fav1);
		
		JLabel fav2 = new JLabel("");
		//fav2.setIcon(new ImageIcon(NetPage.class.getResource("/images/assasinscreed.jpg")));
		fav2.setBounds(581, 369, 183, 273);
		panel.add(fav2);
		
		JLabel fav6 = new JLabel("");
		fav6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		fav6.setHorizontalTextPosition(SwingConstants.CENTER);
		fav6.setHorizontalAlignment(SwingConstants.CENTER);
		fav6.setBackground(new Color(240, 240, 240));
		//fav6.setIcon(new ImageIcon(NetPage.class.getResource("/images/zindanadasi.jpg")));
		fav6.setBounds(967, 369, 183, 273);
		panel.add(fav6);
		
		
		Button fizle1 = new Button("\u0130zle");
		fizle1.setForeground(Color.BLACK);
		fizle1.setFont(null);
		fizle1.setBackground(Color.WHITE);
		fizle1.setBounds(623, 333, 99, 30);
		panel.add(fizle1);
		
		Button fizle2 = new Button("\u0130zle");
		fizle2.setForeground(Color.BLACK);
		fizle2.setFont(null);
		fizle2.setBackground(Color.WHITE);
		fizle2.setBounds(623, 648, 99, 30);
		panel.add(fizle2);
		
		Button fizle3 = new Button("\u0130zle");
		fizle3.setForeground(Color.BLACK);
		fizle3.setFont(null);
		fizle3.setBackground(Color.WHITE);
		fizle3.setBounds(816, 333, 99, 30);
		panel.add(fizle3);
		
		Button fizle5 = new Button("\u0130zle");
		fizle5.setForeground(Color.BLACK);
		fizle5.setFont(null);
		fizle5.setBackground(Color.WHITE);
		fizle5.setBounds(1009, 329, 99, 30);
		panel.add(fizle5);
		
		Button fizle4 = new Button("\u0130zle");
		fizle4.setForeground(Color.BLACK);
		fizle4.setFont(null);
		fizle4.setBackground(Color.WHITE);
		fizle4.setBounds(816, 648, 99, 30);
		panel.add(fizle4);
		
		Button fizle6 = new Button("\u0130zle");
		fizle6.setForeground(Color.BLACK);
		fizle6.setFont(null);
		fizle6.setBackground(Color.WHITE);
		fizle6.setBounds(1009, 648, 99, 30);
		panel.add(fizle6);
		
		JLabel lblPuanVerin = new JLabel("1-10 aras\u0131 puanlay\u0131n\u0131z");
		lblPuanVerin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuanVerin.setForeground(new Color(0, 0, 128));
		lblPuanVerin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPuanVerin.setBounds(240, 500, 194, 39);
		panel.add(lblPuanVerin);
		
		JComboBox<String> puansistemi = new JComboBox<String>();
		puansistemi.setBounds(311, 540, 34, 28);
		panel.add(puansistemi);
		puansistemi.addItem("1");
		puansistemi.addItem("2");
		puansistemi.addItem("3");
		puansistemi.addItem("4");
		puansistemi.addItem("5");
		puansistemi.addItem("6");
		puansistemi.addItem("7");
		puansistemi.addItem("8");
		puansistemi.addItem("9");
		puansistemi.addItem("10");
		puansistemi.setSelectedItem(null);
		
		
		JLabel filmbitti = new JLabel("F\u0130LM B\u0130TT\u0130");
		filmbitti.setToolTipText("");
		filmbitti.setHorizontalAlignment(SwingConstants.LEFT);
		filmbitti.setForeground(new Color(0, 51, 204));
		filmbitti.setFont(new Font("Tahoma", Font.BOLD, 15));
		filmbitti.setBounds(275, 473, 124, 28);
		panel.add(filmbitti);
		
		
		JButton butonpuanla = new JButton("PUANLA");
		butonpuanla.setBounds(262, 587, 137, 39);
		panel.add(butonpuanla);
		
		
		
		puansistemi.setVisible(false);
		lblPuanVerin.setVisible(false);
		butonpuanla.setVisible(false);
		filmbitti.setVisible(false);
		
		
		//PROGRAM BÝLGÝLERÝNÝ ALMAK ÝÇÝN BÝR RESULTSET OLUSTURUYORUZ
		String ListeleSql2="select * from program1";
		ResultSet rs2=zpro23.listele(ListeleSql2);
		
		
		
		try {
			//String durumm="select * from kullanici_bilgi";
			//ResultSet durum=zpro23.listele(durumm);
			
			String ListeleSql="select * from kullanici_bilgi";
			ResultSet rs=zpro23.listele(ListeleSql);
			
			
			
			while(rs.next()) {
				String durumu = rs.getString("durum");
				if(durumu.contentEquals("1")) {//GÝRÝÞ YAPAN KULLANICIYI BULUYORUZ
					System.out.println("GÝRDÝÝÝÝÝ");
					
					break;	
				}		
			}
				//GÝRÝÞ YAPAN KULLANICININ ID VE SEÇTÝÐÝ TÜR BÝLGÝLERÝNÝ TUTUYORUZ
					String favori1=rs.getString("oneri1");
					String favori2=rs.getString("oneri2");
					String favori3=rs.getString("oneri3");
					int user_id=rs.getInt("user_id");
			
			
			
			int sayac1=0,sayac2=0,sayac3=0;
			System.out.println(favori1+favori2+favori3);
			
			
			while(rs2.next()) {
				//tüm programýn oldugu tablodaki bazý deðiþkenleri alýyoruz
				String isimler=rs2.getString("pro_name");
				int id=rs2.getInt("program_id");
				String tur=rs2.getString("tur_isim");
				String yol=zpro23.yolal(id);	//resimlerin idlerini alýyoruz ve yol deðiþkenine atýyoruz
				
				if(tur.contains(favori1)) {	//aldýgýmýz deðiþkenlerde kullanýcýnýn favori 1. türü bulunuyorsa giriyor
					
					sayac1++;	//her favori türden iki tane film ekliyeceðimiz için  kontrol deðiþkenleri oluþturduk 
					if(sayac1==1) {
						
						System.out.println("deneme1");
						fav1.setIcon(new ImageIcon(NetPage.class.getResource(yol))); //favori tür deðiþkeninin resmi ekleniyor
						System.out.println("yol"+yol);
						
						fizle1.addActionListener(new ActionListener() {	//çýkan favori tür resminde izle butonuna týklanýnca bu butona giriyor
							public void actionPerformed(ActionEvent e) {
						
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";	
								ResultSet rss2=zpro23.listele(ListeleSqll2);	//daha onceden izleyip izlemediðini karþýlaþtýrmak için olusturduk
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
												
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													
													if(yenizaman<=0) {	//seçtiði programý bitirdiyse yani filmin kalan zamaný sýfýrdan küçük veya eþitse
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
										
							}
						});
						
					}
					
					if(sayac1==2) {	
						System.out.println("deneme11");
						System.out.println(yol);
						fav2.setIcon(new ImageIcon(NetPage.class.getResource(yol)));
						fizle2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";
								ResultSet rss2=zpro23.listele(ListeleSqll2);
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													
													if(yenizaman<=0) {
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
								
							}
						});
						
						
					}		
				}
				if(tur.contains(favori2)) {
					
					sayac2++;
					if(sayac2==1) {
						System.out.println("deneme2");
						System.out.println(yol);
						fav3.setIcon(new ImageIcon(NetPage.class.getResource(yol)));
						
						fizle3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";
								ResultSet rss2=zpro23.listele(ListeleSqll2);
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													
													if(yenizaman<=0) {
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
										
							}
						});
						
						
						
					}
					if(sayac2==2) {
						System.out.println("deneme22");
						System.out.println(yol);
						fav4.setIcon(new ImageIcon(NetPage.class.getResource(yol)));
						
						fizle4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";
								ResultSet rss2=zpro23.listele(ListeleSqll2);
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													if(yenizaman<=0) {
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
										
							}
						});
						
						
						
						
					}		
				}
				if(tur.contains(favori3)) {
					
					sayac3++;
					if(sayac3==1) {
						System.out.println("deneme3");
						System.out.println(yol);
						fav5.setIcon(new ImageIcon(NetPage.class.getResource(yol)));
						
						fizle5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";
								ResultSet rss2=zpro23.listele(ListeleSqll2);
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													
													
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													
													if(yenizaman<=0) {
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
										
							}
						});
						
					}
					if(sayac3==2) {
						System.out.println("deneme33");
						fav6.setIcon(new ImageIcon(NetPage.class.getResource(yol)));
						
						fizle6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								int sayac=0;
								
								String ListeleSqll2="select * from kullanici_program";
								ResultSet rss2=zpro23.listele(ListeleSqll2);
								
										try {
											while(rss2.next()) {
												
												int kullanici_program_id=rss2.getInt("program_id");
												int kullanici_user_id=rss2.getInt("user_id");
													if(kullanici_program_id==id && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
													sayac++;
													puansistemi.setVisible(false);
													lblPuanVerin.setVisible(false);
													butonpuanla.setVisible(false);
													filmbitti.setVisible(false);
													
													
													
													int yenizaman=rss2.getInt("izleme_suresi");
													yenizaman=yenizaman-10;		
													
													if(yenizaman<=0) {
														yenizaman=0;
														puansistemi.setVisible(true);
														lblPuanVerin.setVisible(true);
														butonpuanla.setVisible(true);
														filmbitti.setVisible(true);
														
														butonpuanla.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																String puanlama=(String) puansistemi.getSelectedItem();
																if(puanlama==null) {
																	System.out.println("Puanlama Yapýlmadi");
																}
																String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);	
																
															}
														});
													}
													
													String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
													zpro23.kaydet(sql);		
													
													
													break;
													}
														
											}
										} catch (SQLException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										if(sayac==0) {	//daha onceden izlenmemiþse
											puansistemi.setVisible(false);
											lblPuanVerin.setVisible(false);
											butonpuanla.setVisible(false);
											filmbitti.setVisible(false);
											System.out.println("izlememis");
											String ListeleSqll="select * from program1";
											ResultSet rss=zpro23.listele(ListeleSqll);
											int uzunluk;
											try {
												while(rss.next()) {
													int program1_id=rss.getInt("program_id");
													if(program1_id==id) {
														int sure=rss.getInt("long");
														sure=sure-10;
														
														 Date simdikiZaman = new Date();
														String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
														System.out.println(kaydetSQL);
														zpro23.kaydet(kaydetSQL);					
													}					
												}
											} catch (SQLException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
										
										}
										
							}
						});
						
					}		
				}
				
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JButton bulunan1 = new JButton("buton1");
		panel.add(bulunan1);
		bulunan1.setBounds(60, 106, 341, 30);
		
		JButton bulunan2 = new JButton("buton2");
		panel.add(bulunan2);
		bulunan2.setBounds(60, 142, 341, 30);
		
		JButton bulunan3 = new JButton("buton3");
		bulunan3.setBounds(60, 176, 341, 30);
		panel.add(bulunan3);
		
		JButton bulunan4 = new JButton("buton4");
		bulunan4.setBounds(60, 210, 341, 30);
		panel.add(bulunan4);
		
		JButton bulunan5 = new JButton("buton5");
		bulunan5.setBounds(60, 245, 341, 30);
		panel.add(bulunan5);
		
		JButton bulunan6 = new JButton("buton6");
		bulunan6.setBounds(60, 278, 341, 30);
		panel.add(bulunan6);
		
		JButton bulunan7 = new JButton("buton7");
		bulunan7.setBounds(60, 311, 341, 30);
		panel.add(bulunan7);
		
		JButton bulunan8 = new JButton("buton8");
		bulunan8.setBounds(60, 347, 341, 30);
		panel.add(bulunan8);
		
		JButton bulunan9 = new JButton("buton9");
		bulunan9.setBounds(60, 382, 341, 30);
		panel.add(bulunan9);
		
		JButton bulunan10 = new JButton("buton10");
		bulunan10.setBounds(60, 418, 341, 30);
		panel.add(bulunan10);
		
		bulunan1.setVisible(false);
		bulunan2.setVisible(false);
		bulunan3.setVisible(false);
		bulunan4.setVisible(false);
		bulunan5.setVisible(false);
		bulunan6.setVisible(false);
		bulunan7.setVisible(false);
		bulunan8.setVisible(false);
		bulunan9.setVisible(false);
		bulunan10.setVisible(false);
		
		JButton butonsecim2 = new JButton("ISME GORE ARAMA");
		butonsecim2.setFont(new Font("Tahoma", Font.PLAIN, 9));

		searchBar = new JTextField();
		searchBar.setBounds(192, 63, 341, 32);
		panel.add(searchBar);
		searchBar.setColumns(10);
		searchBar.setVisible(false);
		
		JComboBox<String> tfavoritur = new JComboBox<String>();
		tfavoritur.setBounds(306, 63, 150, 27);
		panel.add(tfavoritur);
		tfavoritur.setVisible(false);
		
		JButton Ara = new JButton("ARA");
		
		Ara.setBounds(466, 68, 89, 23);
		panel.add(Ara);
		Ara.setVisible(false);
		
		
				tfavoritur.addItem("Aksiyon ve Macera");
				tfavoritur.addItem("Belgesel");
				tfavoritur.addItem("Korku");
				tfavoritur.addItem("Gerilim");
				tfavoritur.addItem("Drama");
				tfavoritur.addItem("Komedi");
				tfavoritur.addItem("Romantik");
				tfavoritur.addItem("Bilim Kurgu ve Fantastik");
				tfavoritur.addItem("Çocuk ve Aile");
				tfavoritur.addItem("Bilim ve Doða");
				tfavoritur.addItem("Reality Program");
				tfavoritur.setSelectedItem(null);		
		
		
		JButton butonsecim1 = new JButton("TURE GORE ARAMA");
		butonsecim1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		
		// TÜRE GÖRE ARANACAK
		butonsecim1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonsecim1.setVisible(false);
				butonsecim2.setVisible(false);
				tfavoritur.setVisible(true);
				Ara.setVisible(true);
				
			
				String ListeleSql="select * from program1";
				ResultSet rs=zpro23.listele(ListeleSql);
				
				
				
				Ara.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						String ListeleSql="select * from program1";
						ResultSet rs=zpro23.listele(ListeleSql);
						
						
						String ListeleSql2="select * from kullanici_bilgi";
						ResultSet rs2=zpro23.listele(ListeleSql2);
					
							try {//HANGÝ KULLANCININ GÝRDÝÐÝNÝ BULUYOR
								while(rs2.next()) {
									String durumu = rs2.getString("durum");
									if(durumu.contentEquals("1")) {
										System.out.println("GÝRDÝÝÝÝÝ");
										
										break;	
									}		
								}
								
								int user_id=rs2.getInt("user_id");
								
								
						
						int sayac=0;
						String value=(String)tfavoritur.getSelectedItem();
						
						
							while(rs.next()) {
								int id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
								
								String isimler=rs.getString("pro_name");
								id=rs.getInt("program_id");
								String tur=rs.getString("tur_isim");
				
								
								if(tur.contains(value)) {//seçtiði tür  program tablosunda bulunduysa (tablo en yüksek puandan en düþük puana doðru sýralý)
									
									System.out.println("isimler:"+isimler);
									
									sayac++;
									
									if(sayac==1) {//seçtiði türden en yüksek puanlý film 1.butona ekleniyor
										
										id1=id;
										bulunan1.setText(isimler);
										bulunan1.setVisible(true);
										bulunan2.setVisible(false);
										bulunan3.setVisible(false);
										bulunan4.setVisible(false);
										bulunan5.setVisible(false);
										bulunan6.setVisible(false);
										bulunan7.setVisible(false);
										bulunan8.setVisible(false);
										bulunan9.setVisible(false);
										bulunan10.setVisible(false);
										
										
										bulunan1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {	//1. butona eklenen türe týkladýgýnda izlemiþ sayýlýyor
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id1 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
										
										
										
										
										
									}
									if(sayac==2) {
										id2=id;
										bulunan2.setText(isimler);
										bulunan2.setVisible(true);
										
										bulunan2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id2 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
									
											}
										});
										}
									if(sayac==3) {
										id3=id;
										bulunan3.setText(isimler);
										bulunan3.setVisible(true);
										
										bulunan3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id3 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});	
									}
									
									if(sayac==4) {
										id4=id;
										bulunan4.setText(isimler);
										bulunan4.setVisible(true);
										
										bulunan4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id4 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==5) {
										id5=id;
										bulunan5.setText(isimler);
										bulunan5.setVisible(true);
										
										bulunan5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id5 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==6) {
										id6=id;
										bulunan6.setText(isimler);
										bulunan6.setVisible(true);
										
										bulunan6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id6 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==7) {
										id7=id;
										bulunan7.setText(isimler);
										bulunan7.setVisible(true);
										
										bulunan7.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id7 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==8) {
										id8=id;
										bulunan8.setText(isimler);
										bulunan8.setVisible(true);
										
										bulunan8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id8 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==9) {
										id9=id;
										bulunan9.setText(isimler);
										bulunan9.setVisible(true);
										
										bulunan9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id9 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									if(sayac==10) {
										id10=id;
										bulunan10.setText(isimler);
										bulunan10.setVisible(true);
										
										bulunan10.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id10 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
						
											}
										});
									}
									
									
								}
	
							}
							} catch (SQLException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						
						
						
						
					}
				});
				
				
				
				
				
				
				
			}
		});
		butonsecim1.setBounds(60, 43, 122, 23);
		panel.add(butonsecim1);
		
		//ÝSME GORE ARAMA
		butonsecim2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				butonsecim1.setVisible(false);
				butonsecim2.setVisible(false);
				
				searchBar.setVisible(true);
				
				searchBar.addKeyListener(new KeyAdapter() {
					
					@Override
					
					public void keyReleased(KeyEvent e) {
						// DATABASE KISMINDAN ARAMA YAPILACAK
					
						String aranacak;
						String isimler;
						
						int sayac=0;
						aranacak=searchBar.getText();	//isme göre arama için searchbar oluþturduk ki oraya girdiðiniz filmin tam ismi olmasa bile filmi bulabiliyor
						
						
						String ListeleSql="select * from program1";
						ResultSet rs=zpro23.listele(ListeleSql);
						System.out.println("aranacak:"+aranacak);
						
						
						try {
							
							String ListeleSql2="select * from kullanici_bilgi";
							ResultSet rs2=zpro23.listele(ListeleSql2);
						
								while(rs2.next()) {//HANGÝ KULLANICININ GÝRDÝÐÝ BULUNUYOR
									String durumu = rs2.getString("durum");
									if(durumu.contentEquals("1")) {
										System.out.println("GÝRDÝÝÝÝÝ");
										
										break;	
									}		
								}
								int user_id=rs2.getInt("user_id");
								
								
								
							
							
							
							while(rs.next()) {
								int id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
								
								isimler=rs.getString("pro_name");
								id=rs.getInt("program_id");
								int ad=rs.getInt("program_id");
								if(isimler.contains(aranacak)) {
									
									System.out.println("isimler:"+isimler);
									sayac++;
									
									if(sayac==1) {
									id1=id;
									bulunan1.setText(isimler);
									bulunan1.setVisible(true);
									bulunan2.setVisible(false);
									bulunan3.setVisible(false);
									bulunan4.setVisible(false);
									bulunan5.setVisible(false);
									bulunan6.setVisible(false);
									bulunan7.setVisible(false);
									bulunan8.setVisible(false);
									bulunan9.setVisible(false);
									bulunan10.setVisible(false);
									
									System.out.println(id1);
									bulunan1.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											int sayac2=0;
											
											String ListeleSqll2="select * from kullanici_program";
											ResultSet rsa=zpro23.listele(ListeleSqll2);
											
													try {
														while(rsa.next()) {
															
															int kullanici_program_id=rsa.getInt("program_id");
															int kullanici_user_id=rsa.getInt("user_id");
															
															if(kullanici_program_id==id1 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
															sayac2++;
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															int yenizaman=rsa.getInt("izleme_suresi");
															yenizaman=yenizaman-10;		
															
															if(yenizaman<=0) {
																yenizaman=0;
																puansistemi.setVisible(true);
																lblPuanVerin.setVisible(true);
																butonpuanla.setVisible(true);
																filmbitti.setVisible(true);
																
																butonpuanla.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		
																		String puanlama=(String) puansistemi.getSelectedItem();
																		if(puanlama==null) {
																			System.out.println("Puanlama Yapýlmadi");
																		}
																		String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																		zpro23.kaydet(sql);	
																		
																	}
																});
															}
															
															String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
															zpro23.kaydet(sql);		
															
															
															break;
															}
																	
														}
													} catch (SQLException e2) {
														// TODO Auto-generated catch block
														e2.printStackTrace();
													}
													if(sayac2==0) {	//daha onceden izlenmemiþse
														puansistemi.setVisible(false);
														lblPuanVerin.setVisible(false);
														butonpuanla.setVisible(false);
														filmbitti.setVisible(false);
														
														System.out.println("izlememis");
														String ListeleSqll="select * from program1";
														rsa=zpro23.listele(ListeleSqll);
														int uzunluk;		
														try {
															while(rsa.next()) {
																int program1_id=rsa.getInt("program_id");
																if(program1_id==id) {
																	int sure=rsa.getInt("long");
																	sure=sure-10;
																	
																	 Date simdikiZaman = new Date();
																	String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																			"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																	System.out.println(kaydetSQL);
																	zpro23.kaydet(kaydetSQL);					
																}					
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
													
													}
										}
									});
									
									}
									
									if(sayac==2) {
									id2=id;
									bulunan2.setText(isimler);
									bulunan2.setVisible(true);
									
									bulunan2.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											int sayac2=0;
											
											String ListeleSqll2="select * from kullanici_program";
											ResultSet rsa=zpro23.listele(ListeleSqll2);
											
													try {
														while(rsa.next()) {
															
															int kullanici_program_id=rsa.getInt("program_id");
															int kullanici_user_id=rsa.getInt("user_id");
															
															if(kullanici_program_id==id2 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
															sayac2++;
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															int yenizaman=rsa.getInt("izleme_suresi");
															yenizaman=yenizaman-10;		
															
															if(yenizaman<=0) {
																yenizaman=0;
																puansistemi.setVisible(true);
																lblPuanVerin.setVisible(true);
																butonpuanla.setVisible(true);
																filmbitti.setVisible(true);
																
																butonpuanla.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		
																		String puanlama=(String) puansistemi.getSelectedItem();
																		if(puanlama==null) {
																			System.out.println("Puanlama Yapýlmadi");
																		}
																		String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																		zpro23.kaydet(sql);	
																		
																	}
																});
															}
															
															String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
															zpro23.kaydet(sql);		
															
															
															break;
															}
																	
														}
													} catch (SQLException e2) {
														// TODO Auto-generated catch block
														e2.printStackTrace();
													}
													if(sayac2==0) {	//daha onceden izlenmemiþse
														puansistemi.setVisible(false);
														lblPuanVerin.setVisible(false);
														butonpuanla.setVisible(false);
														filmbitti.setVisible(false);
														
														System.out.println("izlememis");
														String ListeleSqll="select * from program1";
														rsa=zpro23.listele(ListeleSqll);
														int uzunluk;		
														try {
															while(rsa.next()) {
																int program1_id=rsa.getInt("program_id");
																if(program1_id==id) {
																	int sure=rsa.getInt("long");
																	sure=sure-10;
																	
																	 Date simdikiZaman = new Date();
																	String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																			"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																	System.out.println(kaydetSQL);
																	zpro23.kaydet(kaydetSQL);					
																}					
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
													
													}
											
			
											
										}
									});
									}
									
									if(sayac==3) {
										id3=id;
										bulunan3.setText(isimler);
										bulunan3.setVisible(true);
										
										bulunan3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id3 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});	
									}
									
									if(sayac==4) {
										id4=id;
										bulunan4.setText(isimler);
										bulunan4.setVisible(true);
										
										bulunan4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id4 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});
									}
									if(sayac==5) {
										id5=id;
										bulunan5.setText(isimler);
										bulunan5.setVisible(true);
										
										bulunan5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id5 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
												
											}
										});
									}
									if(sayac==6) {
										id6=id;
										bulunan6.setText(isimler);
										bulunan6.setVisible(true);
										
										bulunan6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id6 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});
									}
									if(sayac==7) {
										id7=id;
										bulunan7.setText(isimler);
										bulunan7.setVisible(true);
										
										bulunan7.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id7 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});
									}
									if(sayac==8) {
										id8=id;
										bulunan8.setText(isimler);
										bulunan8.setVisible(true);
										
										bulunan8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id8 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});
									}
									if(sayac==9) {
										id9=id;
										bulunan9.setText(isimler);
										bulunan9.setVisible(true);
										
										bulunan9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id9 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
												
				
												
											}
										});
									}
									if(sayac==10) {
										id10=id;
										bulunan10.setText(isimler);
										bulunan10.setVisible(true);
										
										bulunan10.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												int sayac2=0;
												
												String ListeleSqll2="select * from kullanici_program";
												ResultSet rsa=zpro23.listele(ListeleSqll2);
												
														try {
															while(rsa.next()) {
																
																int kullanici_program_id=rsa.getInt("program_id");
																int kullanici_user_id=rsa.getInt("user_id");
																
																if(kullanici_program_id==id10 && kullanici_user_id==user_id) {  //daha onceden seçtiði programý  izlemiþse
																sayac2++;
																puansistemi.setVisible(false);
																lblPuanVerin.setVisible(false);
																butonpuanla.setVisible(false);
																filmbitti.setVisible(false);
																
																int yenizaman=rsa.getInt("izleme_suresi");
																yenizaman=yenizaman-10;		
																
																if(yenizaman<=0) {
																	yenizaman=0;
																	puansistemi.setVisible(true);
																	lblPuanVerin.setVisible(true);
																	butonpuanla.setVisible(true);
																	filmbitti.setVisible(true);
																	
																	butonpuanla.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			
																			String puanlama=(String) puansistemi.getSelectedItem();
																			if(puanlama==null) {
																				System.out.println("Puanlama Yapýlmadi");
																			}
																			String sql = "UPDATE kullanici_program SET puan ="+ puanlama + " WHERE user_id = " +user_id+" AND program_id ="+id10;
																			zpro23.kaydet(sql);	
																			
																		}
																	});
																}
																
																String sql = "UPDATE kullanici_program SET izleme_suresi ="+ yenizaman + " WHERE user_id = " +user_id+" AND program_id ="+id10;
																zpro23.kaydet(sql);		
																
																
																break;
																}
																		
															}
														} catch (SQLException e2) {
															// TODO Auto-generated catch block
															e2.printStackTrace();
														}
														if(sayac2==0) {	//daha onceden izlenmemiþse
															puansistemi.setVisible(false);
															lblPuanVerin.setVisible(false);
															butonpuanla.setVisible(false);
															filmbitti.setVisible(false);
															
															System.out.println("izlememis");
															String ListeleSqll="select * from program1";
															rsa=zpro23.listele(ListeleSqll);
															int uzunluk;		
															try {
																while(rsa.next()) {
																	int program1_id=rsa.getInt("program_id");
																	if(program1_id==id10) {
																		int sure=rsa.getInt("long");
																		sure=sure-10;
																		
																		 Date simdikiZaman = new Date();
																		String kaydetSQL ="INSERT INTO kullanici_program (user_id,program_id,izleme_suresi,izleme_tarihi)"+
																				"VALUES ('"+user_id+"','"+id10+"', '"+sure+"','"+simdikiZaman+"')";
																		System.out.println(kaydetSQL);
																		zpro23.kaydet(kaydetSQL);					
																	}					
																}
															} catch (SQLException e2) {
																// TODO Auto-generated catch block
																e2.printStackTrace();
															}
														
														}
														
											}
										});
									}
									
								}	
							}
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
									
					}
					
					
				});
				searchBar.setBounds(202, 63, 341, 32);
				panel.add(searchBar);
				searchBar.setColumns(10);
				
				
			}
		});
		butonsecim2.setBounds(60, 72, 122, 23);
		panel.add(butonsecim2);
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.info);
		separator.setBounds(10, 38, 1140, 2);
		panel.add(separator);
		

		
		JLabel Search = new JLabel("ARA :");
		Search.setForeground(Color.WHITE);
		Search.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		Search.setHorizontalAlignment(SwingConstants.LEFT);
		Search.setBounds(10, 49, 40, 33);
		panel.add(Search);
		
		
		
		Button Anasayfa = new Button("Anasayfa");
		Anasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Anasayfa.setForeground(SystemColor.text);
		Anasayfa.setBackground(new Color(135, 206, 235));
		Anasayfa.setBounds(10, 5, 150, 33);
		panel.add(Anasayfa);
		
		
		
		String ListeleSqls="select * from kullanici_bilgi";
		ResultSet rsz=zpro23.listele(ListeleSqls);
		int user_ides=rsz.getInt("user_id");
		int hesapta=0;
		
		
		Button Çýkýþ = new Button("Hesaptan \u00C7\u0131k\u0131\u015F Yap");
		Çýkýþ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int sayac=0;
				try {
					while(rsz.next()) {
					System.out.println("deneme");
						String hesap=rsz.getString("durum");
						int user_ides=rsz.getInt("user_id");
						
						if(hesap.equals("1")) {
							
							System.out.println("denemejklj");
						String sql = "UPDATE kullanici_bilgi SET durum ="+ hesapta + " WHERE user_id =" +user_ides;
						zpro23.kaydet(sql);
						
						sayac++;
							
						}
						
					
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					Çýkýþ.setVisible(false);
						System.exit(0);
						dispose();
				
			}
		});
		Çýkýþ.setForeground(Color.WHITE);
		Çýkýþ.setFont(null);
		Çýkýþ.setBackground(SystemColor.desktop);
		Çýkýþ.setBounds(1000, 5, 150, 33);
		panel.add(Çýkýþ);
		
		Button Ýzleniyor = new Button("\u0130zleniyor...");
		Ýzleniyor.setForeground(Color.WHITE);
		Ýzleniyor.setBackground(new Color(220, 20, 60));
		Ýzleniyor.setBounds(169, 4, 150, 33);
		panel.add(Ýzleniyor);
		


	

	}
}