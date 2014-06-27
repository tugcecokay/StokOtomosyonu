package stok;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

	public class Sqlitejdbc {
		
		
		    
		   
		
		    public static final String driver= "org.sqlite.JDBC";//SQLite ile Java arasındaki bağlantıyı sağlayan JDBC sürücüsü
		    public static final String  url_and_dbname= "jdbc:sqlite:deneme.sqlite";
		  
		    public static Connection getConnection() {
		    	 Connection conn = null; //Bağlantı nesnemiz
		    try {
				Class.forName(driver);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 

			try {
				conn = DriverManager.getConnection(url_and_dbname);//bağlantı açılıyor

			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
			return conn;
			
		}

		
}
