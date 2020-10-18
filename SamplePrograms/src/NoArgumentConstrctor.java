
public class NoArgumentConstrctor {
	
	String employeeName;
	int employeeId;
	
	NoArgumentConstrctor(){
		
		employeeName= "Raja";
		employeeId= 51586125;
		
	System.out.println("Employee object is crested");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoArgumentConstrctor nc= new NoArgumentConstrctor();
		
		System.out.println(nc.employeeId);
		System.out.println(nc.employeeName);
		

	}

}
