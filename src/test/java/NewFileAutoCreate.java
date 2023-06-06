import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class NewFileAutoCreate {
	public static void main(String[] args) throws IOException {
		// To create a folder. create object fpr class File with expected path
		File f = new File("D:\\FileNew\\Files\\test.txt");
		/*
		 * boolean n = f.mkdir(); System.out.println(n);
		 * 
		 * // to create folder inside folder boolean nf = f.mkdirs();
		 * System.out.println(nf);
		 * 
		 * // to create notepad in expected folder boolean cn = f.createNewFile();
		 * System.out.println(cn);
		 * 
		 * 
		 * // to find whether the notepad in the folder boolean b = f.isFile();
		 * System.out.println(b);
		 * 
		 * FileUtils.write(f, "I love All"); System.out.println("Done");
		 * 
		 * //to replace the value in notepad
		 * 
		 * FileUtils.write(f, "Nature", false); System.out.println("Done");
		 * 
		 * //to add value with old data FileUtils.write(f, " is priceless", true);
		 * System.out.println("Done");
		 */
		// To copy value from one notepad to another within folder, create 3 files class
		// with diff obj and path notpead name
		File f1 = new File("D:\\FileNew\\Files\\test1.txt");
		FileUtils.copyFile(f, f1);

		// to print value from Notepad
		List<String> read = FileUtils.readLines(f1);
		for (String stg : read) {
			System.out.println(stg);
		}

	}
}
