package queriesOfSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class RunSQLCommand {
    public static void main(String[] args) throws  ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = null;
    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "ranjeet09");
    	Statement statement = connection.createStatement();
    	ResultSet resultSet = statement.executeQuery("Select * from CustomerInfo where Location ='Asia';");
    	resultSet.next();
    	System.out.println(resultSet.getString(1));
	System.out.println(resultSet.getString(2));
	System.out.println(resultSet.getInt(3));
	System.out.println(resultSet.getString(4));
	
	while(resultSet.next()) {
		System.out.println(resultSet.getString(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getInt(3));
		System.out.println(resultSet.getString(4));
	
	}
	connection.close();
	
    }
}
