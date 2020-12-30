package sajid;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class time
 */
@WebServlet("/time")
public class time extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection con = null;
		    PreparedStatement pstmt;
		
		    try {
		    	 PrintWriter out=response.getWriter();
		    	 String name=request.getParameter("usrnm") ;
		 		String psw=request.getParameter("psw") ;
		 	
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  // Get a Connection to the database
		    	  
		    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
		    	  //Select the data from the database
		    	 
		    	   
		    	   
		    	  Calendar calendar = Calendar.getInstance();
		    	    java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
		    	    
		    	    // (3) create our date insert statement
		    	    String query = "INSERT INTO date (dob) VALUES (?)";
		    	    PreparedStatement st = con.prepareStatement(query);
		    	    st.setDate(1, ourJavaDateObject);

		    	    // (4) execute the insert statement, then shut everything down
		    	    st.executeUpdate();
		    	
		    	 request.getRequestDispatcher("home.jsp").include(request, response);  
		    }
		    	catch(Exception e)
		    	{
		    	    
		    	     
		    	}
	}

}
