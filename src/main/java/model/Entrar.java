package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Entrar.
 */
public class Entrar {

	/** The id usuario. */
	private int id_usuario;

	/** The nome user. */
	private String nome_user;

	/** The senha user. */
	private String senha_user;

	/**
	 * Instantiates a new entrar.
	 */
	public Entrar() {
		super();

	}

	/**
	 * Instantiates a new entrar.
	 *
	 * @param id_usuario the id usuario
	 * @param nome_user  the nome user
	 * @param senha_user the senha user
	 */
	public Entrar(int id_usuario, String nome_user, String senha_user) {
		super();
		this.id_usuario = id_usuario;
		this.nome_user = nome_user;
		this.senha_user = senha_user;

	}

	/**
	 * Gets the id usuario.
	 *
	 * @return the id usuario
	 */
	public int getId_usuario() {
		return id_usuario;
	}

	/**
	 * Sets the id usuario.
	 *
	 * @param id_usuario the new id usuario
	 */
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * Gets the nome user.
	 *
	 * @return the nome user
	 */
	public String getNome_user() {
		return nome_user;
	}

	/**
	 * Sets the nome user.
	 *
	 * @param nome_user the new nome user
	 */
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}

	/**
	 * Gets the senha user.
	 *
	 * @return the senha user
	 */
	public String getSenha_user() {
		return senha_user;
	}

	/**
	 * Sets the senha user.
	 *
	 * @param senha_user the new senha user
	 */
	public void setSenha_user(String senha_user) {
		this.senha_user = senha_user;
	}

	/**
	 * Sets the id usuario.
	 *
	 * @param id_usuario the new id usuario
	 */
	public void setId_usuario(String id_usuario) {

	}

}
