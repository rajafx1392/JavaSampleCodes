
public class MethodeOverLoading {

	public void empId(String name) {

		System.out.println("Employee Name"+ name);
	}

	public void empId(int IDNO ) {
		System.out.println("Employee ID"+ IDNO);

	}

	public void empId(String email, long phoneNo ) {
		System.out.println("EmaiID "+ email);
		System.out.println("Phone number is "+ phoneNo);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodeOverLoading e=new MethodeOverLoading();

		e.empId("Raja");
		e.empId(5158125);
		e.empId("rajafx1392@gmail.com", 8012072);



	}

}
