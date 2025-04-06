package bonusAssignment;

import java.net.URL;
import java.util.Scanner;

public class ReadNet {

	private String webLink;

	public ReadNet(String webLink) {
		this.webLink = webLink;
	}

	public void readWebLink() {
	//	String pageContent = "";


		try {
			URL address = new URL(webLink);
			Scanner scan = new Scanner(address.openStream());

			while (scan.hasNext()) {
				String line = scan.nextLine();
	//			pageContent += line + "\n";

				String indiciu = "list-group-item list-group-item-action";
				int index = line.indexOf(indiciu);
				while (index >= 0) {
					int startCountryIndex = line.indexOf("locations", index + indiciu.length());
					int startIndex = line.indexOf('>', index + indiciu.length());
					int endIndex = line.indexOf('&', index + indiciu.length());
//					System.out.println(startIndex + " " + endIndex);


					if (startCountryIndex < startIndex && startIndex < endIndex) {
						String countryAddress = line.substring(startCountryIndex + 9, startIndex - 1);

						String countryName = line.substring(startIndex + 1, endIndex);
						System.out.println(countryName + " " + countryAddress);

				//		String countryPageContent = "";
						String countryWebLink = webLink.substring(0, webLink.length() - 8) + countryAddress;





					}
					index = line.indexOf(indiciu, index + 1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	//	return pageContent;
	}
	private void extractCountryInfo(String countryAddress){
		String countryWeblink = webLink.substring(0, webLink.length() - 8) + countryAddress;
		try{
			URL countryWebAddress = new URL(countryWeblink);
			Scanner scanCountryAddress = new Scanner(countryWebAddress.openStream());

			while (scanCountryAddress.hasNext()) {
				String lineCountryAddress = scanCountryAddress.nextLine();

				if(lineCountryAddress.contains("Population:")){
					String population = extractData(lineCountryAddress, "Population:");
					System.out.println("Population: " + population);
				}

				if(lineCountryAddress.contains("% Christian:")){
					String christian = extractData(lineCountryAddress, "% Christian:");
					System.out.println("Christian: " + christian);
				}


				if(lineCountryAddress.contains("% Evangelical:")){
					String evangelical = extractData(lineCountryAddress, "% Evangelical:");
					System.out.println("Evangelical: " + evangelical);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private String extractData(String line, String key){
		int keyIndex = line.indexOf(key);
		if(keyIndex == -1){
			return "N/A";
		}
		int startDataIndex = line.indexOf("<td>", keyIndex) + 4;
		int endDataIndex = line.indexOf("</td>", startDataIndex);
		if(startDataIndex == -1 || endDataIndex == -1){
			return "N/A";
		}
		return line.substring(startDataIndex, endDataIndex).trim();
	}
}
