package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StringBuffer data;  
   
	@Override
	public void init() throws ServletException {
		
		super.init();
		data=new StringBuffer();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		data.append(request.getParameter("productId").toString());
		data.append(request.getParameter("productName").toString());
		data.append(request.getParameter("description").toString());
		out.println(data);
		
	}

}