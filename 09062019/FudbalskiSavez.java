package domaci24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class FudbalskiSavez {
	String connectionString;
	Connection con;

	public FudbalskiSavez(String conStr) {
		connectionString = conStr;
	}

	public void connect() {
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

	public void ispisiImena() {
		try {
			String upit = " Select Fudbaler.Ime, Tim.Naziv " + " FROM Fudbaler, Tim "
					+ " WHERE Fudbaler.IdTim = Tim.IdTim ";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString("Ime");
				String naziv = rs.getString("Naziv");
				System.out.println(ime + "    " + naziv);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ispisiImenaManUtd() {
		try {
			String upit = " Select Fudbaler.Ime " + " From Fudbaler, Tim "
					+ " WHERE Tim.IdTim = (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = 'Manchester United')"
					+ " AND Fudbaler.IdTim = Tim.IdTim";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);
			while (rs.next()) {
				String ime = rs.getString("Ime");
				System.out.println(ime);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ispisiGolove() {
		try {
			String upit = " Select Fudbaler.Ime, count (Gol.RedniBrGola)" + " From Fudbaler, Gol"
					+ " WHERE  Fudbaler.IdFud = Gol.IdFud" + " GROUP BY Fudbaler.IdFud";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);
			while (rs.next()) {
				String ime = rs.getString(1);
				int RedniBrGola = rs.getInt(2);
				System.out.println(ime + "   " + RedniBrGola);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ispisiKartone() {
		try {
			String upit = " SELECT Fudbaler.Ime, sum(Karton.Tip = 'zuti karton') as 'brZutih', sum(Karton.Tip = 'crveni karton') as 'brCrvenih' "
					+ " FROM Fudbaler, Karton " + " WHERE  Karton.IdFud = Fudbaler.IdFud " + " GROUP BY Fudbaler.IdFud";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);
			while (rs.next()) {
				String ime = rs.getString(1);
				int zuti = rs.getInt(2);
				int crveni = rs.getInt(3);
				System.out.println(ime + "   " + zuti + "   " + crveni);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ubaciFudbalera(String ime, String naziv) {
		try {
			PreparedStatement ps = con.prepareStatement (" INSERT INTO Fudbaler (IdFud, Ime, IdTim)"
					+ " VALUES ((SELECT MAX( IdFud )+1 FROM Fudbaler) , ?, (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ?))");
			ps.setString(1, ime);
			ps.setString(2, naziv);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ubaciTim(String ime, String mesto) {
		try {
			PreparedStatement ps = con.prepareStatement (" INSERT INTO Tim (IdTim, Naziv, Mesto)"
					+ " VALUES ((SELECT MAX( IdTim )+1 FROM Tim) , ?, ?)");
			ps.setString(1, ime);
			ps.setString(2, mesto);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ubaciUtakmicu(String imeGostujuceg, String imeDomaceg, int kolo, String ishod, int godina) {
		try {
			PreparedStatement ps = con.prepareStatement (" INSERT INTO Utakmica (IdUta, IdDomacin, IdGost, Kolo, Ishod, Godina) " + 
					" VALUES ((SELECT MAX( IdUta )+1 FROM Utakmica) ,(SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ?), " + 
					" (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ?), ?, ?, ?)");
			
			ps.setString(1, imeGostujuceg);
			ps.setString(2, imeDomaceg);
			ps.setInt(3, kolo);
			ps.setString(4, ishod);
			ps.setInt(5, godina);
			ps.execute();
			
			PreparedStatement ps1 = con.prepareStatement(" INSERT INTO Igrao (IdFud, IdUta, PozicijaIgraca )" + 
					" VALUES ((Select Fudbaler.IdFud FROM Fudbaler WHERE Fudbaler.IdTim = (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ? OR Tim.Naziv = ?))" + 
					", (SELECT Utakmica.IdUta FROM Utakmica WHERE Utakmica.IdDomacin = (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ?) " + 
					" AND Utakmica.IdGost = (SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv = ?))");
			
			ps1.setString(1, imeGostujuceg);
			ps1.setString(2, imeDomaceg);
			ps1.setString(3, imeDomaceg);
			ps1.setString(4, imeGostujuceg);
			ps1.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
