package org.ramon.model;

public class Persona {
	private int id;
	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String email;
	private String img;
	
	

	public Persona(int id,String nombre, String apellido,String username,String email,String password,String img) {
		this.id=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.email=email;
		this.password = password;
		this.img=img;
	
	}
	public Persona(int id,String nombre, String apellido,String username,String email,String password) {
		this.id=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.email=email;
		this.password = password;
	
	}
	

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Persona(){}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
