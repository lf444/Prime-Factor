import java.util.ArrayList;
import java.util.List;


public class DecompositionEnFacteursPremiers {
	List<Integer> factors;
	public List<Integer> compute(int n) {
		this.factors = new ArrayList<Integer>();

	
		for(int i=2;i<=n/i;i++) {
			while(n%i==0) {
				factors.add(i);
				n=n/i;
			}
		}

		
		
		if (n>1)
			this.factors.add(n);
		return factors;
	}
}