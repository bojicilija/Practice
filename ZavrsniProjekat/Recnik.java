package knjiga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class Recnik {

	String connectionString;
	Connection con;
	protected HashMap<String, Integer> reciURecniku;

	public Recnik(String conStr) {
		connectionString = conStr;
		reciURecniku = new HashMap<String, Integer>();
	}

	public void connect() {
		try {
			con = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void ucitajReci() {

		try {
			String upit = " SELECT word FROM entries";
			Statement stm;
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);
			
			int n=0;
			while (rs.next()) {
				reciURecniku.put(rs.getString("word").toLowerCase(), n++);
			}
			stm.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void ispisiRecnik() {
		for (String s : reciURecniku.keySet()) {
			System.out.println(s);
		}
	}

	public void unesiNoveReci(ArrayList<String> noveReci) {

		try {
			Statement stm= con.createStatement();
			String upit1 = "CREATE TABLE new_entries ( word varchar (25) NOT NULL COLLATE NOCASE ) ";
			stm.executeUpdate(upit1);
			stm.close();
			
			PreparedStatement ps1 = con.prepareStatement("INSERT INTO new_entries (word) VALUES (?) ");
			for (String s : noveReci) {
				ps1.setString(1, s);
				ps1.addBatch();
			}
			ps1.executeBatch();
			ps1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}