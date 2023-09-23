package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConexaoUser {
	private static final ArrayList<Entrar> Entrar = null;

	/**  Módulo de conecção *. */

	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.01:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "475071";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 *  CRUD CREAT *.
	 *
	 * @param contato the contato
	 */
	public void inserirContato(Entrar contato) {
		String create = "insert into user (nome_user, senha_user) values (?,?)";
		try {

			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(create);

			pst.setString(1, contato.getNome_user());
			pst.setString(2, contato.getSenha_user());
			

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 *  CRUD READ *.
	 *
	 * @return the array list
	 */
	public ArrayList<Entrar> listarContatos() {

		ArrayList<Entrar> user = new ArrayList<>();
		String read = "select * from user order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

			    int  id_usuario = rs.getInt(1);
				String nome_user = rs.getString(2);
				String senha_user = rs.getString(3);
				

				user.add(new Entrar (id_usuario, nome_user, senha_user));

			}
			con.close();
			return Entrar;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 *  CRUD UPDATE *.
	 *
	 * @param contato the contato
	 */

	public void selecionarContato(Entrar contato) {
		String read2 = "select * from user where id_usuario = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, contato.getId_usuario());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				contato.setId_usuario(rs.getInt(1));
				contato.setNome_user(rs.getString(2));
				contato.setSenha_user(rs.getString(3));
				
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
