import java.util.Scanner;


public class ProbA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProbA a = new ProbA();
		a.solve();
	}

	int sum = 0;
	
	private void solve() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int d = s.nextInt();
			sum = recurse(d);
		}
		s.close();
	}

	private int recurse(int d) {
		// TODO Auto-generated method stub
		if (d > 1) {
			if(d % 2 == 1) {
				return 2*recurse(d/2)+1; 
			}
			else {
				return 2*recurse(d/2)+1;
			}
		}
		return 1;
	}

}
