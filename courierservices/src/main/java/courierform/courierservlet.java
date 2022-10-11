package courierform;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import couriercalculations.couriercalc;


@WebServlet("/courierservlet")
public class courierservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fullname=request.getParameter("fullname");
		HttpSession session=request.getSession();
		session.setAttribute("fullname", fullname);
		
		String city=request.getParameter("city");
		String phono=request.getParameter("phono");
		String darea=request.getParameter("city1");
		String pgrams=request.getParameter("pgrams");
		courierpojo user=new courierpojo();
		user.setFullname(fullname);
		user.setCity(city);
		user.setDarea(darea);
		user.setPhono(phono);
		user.setPgrams(pgrams);
		int cid=CourierDao.getid(fullname);
		int cid1=cid+1;
//		HttpSession session=request.getSession();
//		session.setAttribute("customerid", cid1);
		System.out.println(cid);
		int totalpay=couriercalc.distance(city,darea,pgrams);
		LocalDate date = LocalDate.now();
		
		
		
		out.print("<style>\n"
				+ "button{\n"
				+ "background-color:pink;\n"
				+ "}\n"
				+ "</style>");
		LocalDate newDate = date.plusMonths(2); 
		if(CourierDao.saveForm(fullname,city,phono,darea,pgrams)) {
		
			CourierDao.savePayment(cid1,fullname,city,darea,pgrams,totalpay,date,newDate);
		    RequestDispatcher rd = request.getRequestDispatcher("courierbookingform.jsp");
			rd.include(request, response);
			out.println("<button align='bottom' style='font:size:140%; margin-top:30%; width:150px; color:black; background-colour:pink; margin-left:850px;'>"+"<a href='DisplayShipment'>"+"Pay"+couriercalc.distance(city,darea,pgrams)+"</a>"+"</button>");
		}
		else {
			out.println("failure");
		}
		
		
	}

}
