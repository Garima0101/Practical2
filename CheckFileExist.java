package practical2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckFileExist {

	public static void main(String[] args) {

		doesFileExist("src\\abc.txt");

	}

	public static void doesFileExist(String path) {

		try {
			FileInputStream fs = new FileInputStream(path);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}