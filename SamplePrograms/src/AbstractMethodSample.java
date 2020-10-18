
public class AbstractMethodSample extends AbstractMethod {

	@Override
	public void enginee() {
		System.out.println("BMW enginee");		
	}

	@Override
	public void companyvolt() {
		System.out.println("BMW company volt");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractMethod am=new AbstractMethodSample();

		am.enginee();
		am.companyvolt();
		am.carDatails();

	}

}
