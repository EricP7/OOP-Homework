package bonusAssignment;

import java.net.URL;
import java.util.Scanner;

public class ReadNet {

	private String webLink;

	public ReadNet(String webLink) {
		this.webLink = webLink;
	}

	public String readWebLink() {
		String pageContent = "";

		try {
			URL address = new URL(webLink);
			Scanner scan = new Scanner(address.openStream());

			while (scan.hasNext()) {
				String line = scan.nextLine();
				pageContent += line + "\n";

				String indiciu = "list-group-item list-group-item-action";
				int index = line.indexOf(indiciu);
				while (index >= 0) {
					int startIndex = line.indexOf('>', index + indiciu.length());
					int endIndex = line.indexOf('&', index + indiciu.length());
//					System.out.println(startIndex + " " + endIndex);
					if (startIndex < endIndex) {
						String countryName = line.substring(startIndex + 1, endIndex);
						System.out.println(countryName);
					}
					index = endIndex;
				}
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return pageContent;
	}
}
