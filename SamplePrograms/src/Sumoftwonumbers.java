
public class Sumoftwonumbers {
	
	
	public int name( int b, int c) {
		
		int result= b+c;
		return result;
		
	}
	static int sub(int b, int c) {
		int result=b-c;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumoftwonumbers sn=new Sumoftwonumbers();
		System.out.println(sn.name(5,8));
		System.out.println(sub(10,5));
	}

}
