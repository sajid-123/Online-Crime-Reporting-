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
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection con = null;
		    PreparedStatement pstmt;
		    boolean a;
		
		    try {
		    	 PrintWriter out=response.getWriter();
		    	 String name=request.getParameter("usrnm") ;
		 		String psw=request.getParameter("psw") ;
		 	
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  // Get a Connection to the database
		    	  
		    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
		    	  //Select the data from the database
		    	  pstmt=con.prepareStatement("update record set section=? where Fir_no=?");
		    	   

		    	pstmt.setString(1,request.getParameter("usrnm") ); 
		    	pstmt.setString(2,request.getParameter("fir") ); 
		     
		    	pstmt.execute();
		    	 pstmt=con.prepareStatement("update record set status='processed' where Fir_no=? ");
		    	 pstmt.setString(1,request.getParameter("fir") ); 
			     
			    	pstmt.execute();
			    	response.sendRedirect("report.jsp");
		    
		    }
		    	catch(Exception e)
		    	{
		    	    
		    	     
		    	}
	}

}
