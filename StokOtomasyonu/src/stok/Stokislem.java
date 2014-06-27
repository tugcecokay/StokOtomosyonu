package stok;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Stokislem {
	
public void UrunEkle(Stokelemanlar ste){
	
	Connection conn = null;
	PreparedStatement ps = null;
	String ekle = "INSERT INTO stokurunler ('urunadi','urunkodu','urungirismik','uruncikismik','urunfiyat','alistarihi','satistarihi','dturu') VALUES (?,?,?,?,?,?,?,?)";
	
		try {
		conn = Sqlitejdbc.getConnection();	
			
			
			ps = conn.prepareStatement(ekle);
			ps.setString(1, ste.getUrunadi());
			ps.setString(2, ste.getUrunkodu());
			ps.setString(3, ste.getUgrsmiktar());
			ps.setString(4, ste.getUcksmiktar());
			ps.setString(5, ste.getAlistar());
			ps.setString(7, ste.getUrunfiyat());
			ps.setString(6, ste.getSatistar());
			ps.setString(8, ste.getUruncinsi());
			
			
		    ps.executeUpdate();//Sorguyu çalıştırır.
			JOptionPane.showMessageDialog(null, "Kayıt başarıyla gerçekleşti:)");
		}
	 catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Aynı ürün kodunu kayıtlara tekrar giremezsiniz!");
	}
		
	}

	public void Kayitsil(String urunkodu){
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sil="DELETE FROM stokurunler WHERE urunkodu=?";
		try {
			conn= Sqlitejdbc.getConnection();
			ps = conn.prepareStatement(sil);
			ps.setString(1,urunkodu);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Stok silindi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
	public void Guncelle(Stokelemanlar ste, String urunkodu){
		Connection conn =null;
		PreparedStatement ps = null;
		
		String guncelle = "UPDATE stokurunler SET 'urunadi'=?, 'urunkodu'=?, 'urungirismik' =?, 'uruncikismik'=?, 'urunfiyat'=?,'alistarihi'=? ,'satistarihi'=?,'dturu'=? WHERE 'urunkodu' = ?";
		try {
			conn = Sqlitejdbc.getConnection();
			ps=conn.prepareStatement(guncelle);
			ps.setString(1, ste.getUrunadi());
			ps.setString(2, ste.getUrunkodu());
			ps.setString(3, ste.getUgrsmiktar());
			ps.setString(4, ste.getUcksmiktar());
			ps.setString(5, ste.getAlistar());
			ps.setString(7, ste.getUrunfiyat());
			ps.setString(6, ste.getSatistar());
			ps.setString(8, ste.getUruncinsi());
			ps.setString(9, urunkodu);
			ps.executeUpdate();					
			 JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarıyla gerçekleşti:)");
		 }
		catch (Exception e) {
			e.printStackTrace(); //JOptionPane.showMessageDialog(null, "Bu Ürün kodu daha önce kullanılmış!.");
		}
	}
	
	
	public ArrayList<Stokelemanlar>urunadiAra(String urunadi){
			Connection conn = null;
			PreparedStatement ps = null;
			
			ArrayList<Stokelemanlar> stoks = new ArrayList<Stokelemanlar>()	;
			
			String urunadiara ="SELECT * FROM 'stokurunler'  WHERE urunadi LIKE ?";
			try {
				conn= Sqlitejdbc.getConnection();
				ps = conn.prepareStatement(urunadiara);
				ps.setString(1, "%" +urunadi +"%");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
				
					Stokelemanlar ste = new Stokelemanlar();
					
					//ste.setID(rs.getInt("id"));
					ste.setUrunadi(rs.getString("urunadi"));
					ste.setUrunkodu(rs.getString("urunkodu"));
					ste.setUgrsmiktar(rs.getString("urungirismik"));
					ste.setUcksmiktar(rs.getString("uruncikismik"));
					ste.setUrunfiyat(rs.getString("urunfiyat"));
					ste.setAlistar(rs.getString("alistarihi"));
					ste.setSatistar(rs.getString("satistarihi"));
					ste.setUruncinsi(rs.getString("dturu"));
					stoks.add(ste);
									
										
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return stoks;
						
	}
	public ArrayList<Stokelemanlar>urunkoduAra(String urunkodu){
		Connection conn =null;
		PreparedStatement ps = null;
		
		ArrayList<Stokelemanlar> stoks = new ArrayList<Stokelemanlar>()	;
		String urunkoduara ="SELECT * FROM 'stokurunler'  WHERE urunkodu LIKE ?";
		try {
			conn= Sqlitejdbc.getConnection();
			ps = conn.prepareStatement(urunkoduara);
			ps.setString(1, "%" +urunkodu +"%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				Stokelemanlar ste = new Stokelemanlar();
				
				ste.setID(rs.getInt("id"));
				ste.setUrunadi(rs.getString("urunadi"));
				ste.setUrunkodu(rs.getString("urunkodu"));
				ste.setUgrsmiktar(rs.getString("urungirismik"));
				ste.setUcksmiktar(rs.getString("uruncikismik"));
				ste.setUrunfiyat(rs.getString("urunfiyat"));
				ste.setAlistar(rs.getString("alistarihi"));
				ste.setSatistar(rs.getString("satistarihi"));
				ste.setUruncinsi(rs.getString("dturu"));
				stoks.add(ste);
			
				stoks.add(ste);
				}
		}	
			catch (Exception e) {
			e.printStackTrace();
		}
				
	return stoks;
	}

			public ArrayList<Stokelemanlar>StoklariGoruntule(){
				Connection conn= null;
				PreparedStatement ps=null;
				
				ArrayList<Stokelemanlar>stoks=new ArrayList<Stokelemanlar>();
				String StoklariGoruntule="select * from stokurunler";
				
				try {
					conn=Sqlitejdbc.getConnection();
					Statement statement = conn.createStatement();
					ResultSet rs = statement.executeQuery(StoklariGoruntule);
					 while (rs.next()) {
						 Stokelemanlar ste = new Stokelemanlar();
							
						 ste.setID(rs.getInt("id"));
							ste.setUrunadi(rs.getString("urunadi"));
							ste.setUrunkodu(rs.getString("urunkodu"));
							ste.setUgrsmiktar(rs.getString("urungirismik"));
							ste.setUcksmiktar(rs.getString("uruncikismik"));
							ste.setUrunfiyat(rs.getString("urunfiyat"));
							ste.setAlistar(rs.getString("alistarihi"));
							ste.setSatistar(rs.getString("satistarihi"));
							ste.setUruncinsi(rs.getString("dturu"));
							stoks.add(ste);
						
							stoks.add(ste);
					 }
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
		
				return stoks;
			}
}

