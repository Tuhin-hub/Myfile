package cts.tuhin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TAsk extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public TAsk() {
        
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		int no=Integer.parseInt(request.getParameter("fact"));
		int fa=this.fact(no);
		pw.println("factorial of "+no+" is "+fa);
	}
	
	public int fact(int no) {
		if(no<=0)
			return 1;
		else return no*fact(no-1);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
