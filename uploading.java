package sajid;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest; 

/**
 * Servlet implementation class uploading
 */
@WebServlet("/uploading")
public class uploading extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		MultipartRequest m=new MultipartRequest(request,"G:/new");  
		out.print("successfully uploaded");  
		
		
		
		
	}

}
