package com.corebeautycommerceidservice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class CoreBeautycommerceidServiceApplication {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			log.debug("Creating Database If It's Not Exist");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/", "postgres", "150600");
			statement = connection.createStatement();
			statement.executeQuery("SELECT count(*) FROM pg_database WHERE datname = 'beautycommerce'");
			ResultSet resultSet = statement.getResultSet();
			resultSet.next();
			int count = resultSet.getInt(1);
			if (count <= 0) {
				statement.executeUpdate("CREATE DATABASE beautycommerce");
				log.debug("Database Created Succesfully");
			} else {
				log.debug("Database Already Exist");
			}
		} catch (SQLException e) {
			log.error(e.toString());
		} finally {
			try {
				if (statement != null) {
					statement.close();
					log.debug("Closed Statement.");
				}
				if (connection != null) {
					log.debug("Closed Connection.");
					connection.close();
				}
			} catch (SQLException e) {
				log.error(e.toString());
			}
		}
		SpringApplication.run(CoreBeautycommerceidServiceApplication.class, args);
	}
}