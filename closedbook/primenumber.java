package closedbook2.java;

public class primenumber {

	public static void main(String[] args) {
		int count=0;
		String prime="";
		for(int i=0;i<=100;i++) {
			count=0;
			for(int j=1;j>0;j--) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				prime=prime+i+"";
			}
		}
		System.out.println(prime);

	}

}
