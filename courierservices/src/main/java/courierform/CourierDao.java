package courierform;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class CourierDao {

	public static boolean saveForm(String fullname, String city, String phono, String darea, String pgrams) {
		courierpojo user= new courierpojo();
		Statement stmt = null;
		try {
			String sql = "insert into customer(customername,city,phono,deliveryarea,packetweight) values('"+fullname+"','"+city+"','"+phono+"','"+darea+"','"+pgrams+"')";
			
			stmt = Util.getConnection().createStatement();
			
			 stmt.executeUpdate(sql);
			 return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			
			return false;
		}
		
	}

	public static int getid(String fullname) {
		courierpojo user= new courierpojo();
		Statement stmt = null;
		try {
			String sql = "select max(customerid) from customer";
			
			stmt = Util.getConnection().createStatement();
			
			 ResultSet rs=stmt.executeQuery(sql);
			 rs.next();
			 int id=rs.getInt(1);
			 return id;
		}
		catch(Exception e) {
			e.printStackTrace();
			
			return 0;
		}
		
	}

	public static void savePayment(int cid1, String fullname, String city, String darea, String pgrams, int totalpay, LocalDate date, LocalDate newDate) {
		courierpojo user= new courierpojo();
		Statement stmt = null;
		try {
			String sql = "insert into shipmentdetails(cid,fullname,city,darea,pgrams,shipmentdate,deliverydate,totalpay) values("+cid1+",'"+fullname+"','"+city+"','"+darea+"','"+pgrams+"','"+date+"','"+newDate+"','"+totalpay+"')";
			
			stmt = Util.getConnection().createStatement();
			
			 stmt.executeUpdate(sql);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}     
		
	}
	
	public static ResultSet getAllStatement(int accno) {
		List<courierpojo> list = new ArrayList<courierpojo>();
		Statement stmt = null;
		ResultSet rs=null;
		try {
			String sql = "select * from shipmentdetails where cid="+accno;
			stmt = Util.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		//	rs.next();
//			while(rs.next()) {
//				Customer user=new Customer();
//				user.setAccno(rs.getInt(1));
//				user.setStatement_amount(rs.getDouble(2));
//				user.setStatus(rs.getString(3));
//				user.setStatement_balance(rs.getDouble(4));
//				list.add(user);
//			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		return rs;

	}
	
	public static List<courierpojo1> getAlldetailsinfo(int cid1){
		List<courierpojo1> list = new ArrayList<courierpojo1>();
		Statement stmt = null;
		
		try {
			String sql = "select * from shipmentdetails where cid="+cid1;
			stmt = Util.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		//	rs.next();
			while(rs.next()) {
				courierpojo1 user=new courierpojo1();
				user.setId(rs.getInt(1));
				user.setFullname(rs.getString(2));
				user.setCity(rs.getString(3));
				user.setDarea(rs.getString(4));
				user.setPgrams(rs.getString(5));
				user.setShipmentdate(rs.getString(6));
				user.setDeliverydate(rs.getString(7));
				user.setTotalpay(rs.getInt(8));
				user.setTrackingid(rs.getInt(9));
				
				list.add(user);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		return list;
	}

	

}
