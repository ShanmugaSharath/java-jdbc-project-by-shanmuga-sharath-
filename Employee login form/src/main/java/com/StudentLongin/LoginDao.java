package com.StudentLongin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
      public boolean insert(User user) throws SQLException
      {
    	  Connection con=null;
    	  boolean result=false;
    	  try {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
    	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","Sharath@i2003");
    	  String query="Insert into Login(UserName,Password) values(?,?)";
    	  PreparedStatement pst=con.prepareStatement(query);
    	  pst.setString(1, user.getUserName());
    	  pst.setString(2, user.getPassword());
    	  
    	  ResultSet rs=pst.executeQuery();
    	  
    	  result=rs.next();
    	  }
    	  catch(ClassNotFoundException e)
    	  {
    		  e.printStackTrace();
    		  return result;
    	  }
    	  
    	  return result;
      }
}
