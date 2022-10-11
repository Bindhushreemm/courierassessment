package courierform;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/DisplayShipment")
public class DisplayShipment extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String fullname=(String) session.getAttribute("fullname");
		int cid=CourierDao.getid(fullname);
		int cid1=cid+0;
		
		courierpojo user=new courierpojo();
		
		
		out.print("<div style='background-color:#AA336A; color:black; align:center;'><h1 style='text-align:center; font-size:100px;'>Shipment Details</h1></div>");
		/*out.println("<body  style=' background: linear-gradient(to bottom, #ee9ca7 50%, #f7bb97 50%);\n"
				+ "  background-repeat: no-repeat;\n"
				+ "  background-attachment: fixed;\n"
				+ "  background-size: 100% 100%; '></body>");*/
		
		out.print("<style>\n"
				+ "\n"
				+ "td{\n"
				+ "	text-align:center;\n"
				+ "}\n"
				+ "</style>");
		
		
		
		 out.print("<table border='1px solid black' height='50%' width='30%' align='center' color='white' style='margin-top:180px; border:1px solid black; box-shadow: 2px 1px 21px -9px rgba(0,0,0,0.78); height=1800px;'> ");  
	        
	        
	      CourierDao obj=new CourierDao();
	        List<courierpojo1> list=new ArrayList<courierpojo1 >();
	        list=CourierDao.getAlldetailsinfo(cid1);
	       // List<Manager> list=ManagerDao.getAllEmployees();  
	      //  out.print("<tr style='background-color:pink;'><th>Name</th><th>dob</th><th>rollno</th><th>percentage</th><th>edu</th><th>cgpa</th><th>collegename</th><th>tutionfees</th><th>Nationality</th><th>Pan</th><th>Adhar</th><th>Status</th><th>Documents</th><th>fees document</th><th>Documents</th><th colspan='2'>Action</th></tr>");  
	        //out.println(list);
	        
	        for(courierpojo1 e:list){
	        	
	        	out.println("<tbody style='height=400px;'>");
	            out.print("<tr style='background-color:white;'><td style='align:center'> "+"Customer id"+"</td><td>"+e.getId()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Customer name"+"</td><td>"+e.getFullname()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Customer city"+"</td><td>"+e.getCity()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Delivery area"+"</td><td>"+e.getDarea()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Package weight in grams"+"</td><td>"+e.getPgrams()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"shipment date"+"</td><td>"+e.getShipmentdate()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Delivery date"+"</td><td>"+e.getDeliverydate()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Total payment"+"</td><td>"+e.getTotalpay()+"</td></tr>");
	            out.print("<tr style='background-color:white;'><td> "+"Courier tracking id"+"</td><td>"+e.getTrackingid()+"</td></tr>");
	            out.println("</tbody>");
	        
	        }
	       
	      
	        out.print("</table>");  
	        //out.println("<img src='obj.getimages()'>");
	          
	        out.close(); 
		
	}

}
