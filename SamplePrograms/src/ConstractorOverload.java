
public class ConstractorOverload {

	String drew;

	ConstractorOverload() {

		System.out.println("Draw on Object");
	}
	ConstractorOverload(String toDraw){
		drew=toDraw;
		System.out.println("Deawing "+ toDraw);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstractorOverload co=new ConstractorOverload();
		ConstractorOverload co1=new ConstractorOverload("circle");


	}

}
