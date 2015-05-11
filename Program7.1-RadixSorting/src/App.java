import java.io.File;
import java.util.Scanner;


public class App {

	public static void main(String[] args){
		/*	
		//Radix Sort Integer
			int[] array = {145,234,566,111,235,890,769,444,222,112,199};
			RadixSort r = new RadixSort();
			r.sort(array, 3);
		*/
		
		
		
		
		String[] array = readFile();
		RadixSortString s = new RadixSortString(array);
		s.sort(3);
				
	}
	
	
	
	
	
	
	
	
	
	
	/* Supporters */
	
	public static String[] readFile(){
		String[] names = null;
		try{
			Scanner sc = new Scanner(new File("names.txt"));
			int count = 0;
			while(sc.hasNextLine()){
				sc.nextLine();
				count++;
			}
			//defining size for names
			names = new String[count];

			sc = new Scanner(new File("names.txt"));
			count = 0;
			while(sc.hasNextLine()){
				names[count] = sc.nextLine();
				count++;
			}
		
			sc.close();

		} catch (Exception e){
			System.out.println("No file found.");
		}
		
		return names;
	}

	public static void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i] + " ");
		}
	}
	
	public static void print(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i]);
			println("");
		}
	}
	
	public static void print(Object o){
		System.out.print(o);	
		
	}
	
	public static void println(Object o){
		System.out.println(o);
	}
	
	public static void print(String[] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i] + " ");
		}
	}
	
	public static void print(String[][] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i]);
			println("");
		}
	}
	

}