package com.gl.demo.main;

import java.sql.SQLException;
import java.util.List;

import com.gl.demo.dao.ProductDAO;
import com.gl.demo.dao.ProductDAOImpl;
import com.gl.demo.dto.ProductDTO;

public class Main {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/ProductManagement";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "123456";
	
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
		
		try {
			List<ProductDTO> ls = productDAO.getAllProducts();
			for (ProductDTO productDTO : ls) {
				System.out.println(productDTO.getName());
			}
		} catch (SQLException e) {
			System.out.println("Error" + e.getMessage());
		}
	}
	
}
