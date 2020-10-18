
public class InterfacemethodSample implements InterfaceMethod {


	@Override
	public void savings() {
		System.out.println("%5");		
	}

	@Override
	public void deposit() {
		System.out.println("%3");		

	}

	@Override
	public void fixed() {
		System.out.println("%5");		

	}

	public static void main(String[] args) {

		InterfacemethodSample is=new InterfacemethodSample();

		is.deposit();
		is.fixed();
		is.savings();
	}

}
