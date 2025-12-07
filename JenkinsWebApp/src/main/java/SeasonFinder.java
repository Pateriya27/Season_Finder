import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/season")
public class SeasonFinder extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		LocalDate date=LocalDate.now();
		
		int month=date.getMonthValue();
		
		String result="";
		
		if(month>=3&&month<=6)
			result+="Summer Season";
		else if(month>=7&&month<=10)
			result+="Rainy Season";
		else 
			result+="Winter Season";
	
		pw.println("<h1 style='width:300px;height:400px;background-color:yellow;text-align:center;color:blue'>"+result+"</h1>");
		
		
		
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
