package Event_package;

import Main_package.login;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;

public class mysql {
	String ver;// �汾��
	public static String user;// �˺�
	public static String password;// ����
	public static String State;// ״̬
	Connection con=null;// ���ӽӿ�
	Statement sta=null;// ����sql�ӿ�
	ResultSet res=null;// ����ӿ�
	public mysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://158.247.192.70:3306/experiment";// IP:�˿�/���ݿ���
			String username="Administrator";
			String password="HpypAjFh6NhjBYxp";
			con=DriverManager.getConnection(url,username,password);
			sta=con.createStatement();// ����Statement����
			res=sta.executeQuery("select * from Resilio_sync");
			while(res.next()) {
				ver=res.getString("ver");
				user=res.getString("user");
				this.password=res.getString("password");
				State =res.getString("State");
				break;
			}
			if (ver.equals("V2.6")) {// �ı�汾��ͬʱ�ı����¼�-���ڰ汾��
				login l=new login();
			}else {
				JOptionPane.showMessageDialog(null, "���Ŀͻ��˲������°汾,�����!", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
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
	// �������ݿ��˺�����
	public void mysql_genggai(){
		String xiugai_sql="UPDATE 'Resilio_sync' SET 'user'='userver','password'='passwordver' WHERE 1";
		try {
			sta.executeUpdate(xiugai_sql);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
}
