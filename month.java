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
import sajid.dispmonth;
import sajid.dispmonth;
/**
 * Servlet implementation class monthrecord
 */
@WebServlet("/month")
public class month extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
	    PreparedStatement pstmt;
	    ResultSet rs;
	    boolean a;
	int l;
	String m=null;
	 List<dispmonth> dataList=new ArrayList<dispmonth>(); 
	    try {
	    	 PrintWriter out=response.getWriter();
	    	 
	 	
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  // Get a Connection to the database
	    	  
	    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
	    	  //Select the data from the database
	    	  pstmt=con.prepareStatement("select *from fir where Date between ? And ?");
	    	  pstmt.setString(1, request.getParameter("usrnm"));
	    	  pstmt.setString(2, request.getParameter("psw"));
	    	  
	    	  rs = (ResultSet)pstmt.executeQuery();
	    	  while (rs.next ()){
	    	  //Add records into data list
	    		  dispmonth ob=new dispmonth();
	    		  ob.setId(rs.getInt("id"));
	    		  ob. setRegistraion_no(rs.getString("reg_no"));
	    		  ob.setName(rs.getString("name"));
	    		  ob.setFname(rs.getString("fname"));
	    		  ob.setAdd(rs.getString("adress"));
	    		  ob.setM_no(rs.getString("m_no"));
	    		  ob.setAname(rs.getString("Aname"));
	    		  ob.setFname_a(rs.getString("fname_a"));
	    		  ob.setAdd_a(rs.getString("adress_a"));
	    		  ob.setEv(rs.getString("event_place"));
	    		  ob.setTime(rs.getString("Time"));
	    		  ob.setE_d(rs.getString("event_detail"));
	    		  ob.setDat(rs.getString("sdate"));
	    		 dataList.add(ob);
	    	  }
	    	  
	    	  request.setAttribute("data",dataList);
	    	 
	    	 
    			 
    		
	    
    RequestDispatcher dispatcher = request.getRequestDispatcher("resultmonth.jsp");
    if (dispatcher != null){
    dispatcher.forward(request, response);
    }	    
	    
	    }
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
	}

}
