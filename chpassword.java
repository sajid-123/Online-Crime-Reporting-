package sajid;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chpassword
 */
@WebServlet("/chpassword")
public class chpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    Connection con = null;
	    PreparedStatement pstmt;
	
	    try {
	    	 PrintWriter out=response.getWriter();
	    	
	 	
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  // Get a Connection to the database
	    	  
	    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
	    	  //Select the data from the database
	    	 
	    	 pstmt=con.prepareStatement("update  test set password=? where password=?");


	    	pstmt.setString(1,request.getParameter("psw2")  ); 
	    	pstmt.setString( 2, request.getParameter("psw1")  ); 
	    	
	    	
	    	
	    	
	    	boolean a=pstmt.execute();
	    	 if(a==false) {
			    	response.sendRedirect("home.jsp");
			    }else {
			    	out.println("incorrect username or password");
			    }
			    
	    	
	    }
	    	
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
	}

}
