package sajid;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;
import sajid.tdate;

/**
 * Servlet implementation class date
 */
@WebServlet("/date")
public class date extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
	    PreparedStatement pstmt;
	    ResultSet rs;
	    boolean a;
	int l;
	String m=null;
	 List<tdate> dataList=new ArrayList<tdate>(); 
	    try {
	    	 PrintWriter out=response.getWriter();
	    	 
	 	
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  // Get a Connection to the database
	    	  
	    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
	    	  //Select the data from the database
	    	  pstmt=con.prepareStatement("select *from date where dob between ? And ?");
	    	  pstmt.setString(1, request.getParameter("d"));
	    	  pstmt.setString(2, request.getParameter("t"));
	    	  rs = (ResultSet)pstmt.executeQuery();
	    	  while (rs.next ()){
	    	  //Add records into data list
	    		  
	    		  tdate ob=new tdate();
	    		  ob.setDate(rs.getDate("dob").toString());
	    		 
	    		  ob.setName(rs.getString("name"));
	    		 
	    		  dataList.add(ob);
	    		 
	    	  }
	    	  
	    	  request.setAttribute("data",dataList);
	    	 
	    	  
    			 
    		
	    
    RequestDispatcher dispatcher = request.getRequestDispatcher("desc.jsp");
    if (dispatcher != null){
    dispatcher.forward(request, response);
    }	    
	    
	    }
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
	}

}
