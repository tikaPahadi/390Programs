
public class RadixSortString {

	public String[] namesArray;
	RadixSortString(String[] namesArray){
		this.namesArray = namesArray;
	}
	
	void sort(int length){
		int place = length;
		while(place >= 0){
			
			//Step 1 : Make Buckets
			String[][] bucket = new String[26][namesArray.length];
			
			for(int i = 0; i < namesArray.length; i++){

				String name = namesArray[i];
				int placeValue = getPositionValue(name,place);
				
				//Step 2: We got the place value. Now we add it in bucket
				pushArray(bucket[placeValue], name);
				
			}
			
			
			//Step 3  : Fetch From Buckets
	
			namesArray = fetch(bucket,namesArray.length);
			

			App.println("\nSorted Place Order of " + place);
			//App.print(bucket);
			App.print(namesArray);
			//Step 4 : Again !!!!
			place--;
		}

			
	
	}
	
	
	


	String[] fetch(String[][] bucket, int size){
		String[] returnArray = new String[size];
		int ptr = 0;
		
		for(int i = 0; i < bucket.length; i++){
			for (int j = 0; j < bucket[i].length; j++){
				if(bucket[i][j] != null){
					returnArray[ptr] = bucket[i][j];
					ptr++;
				}
				
			}
		}
		return returnArray;
		
	}
	
	
	void pushArray(String[] arr, String name){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == null){
				arr[i] = name;
				break;
			}
		}
		
	}
	
	int getPositionValue(String name, int pos){
		if(name.length() > pos){
			int atPos = (int) name.charAt(pos) - 97;
			return atPos;	
		} else {
			return 0;
		}
		
	}
	
	
}
