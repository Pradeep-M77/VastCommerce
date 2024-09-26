package com.vast.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.Logger;

import com.vast.vo.Product;

public class DaoVast implements IDao{
	static Logger logger = Logger.getLogger("vast");
	static ResourceBundle rb = ResourceBundle.getBundle("vast");
	private static IDao dao = new DaoVast();
	
	private DaoVast(){

	}

	static {
		try {
			Class.forName(rb.getString("driver"));
			logger.debug("driver loaded successfully");
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		}
	}

	public static IDao getDaoInstance() {
		return dao;
	}
	@Override
	public Set<Product> getProduct(String category) {
		Set<Product> set = new HashSet<>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(rb.getString("url"), rb.getString("uname"), rb.getString("pwd"));
			logger.debug("connected to MySqlserver successfully");
			String sql = "select * from employee where product_category=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, category);
			ResultSet rs = st.executeQuery();
			Product pro = null;
			while (rs.next()) {
				pro = new Product();
				pro.setProduct_Id(rs.getInt("product_id"));
				pro.setProduct_Name(rs.getString("product_name"));
				pro.setProduct_Price(rs.getDouble("product_price"));
				pro.setProduct_Category(rs.getString("product_category"));
				set.add(pro);
			}
			logger.info("By dept employee data retrieved from DB");

		} catch (SQLException e) {
			logger.error(e.getMessage());
		} finally {
			closeConnection(conn);
		}
		if (set.isEmpty()) {
			logger.error("Set is Empty");
		}
		return set;

	}

	private void closeConnection(Connection conn) {
		try {
			conn.close();
			logger.debug("connection is closed");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
}
