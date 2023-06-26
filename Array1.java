package logical;

public class Array1 {
	
	public static void main(String[] args) {
		Integer [] input= {1,1,1,1};
		   
		goodPairs(input);
		
	}

	public static void goodPairs(Integer [] input) {
		int count=0;
		for (int i = 0; i < input.length; i++) {
			
			for (int j = i+1; j <= input.length-1; j++) {
				
				if(input[i]==input[j]) {
					System.out.println("The Pairs are "+" "+ (i+","+j));
					count++;
				}
				
			}
		}
		System.out.println("The Count is "+count);
	}

}
