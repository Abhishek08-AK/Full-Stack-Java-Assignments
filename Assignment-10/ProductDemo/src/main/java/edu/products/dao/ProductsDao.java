package edu.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.products.dbase.DatabaseConnection;
import edu.products.model.Products;

public class ProductsDao {

	public static int saveProduct(Products prod) throws ClassNotFoundException, SQLException {
		int result = 0;

		String insertStatement = "INSERT INTO products(p_name,p_price,qty,p_details) VALUES(?,?,?,?)";

		Connection con = DatabaseConnection.initializeDatabase();

		try (con) {

			PreparedStatement pst = con.prepareStatement(insertStatement);

			pst.setString(1, prod.getP_name());
			pst.setString(2, prod.getP_price());
			pst.setString(3, prod.getQty());
			pst.setString(4, prod.getP_details());

			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// update students code.................

	public static int updateProduct(Products prod) throws ClassNotFoundException, SQLException {
		int result = 0;

		String insertStatement = "update products set p_price=?, qty=?, p_details=? where p_name=?";

		Connection con = DatabaseConnection.initializeDatabase();

		try (con) {

			PreparedStatement pst = con.prepareStatement(insertStatement);

			pst.setString(1, prod.getP_price());
			pst.setString(2, prod.getQty());
			pst.setString(3, prod.getP_details());
			pst.setString(4, prod.getP_name());

			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static int deleteProduct(Products prod) throws ClassNotFoundException, SQLException {
		int result = 0;

		String insertStatement = "delete from products where p_name=?";

		Connection con = DatabaseConnection.initializeDatabase();

		try (con) {

			PreparedStatement pst = con.prepareStatement(insertStatement);

			pst.setString(1, prod.getP_name());

			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	//Get All Students Details

	public static List<Products> getProduct() throws ClassNotFoundException, SQLException {

		List<Products> prods = new ArrayList<>();

		String getStatement = "SELECT * FROM products";

		Connection con = DatabaseConnection.initializeDatabase();

		try (con) {

			PreparedStatement pst = con.prepareStatement(getStatement);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");
				String p_name = rs.getString("p_name");
				String p_price = rs.getString("p_price");
				String qty = rs.getString("qty");
				String p_details = rs.getString("p_details");
				
				prods.add(new Products(id, p_name, p_price, qty, p_details));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

//delete students code.................

	public static int deleteProductById(int id) throws ClassNotFoundException, SQLException {

		int del_status = 0;

		String getStatement = "DELETE FROM products WHERE id=" + id;

		Connection con = DatabaseConnection.initializeDatabase();

		try (con) {

			PreparedStatement pst = con.prepareStatement(getStatement);

			del_status = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return del_status;
	}

}
