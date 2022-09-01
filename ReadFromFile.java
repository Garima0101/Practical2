package practical2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		readWordMeanings("src\\practical2\\dictionary.txt");

	}

	public static void readWordMeanings(String path) {

		try {
			File txtfile = new File(path);
			FileReader fr = new FileReader(txtfile);
			BufferedReader reader = new BufferedReader(fr);

			try {

				String line = null;

				while ((line = reader.readLine()) != null) {
					String[] words = line.split("-", 2);
					String[] meaning = words[1].split(",");
					System.out.println(words[0].trim());
					for (String str : meaning) {
						System.out.println(str.trim());
					}

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
