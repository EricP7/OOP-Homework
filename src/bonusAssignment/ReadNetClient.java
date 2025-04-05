package bonusAssignment;

public class ReadNetClient {

	public static void main(String[] args) {

		ReadNet readNet = new ReadNet("https://operationworld.org/locations/europe/");

		String pageContent = readNet.readWebLink();

//		System.out.println(pageContent);
	}

}
