package sajid;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fir
 */
@WebServlet("/fir")
public class fir extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection con = null;
		    PreparedStatement pstmt;
		    boolean a;
		
		    try {
		    	 PrintWriter out=response.getWriter();
		    	 String v=request.getParameter("v") ;
		 		String fv=request.getParameter("fv") ;
		 		String av=request.getParameter("av") ;
		 		String mb=request.getParameter("mb") ;
		 		String na=request.getParameter("na") ;
		 		String fa=request.getParameter("fa") ;
		 		String aa=request.getParameter("aa") ;
		 		String p=request.getParameter("p") ;
		 		String t=request.getParameter("t") ;
		 		String d=request.getParameter("d") ;
		 		String r=request.getParameter("r") ;
		 	
		 		
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  // Get a Connection to the database
		    	  
		    	  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/azmi?useSSL=false", "root", ""); 
		    	  //Select the data from the database
//		    	  pstmt=con.prepareStatement("update fir  set name=?,fname=?,adress=?,m_no=?,Aname=?,fname_a=?,adress_a=?,event_place=?,Time=?,event_detail=? where reg_no=r");
//		    	   
		    	  pstmt=con.prepareStatement(" update fir  set name=?,fname=?,adress=?,m_no=?,Aname=?,fname_a=?,adress_a=?,event_place=?,Time=?,event_detail=? ,sdate=? ,date=? where reg_no=?");
	    	pstmt.setString(1,request.getParameter("v") ); 
	    	pstmt.setString( 2, request.getParameter("fv") ); 
	    	

		    	pstmt.setString(3,request.getParameter("av") ); 
		    	pstmt.setString( 4, request.getParameter("mb") );

		    	pstmt.setString(5,request.getParameter("na") ); 
		    	pstmt.setString( 6, request.getParameter("fa")); 
	    	

		    	pstmt.setString(7,request.getParameter("aa") ); 
	    	pstmt.setString( 8, request.getParameter("p") ); 

		    	pstmt.setString(9,request.getParameter("t")); 
		    	pstmt.setString( 10, request.getParameter("dt"));
		    	pstmt.setString( 11, request.getParameter("d"));
		    	 Calendar calendar = Calendar.getInstance();
		    	    java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
		    	    pstmt.setDate(12, ourJavaDateObject);
		    	pstmt.setString( 13, request.getParameter("r"));
		    	
		    	
		    	
		    	pstmt.execute();
		    	
		    	 pstmt=con.prepareStatement(" insert into record(mb_no,Fir_no,status) values(?,?,?)");
		    	  	pstmt.setString(1,request.getParameter("mb") ); 
		    	  	pstmt.setString(2,request.getParameter("r") ); 
		    		pstmt.setString(3,"unprocessed"); 
		    	  	pstmt.execute();
		    response.sendRedirect("home.jsp");
		    }
		   
		    	catch(Exception e)
		    	{
		    	    
		    	     
		    	}
	}

}
