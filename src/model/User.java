package model;

import java.io.Serializable;

public class User implements Serializable { //■ユーザーに関する情報を持つJavaBeansのモデル
											//java.io.Serializableを実装
	private String name;
	private String pass;


	public User() {} //引数無しのコンストラクタ

	public User(String name, String pass) { //コンストラクタ
		this.name = name;
		this.pass = pass;
	}

	public String getName() {return name;} //ゲッター
	public String getPass() {return pass;}

}
