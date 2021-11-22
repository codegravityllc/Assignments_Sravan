package w3school;

public class NestedLoop {

	public static void main(String[] args) {
		for(int j=0; j<=4; j++) {
		for(int i=0; i<=4; i++) {
			System.out.print(" * ");
		}
		System.out.println();
		}


		for(int j=1; j<=4; j++) {
			for(int i=2; i<=(j+1); i++) {
				System.out.print(" 1 ");
			}
			System.out.println();
			}
		for(int j=1; j<=4; j++) {
			for(int i=j; i<=(i-j); i++) {
				System.out.print(" 2 ");
			}
			System.out.println();
			}
	}

}
