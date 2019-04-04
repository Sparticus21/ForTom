

public class modulus {
	
	public static void main(String[] args) {
	
		int startNum = 424;
		int[] arr = new int[15];
		String strOutput = "";
		
		populateArray(arr);
		reverseArray(arr);
		System.out.println("output: " + giveMeBinary(startNum, arr));
		
	}
	
	
	private static int[] populateArray(int[] arr) {
		arr[0] = 1;
		for(int i=1; i < arr.length; i++) {
			arr[i] = arr[i-1] * 2;
		}
		return arr;
	}
	
	
	private static String giveMeBinary(int value, int[] arr) {
		String temp = "";
		int remainder = value;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("i=" + i);
			System.out.print(" remainder=" + remainder);
			System.out.print(" arr["+i+"]=" + arr[i]);
			System.out.println("");
			if(remainder / arr[i] < 1) {
				if(temp.indexOf("1") > -1)
					temp = temp + "0";
			}
			else {
				temp = temp + "1";
				remainder = remainder - arr[i];
			}
		}
		
		
		return temp;
	}
	
	private static int[] reverseArray(int[] array) {
		for(int i=0; i<array.length/2; i++){
			  int temp = array[i];
			  array[i] = array[array.length -i -1];
			  array[array.length -i -1] = temp;
		}
		return array;
	}
	
	
	/*
	 * Start at max
	 * div by highest number in array
	 * if < 1 do nothing, , add a 0 to string, loop
	 * if >= 1 subtract value of array from number, add 1 to string, loop
	 * once at end of array, output
	 */
}
