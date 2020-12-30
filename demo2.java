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

/**
 * Servlet implementation class demo2
 */
@WebServlet("/demo2")
public class demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		Connection con = null;
	    PreparedStatement pstmt;
	    ResultSet rs;
	    boolean a;
	int l;
	
	 List<tdate> dataList=new ArrayList<tdate>(); 
	    try {
	    	String m=null;
	    	 PrintWriter out=response.getWriter();
	    	String[] as=request.getParameterValues("car");
	    for(int i=0; i<as.length; i++) {
	    	 m+=as[i];
	    	out.println(as[i]);
	    
	    }
	    out.println(m);
	    }
	    	catch(Exception e)
	    	{
	    	    
	    	     
	    	}
	}

}
