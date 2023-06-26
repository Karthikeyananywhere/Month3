package logical;

public class Array2 {
	
	public static void main(String[] args) {
 
		Integer [] input = {1,3,2,1};
		
		Integer [] result=new Integer[input.length+input.length];
		
		Integer [] concatt=null;
	
		concatt=concat(result, input);
		
		
		
		
		 for (int i = 0; i < concatt.length; i++) {
			System.out.println(concatt[i]);
		}
	}
	
	public static Integer[] concat(Integer [] result,Integer [] input) {
		
		Integer [] resultant=result;
		
		for (int i = 0,j=0; i < resultant.length && j<input.length; i++,j++) {
				
				resultant[i]=input[j];				
						
}
        for (int i = 0,j=0; i < resultant.length && j<input.length; i++) {
			
        	if (resultant[i]==null) {
				resultant[i]=input[j];
				j++;
			}
        	
		}		
	
		return resultant;
		
	}

}
