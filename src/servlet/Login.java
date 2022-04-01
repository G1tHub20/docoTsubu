package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

@WebServlet("/Login") //URLパターンの設定（@WebServletアノテーション）
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//dogetメソッド…サーブレットクラスがリクエストされると実行されるメソッド
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		//Userインスタンス（ユーザー情報）の生成
		User user = new User(name, pass);

	    System.out.println("★name=" + name);
	    System.out.println("★pass=" + pass);

		//ログイン処理
		LoginLogic loginLogic = new LoginLogic();
		Boolean isLogin = loginLogic.execute(user);

		//ログイン成功時の処理
		if(isLogin) {
			//ユーザー情報をセッションスコープに保存
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
	}
	//ログイン結果画面にフォワード
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp");
	dispatcher.forward(request, response);
	}
}
