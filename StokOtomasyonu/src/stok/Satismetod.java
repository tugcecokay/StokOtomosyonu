package stok;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Satismetod {

	public void urunlereAktar(Stoksatis sat, String urunkodu){
		Connection conn = null;
		PreparedStatement ps = null;
		String aktar = "UPDATE stokurunler SET  'uruncikismik'=? ,'satistarihi'=? WHERE 'urunkodu' = ?";
		try {
			conn = Sqlitejdbc.getConnection();
			ps = conn.prepareStatement(aktar);
			
			ps.setString(3, sat.getUrunsatismik());
			ps.setString(4, sat.getSatistar());
			ps.setString(2, urunkodu);
			ps.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public void Sat(Stoksatis sat){
		Connection conn = null;
		PreparedStatement ps = null;
		String satis = "INSERT INTO satis ('urunadi','urunkodu','urunsatismik','urunfiyat','uruncinsi','satistarihi','firmaadi','mustadisoy','mustno') VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			conn = Sqlitejdbc.getConnection();	
			ps = conn.prepareStatement(satis);
			ps.setString(1, sat.getUrunadi());
			ps.setString(2, sat.getUrunkodu());
			ps.setString(3, sat.getUrunsatismik());
			ps.setString(4, sat.getSatistar());
			ps.setString(5, sat.getUruncinsi());
			ps.setString(6, sat.getUrunfiyat());
			ps.setString(7, sat.getFirmadi());
			ps.setString(8, sat.getMustadsoyad());
			ps.setString(9, sat.getMustno());
			
			
		    ps.executeUpdate();//Sorguyu çalıştırır.
			JOptionPane.showMessageDialog(null, "satış işlemi başarıyla gerçekleşti:)");
		}
	 catch (Exception e) {
		 e.printStackTrace();
		JOptionPane.showMessageDialog(null, "eksik alanları doldurunuz!");
	}
	
	
	
	}
}
