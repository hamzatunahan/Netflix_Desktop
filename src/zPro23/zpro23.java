package zPro23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class zpro23 {
	static String url="jdbc:sqlite:Proje.db";
	static Connection c =null;
	static Object[] turler= new Object[13];
	
	static boolean baglan() {
		try {
			System.out.println("DENEME");
			c=null;
			c=DriverManager.getConnection(url);
			
			System.out.println("Veritabanina baglandi!");
			return true;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
	}
	
	static boolean baglantikopar() {
		System.out.println("DENEME");
		c=null;
		System.out.println("Baðlanti koparildi!");
		return true;
	}
	
	
	static ResultSet listele(String sorgu) {
		Statement st;
		ResultSet rs;
		
		try {
			st=c.createStatement();
			rs=st.executeQuery(sorgu);
			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	static void kaydet(String sorgu) {
		Statement st;
		
		 try {
			 st=c.createStatement();
			st.executeUpdate(sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	static String yolal(int id) {
		String url;
		
		if(id==1) {
			
		}
		if(id==2) {
			
		}
		if(id==3) {
			
		}
		if(id==4) {
			url="/images/yüzüklerinefendisiikikule.jpg";
			return url;
			
		}
		if(id==5) {
			url="/images/maske.jpg";
			return url;
		}
		if(id==6) {
			url="/images/karaþövalye.jpg";
			return url;
			
		}
		if(id==7) {
			
		}
		if(id==8) {
			url="/images/yüzüklerinefendisikralýndönüþü.jpg";
			return url;
			
		}
		if(id==9) {
			
		}
		if(id==10) {
			
			
		}
		if(id==11) {
			url="/images/baslangýc(inception).jpg";
			return url;
		}
		if(id==12) {
			url="/images/harrypotterölümyadigarlarý.jpg";
			return url;
		}
		if(id==13) {
			
		}
		if(id==14) {
			
		}
		if(id==15) {
			
		}
		if(id==16) {
			url="/images/kuþlarladans.jpg";
			return url;
		}
		if(id==17) {
			
		}
		if(id==18) {
			url="/images/mercanpeþinde.jpg";
			return url;
		}
		if(id==19) {
			
		}
		if(id==20) {
			
		}
		if(id==21) {
			
		}
		if(id==22) {
			
		}
		if(id==23) {
	
		}
		if(id==24) {
			url="/images/arifv216.jpg";
			return url;
		}
		if(id==25) {
			url="/images/pk.jpg";
			return url;
	
		}
		if(id==26) {
			
		}
		if(id==27) {
			
		}
		if(id==28) {
			url="/images/frankenstein.jpg";
			return url;
		}
		if(id==29) {
		url="/images/gezegenimiz.jpg";
		return url;
		}
		if(id==30) {
			url="72sevimlihayvan.jpg";
			return url;
		}
		if(id==31) {
			
		}
		if(id==32) {
			
		}
		if(id==33) {
			
		}
		if(id==34) {
			
		}
		if(id==35) {
			
		}
		if(id==36) {
			
		}
		if(id==37) {
			
		}
		if(id==38) {
			
		}
		if(id==39) {
			
		}
		if(id==40) {
			
		}
		if(id==41) {
			
		}
		if(id==42) {
			url="/images/shrek.jpg";
			return url;
		}
		if(id==43) {
			
		}
		if(id==44) {
			
		}
		if(id==45) {
			url="/images/delibal.jpg";
			return url;
		}
		if(id==46) {
			
		}
		if(id==47) {
			url="/images/dangal.jpg";
			return url;
			
		}
		if(id==48) {
			
		}
		if(id==49) {
			url="/images/jaws.jpg";
			return url;
		}
		if(id==50) {
			url="/images/thedavincicode.jpg";
			return url;
		}
		if(id==51) {
			
		}
		if(id==52) {
		
		}
		if(id==53) {
			
		}
		if(id==54) {
			
		}
		if(id==55) {
			
		}
		if(id==56) {
			
		}
		if(id==57) {
			
		}
		if(id==58) {
			
		}
		if(id==59) {
			
		}
		if(id==60) {
			
		}
		if(id==61) {
			
		}
		if(id==62) {
			url="/images/strangerthings.jpg";
			return url;
		}
		if(id==63) {
			
		}
		if(id==64) {
			
		}
		if(id==65) {
			
		}
		if(id==66) {
			url="/images/beyblade.jpg";
			return url;
		}
		if(id==67) {
			url="/images/sonicx.jpg";
			return url;
		}
		if(id==68) {
			
		}
		if(id==69) {
			
		}
		if(id==70) {
		
		}
		if(id==71) {
			url="/images/carmasters.jpg";
			return url;
		}
		if(id==72) {
			url="/images/buyuktasarýmlar.jpg";
			return url;
		}
		if(id==73) {
		
		}
		if(id==74) {
			
		}
		if(id==75) {
			
		}
		


		
		String av = null;
		
		return av;
		
		
		
	}
	

	
	public static void main(String[] args)throws Exception {
		
		baglan();
		
		
	}
		

}