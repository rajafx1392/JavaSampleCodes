
public class MethodOverridesample extends MethodOverriding {

	@Override
	public void iciciBank() {
		System.out.println("7% interest");

	}
	public void deposit() {
		System.out.println("8% interest");
	}

	@Override
	public void axisBank() {
		System.out.println("4% interest");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverridesample mo= new MethodOverridesample();

		mo.axisBank();
		mo.deposit();
		mo.iciciBank();

	}

}
