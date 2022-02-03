package cse.project.persistence;

import java.sql.*;

public class PersistenceService {
	String url = "35.228.65.73";
	String user = "postgres";
	String password = "78en8hLiwpPuJOdB";

	public void saveProductRating(String productId, Integer rating) {
		if (productId == null || rating == null) return;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			statement.executeQuery("INSERT INTO product_reviews(product_id, review) VALUES(" + productId + ", " + rating + ");");
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}

	}

	public double getProductRating(String productId) {
		if (productId == null) return 0;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT avg(rating) FROM product_reviews WHERE productId='" + productId +"';");
			return resultSet.getDouble(0);
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return 0;
	}

	public int getNumberOfProductRatings(String productId) {
		if (productId == null) return 0;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT count(rating) FROM product_reviews WHERE productId='" + productId +"';");
			return resultSet.getInt(0);
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return 0;
	}

	public void saveShopRating(Integer rating) {
		if (rating == null) return;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			statement.executeQuery("INSERT INTO shop_reviews(review) VALUES(" + rating + ");");
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}

	}

	public double getShopRating() {
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT avg(rating) FROM shop_reviews;");
			return resultSet.getDouble(0);
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return 0;
	}

	public int getNumberOfShopRatings() {
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT count(rating) FROM shop_reviews;");
			return resultSet.getInt(0);
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return 0;
	}

	
}
