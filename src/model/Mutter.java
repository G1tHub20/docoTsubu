package model;

import java.io.Serializable;

public class Mutter implements Serializable { //■つぶやきに関する情報を持つJavaBeansのモデル
	private String Username;
	private String text;


	public Mutter() {}

	public Mutter(String Username, String text) {
		this.Username = Username;
		this.text = text;
	}

	public String getUserName() {return Username;}
	public String getText() {return text;}

}
