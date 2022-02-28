package services;


public class Operations implements ArrayOp{
	
	@Override
	public int sum(int[] array) {
		
		return sum(array, 0);
	}
	
	private int sum(int[] array, int index) {
		
		if(index == array.length-1) return array[index];
		
		return array[index] + sum(array, index+1);
		
	}

}
