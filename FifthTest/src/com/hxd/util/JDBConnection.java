package com.hxd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver" ;			//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
    private static final String DBURL = "jdbc:mysql://localhost:3306/webdemo";//锟斤拷锟斤拷URL
    private static final String DBUSER = "root" ;								//锟斤拷锟捷匡拷锟矫伙拷锟斤拷
    private static final String DBPASSWORD = "root";							//锟斤拷锟捷匡拷锟斤拷锟斤拷
	public static Connection getConnection(){
		Connection conn = null;													//锟斤拷锟斤拷一锟斤拷锟斤拷锟接讹拷锟斤拷
		try {
			Class.forName(DBDRIVER);											//注锟斤拷锟斤拷锟斤拷
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);		//锟斤拷锟斤拷锟斤拷佣锟斤拷锟�
		} catch (ClassNotFoundException e) {									//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟睫凤拷锟揭碉拷锟届常
			e.printStackTrace();										
		} catch (SQLException e) {												//锟斤拷锟斤拷SQL锟届常
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn) {//锟截憋拷锟斤拷锟接讹拷锟斤拷
		if(conn != null) {				//锟斤拷锟絚onn锟斤拷锟接讹拷锟斤拷为锟斤拷
			try {
				conn.close();			//锟截憋拷conn锟斤拷锟接讹拷锟斤拷锟斤拷锟�
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(PreparedStatement pstmt) {//锟截憋拷预锟斤拷锟斤拷锟斤拷锟�
		if(pstmt != null) {				//锟斤拷锟絧stmt预锟斤拷锟斤拷锟斤拷锟轿拷锟�
			try {
				pstmt.close();			//锟截憋拷pstmt预锟斤拷锟斤拷锟斤拷锟�
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(ResultSet rs) {//锟截闭斤拷锟斤拷锟斤拷锟斤拷锟�
		if(rs != null) {				//锟斤拷锟絩s锟斤拷锟斤拷锟斤拷锟斤拷锟轿猲ull
			try {
				rs.close();				//锟截憋拷rs锟斤拷锟斤拷锟斤拷锟斤拷锟�
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}