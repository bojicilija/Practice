package studentskabaza;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentskaBaza {
	String connectionString;
	Connection con;
	
	public StudentskaBaza (String conStr) {
		connectionString = conStr;
	}
	
	public void connect () {
		try {
			con = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dodajStudenta(int indeks, String ime, String prezime, String datumUpisa, String datumRodjenja, String mestoRodjenja) {
		try {
			PreparedStatement ps = con.prepareStatement(" INSERT INTO dosije (indeks, ime, prezime, datum_upisa, datum_rodjenja, mesto_rodjenja)"
					                                    + " VALUES (?, ?, ?, ?, ?, ?)");
			ps.setInt(1, indeks);
			ps.setString(2, ime);
			ps.setString(3, prezime);
			ps.setString(4, datumUpisa);
			ps.setString(5, datumRodjenja);
			ps.setString(6, mestoRodjenja);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void izbrisiIspit() {
		try {
			String upit = " DELETE FROM ispit "
				    + " WHERE ocena NOT BETWEEN 5 AND 10 ";
			Statement stm = con.createStatement();
			int rs = stm.executeUpdate(upit);
		
		}
		
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void setDatumRodjenja (int index, String datumRodjenja) {
		try {
			PreparedStatement ps = con.prepareStatement (" UPDATE dosije SET datum_rodjenja = ? "
					                                    + " WHERE indeks = ? ");
			ps.setInt(2, index);
			ps.setString(1, datumRodjenja);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
