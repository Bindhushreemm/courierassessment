package couriercalculations;

public class couriercalc {
	
	public static int distance(String city, String darea, String pgrams) {
		
		
		int dprice=0;
		int pgrams1=Integer.parseInt(pgrams);
		int pprice=0;
		int total=0;
		
		
		
		
		
		
		
		if( (city.equals("Bangalore") && darea.equals("Bagalkote")) || (city.equals("Bangalore") && darea.equals("Bagalkote"))) {
			dprice=350;
		}
		else if((city.equals("Bangalore") && darea.equals("Dharwad")) || (city.equals("Bagalkote") && darea.equals("Bangalore"))){
			dprice=380;
		}
		else if((city.equals("Bangalore") && darea.equals("Davanagere"))  || (city.equals("Davangere") && darea.equals("Bangalore"))) {
			dprice=400;
		}
		else if((city.equals("Bangalore") && darea.equals("Gadag")) ||  (city.equals("Gadag") && darea.equals("Bangalore"))){
			dprice=420;
		}
		else if((city.equals("Bangalore") && darea.equals("Udupi"))  || (city.equals("Udupi") && darea.equals("Bangalore"))) {
			dprice=480;
		}
		else if((city.equals("Bagalkote") && darea.equals("Dharwad"))  || (city.equals("Dharwad") && darea.equals("Bagalkote"))) {
			dprice=280;
		}
		else if((city.equals("Bagalkote") && darea.equals("Davangere"))  || (city.equals("Davangere") && darea.equals("Bagalkote"))) {
			dprice=380;
		}
		else if((city.equals("Bagalkote") && darea.equals("Gadag"))  || (city.equals("Gadag") && darea.equals("Bagalkote"))) {
			dprice=480;
		}
		else if((city.equals("Bagalkote") && darea.equals("Hubli"))  || (city.equals("Hubli") && darea.equals("Bagalkote"))) {
			dprice=380;
		}
		else if((city.equals("Bagalkote") && darea.equals("Dharwad"))  || (city.equals("Dharwad") && darea.equals("Bagalkote"))) {
			dprice=480;
		}
		else if((city.equals("Dharwad") && darea.equals("Davangere"))  || (city.equals("Davangere") && darea.equals("Dharwad"))) {
			dprice=380;
		}
		else if((city.equals("Dharwad") && darea.equals("Gadag"))  || (city.equals("Gadag") && darea.equals("Dharwad"))) {
			dprice=250;
		}
		else if((city.equals("Dharwad") && darea.equals("Udupi"))  || (city.equals("Udupi") && darea.equals("Dharwad"))) {
			dprice=550;
		}
		else if((city.equals("Davangere") && darea.equals("Gadag"))  || (city.equals("Gadag") && darea.equals("Davangere"))) {
			dprice=250;
		}
		else if((city.equals("Davangere") && darea.equals("Udupi"))  || (city.equals("Udupi") && darea.equals("Davangere"))) {
			dprice=250;
		}
		else if((city.equals("Gadag") && darea.equals("Udupi"))  || (city.equals("Udupi") && darea.equals("Gadag"))) {
			dprice=580;
		}
		
		else if((city.equals("Davangere") && darea.equals("Davangere"))  || (city.equals("Udupi") && darea.equals("Udupi")) ||   (city.equals("Gadag") && darea.equals("Gadag"))) {
			dprice=50;
		}
		else if((city.equals("Bangalore") && darea.equals("Bangalore"))  || (city.equals("Hubli") && darea.equals("Hubli")) ||   (city.equals("Bagalkote") && darea.equals("Bagalkote"))) {
			dprice=50;
		}
		
		
		
		
		if(pgrams1<=2000) {
			pprice=71;
		}
		else if(pgrams1>2000 && pgrams1<=4000) {
			pprice=120;
		}
		else if(pgrams1>4000 && pgrams1<=10000) {
			pprice=180;
		}
		else if(pgrams1>10000 && pgrams1<25000) {
			pprice=250;
		}
		total=dprice+pprice;
		return total;
		
		
	}

}
