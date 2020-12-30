package sajid;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection con = null;
		    PreparedStatement pstmt;
		    ResultSet rs;
		    boolean a;
		int l;
		String m=null;
		    try {
		    	 PrintWriter out=response.getWriter();
		    	 String name=request.getParameter("usrnm") ;
		 		String psw=request.getParameter("psw") ;
		 	
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  // Get a Connection to the database
		    	  
		    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
		    	  //Select the data from the database
		    	  pstmt=con.prepareStatement("insert into reg(name,m_no) values(?,?)");
		    	   

		    	pstmt.setString(1,name ); 
		    	pstmt.setString( 2, psw ); 
		    	
		    	
		    pstmt.execute();
		    
		    pstmt=con.prepareStatement("select id from reg where m_no=?");
		    pstmt.setString(1,psw);
		    rs=(ResultSet) pstmt.executeQuery();
		    if(rs.next()) {
		    	 l=rs.getInt("id");
		 
	    	  pstmt=con.prepareStatement("select reg_no from fir where id=?");
		    pstmt.setInt(1, l);
		    		
	    		  rs=(ResultSet) pstmt.executeQuery();
	    		  if(rs.next()) {
	    			  String q=rs.getString("reg_no");
	    			 
	    			  request.setAttribute("data",q);
	    			 
	    		  }
		    
		    }	
		    
//		    
//		    	l=rs.getInt("id");
//		   
//		    
//		  c
//		    pstmt.setInt(1, l);
//             rs=(ResultSet) pstmt.executeQuery();
//		     
//		  
//		    	m=rs.getString("reg_no");
//		    
//		    
//		    
//		    request.setAttribute("data",m);
//		    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("form1.jsp");
	    if (dispatcher != null){
	    dispatcher.forward(request, response);
	    }	    
		    
		    }
		    	catch(Exception e)
		    	{
		    	    
		    	     
		    	}
	}

}
