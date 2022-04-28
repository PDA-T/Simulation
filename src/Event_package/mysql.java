package Event_package;

import Main_package.login;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;

public class mysql {
	String ver;// 版本号
	public static String user;// 账号
	public static String password;// 密码
	public static String State;// 状态
	Connection con=null;// 链接接口
	Statement sta=null;// 发送sql接口
	ResultSet res=null;// 结果接口
	public mysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://158.247.192.70:3306/experiment";// IP:端口/数据库名
			String username="Administrator";
			String password="HpypAjFh6NhjBYxp";
			con=DriverManager.getConnection(url,username,password);
			sta=con.createStatement();// 创建Statement对象
			res=sta.executeQuery("select * from Resilio_sync");
			while(res.next()) {
				ver=res.getString("ver");
				user=res.getString("user");
				this.password=res.getString("password");
				State =res.getString("State");
				break;
			}
			if (ver.equals("V2.6")) {// 改变版本号同时改变总事件-关于版本号
				login l=new login();
			}else {
				JOptionPane.showMessageDialog(null, "您的客户端不是最新版本,请更新!", "提示",JOptionPane.INFORMATION_MESSAGE);
				java.net.URI uri = new java.net.URI("http://91king.xyz/Download/Resilio_sync.exe");
				java.awt.Desktop.getDesktop().browse(uri);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 更改数据库账号密码
	public void mysql_genggai(){
		String xiugai_sql="UPDATE 'Resilio_sync' SET 'user'='userver','password'='passwordver' WHERE 1";
		try {
			sta.executeUpdate(xiugai_sql);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
}
