package model;

public class LoginLogic { //■ログインに関する処理を行うモデル
	public boolean execute(User user) {
		if(user.getPass().equals("1234")) {
			return true;
		}
		return false;
	}
}
