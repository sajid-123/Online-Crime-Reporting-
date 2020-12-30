package sajid;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;
import sajid.getrecord;

/**
 * Servlet implementation class record
 */
@WebServlet("/record")
public class record extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con = null;
	    PreparedStatement pstmt;
	    ResultSet rs;
	    boolean a;
	int l;
	String m=null;
	 List<getrecord> dataList=new ArrayList<getrecord>(); 
	    try {
	    	 PrintWriter out=response.getWriter();
	    	 
	 	
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  // Get a Connection to the database
	    	  
	    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
	    	  //Select the data from the database
	    	  pstmt=con.prepareStatement("select *from record");
	    	  
	    	  
	    	  rs = (ResultSet)pstmt.executeQuery();
	    	  while (rs.next ()){
	    	  //Add records into data list
	    		  getrecord ob=new getrecord();
	    		  ob.setId(rs.getInt("id"));
	    		  ob.setMobile_No(rs.getString("mb_no"));
	    		  ob.setStaus(rs.getString("status"));
	    		  ob.setFIR_NO(rs.getString("Fir_no"));
	    		  ob.setSect(rs.getString("section"));
	    		 dataList.add(ob);
	    	  }
	    	  
	    	  request.setAttribute("data",dataList);
	    	 
	    	  
    			 
    		
	    
    RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
    if (dispatcher != null){
    dispatcher.forward(request, response);
    }	    
	    
	    }
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
		
		
		
		
		
	}

}
