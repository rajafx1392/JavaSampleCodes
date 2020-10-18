
public class ParameterizedConstractor {

	String animelname;
	String animaltype;

	public ParameterizedConstractor(String name,String type) {
		animelname=name;
		animaltype=type;

	}

	private void sayAboutAnimal() {
		System.out.println("Amimal Name is "+ animelname + "Animal Type is: "+ animaltype );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstractor pc=new ParameterizedConstractor("lion", "King of forest");
		pc.sayAboutAnimal();

		ParameterizedConstractor pc1=new ParameterizedConstractor("tiger", "stongest animal");
		pc1.sayAboutAnimal();
	}

}
