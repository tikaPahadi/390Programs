import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int[] array = readFile("data.txt");
		Tree tree = new Tree(array);
		System.out.println(tree.root.data);
		//tree.inOrder(tree.root);
		
	}
	public static int[] readFile(String file){
		try{
			Scanner sc = new Scanner(new File(file));
			int count = 0;
			while(sc.hasNext()){
				sc.nextInt();
				count++;
			}
			//defining size for names/hashed
			int[] temp = new int[count];

			sc = new Scanner(new File(file));
			count = 0;
			while(sc.hasNextLine()){
				temp[count] = sc.nextInt();
				count++;
			}
			sc.close();
			return temp;

		} catch (Exception e){
			System.out.println("No file found.");
			return null;
		}
	}

}