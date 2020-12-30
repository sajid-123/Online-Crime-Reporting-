package sajid;

import java.io.IOException;

 import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.PreparedStatement;
 import java.sql.DriverManager;
import java.sql.Blob;
import java.sql.Connection;

@WebServlet("/registration")
public class registration extends HttpServlet {
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
	    	  pstmt=con.prepareStatement("delete  from  test where id=1");
	    	    pstmt.execute();
	    	    pstmt=con.prepareStatement("insert into test(id)" +
	    	"values(1)");
	    	    pstmt.execute();
	   
	    	 pstmt=con.prepareStatement("update  test set name=?,password=? where id=1");


	    	pstmt.setString(1,name ); 
	    	pstmt.setString( 2, psw ); 
	    	
	    	
	    	pstmt.execute();
	    	
	    	
	    	 request.getRequestDispatcher("home.jsp").include(request, response);  
	    }
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
	}

}
