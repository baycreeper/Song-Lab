
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

//https://stackoverflow.com/questions/14274259/read-csv-with-scanner
public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		String artistScan, titleScan, yearScan, genreScan, lengthScan, shakinessScan, obscenityScan, danceabilityScan,
				loudnessScan, topicScan;

		Scanner scanner = new Scanner(
				new File("/workspaces/java-template/src/Songs AP CSA 2024-2025 - Songs with edits.csv"));
		scanner.useDelimiter(",");

		ArrayList<Song> Songs = new ArrayList<>();

		int totalSongs1982 = 0;
		int totalSongs1998 = 0;
		int totalSongs2011 = 0;
		double goodDanceability = 0.0;
		double greatestShakeability = 2;
		String greatestShakeabilityName = "";
		int longestLength = 0;
		String longestLengthName = "";
		double loudestSong = 0;
		String loudestSongName = "";

		Double obscenity1950s = 0.0;
		Double obscenity1960s = 0.0;
		Double obscenity1970s = 0.0;
		Double obscenity1980s = 0.0;
		Double obscenity1990s = 0.0;
		Double obscenity2000s = 0.0;
		Double obscenity2010s = 0.0;
		
		Double averageObscenity1950s = 0.0;
		Double averageObscenity1960s = 0.0;
		Double averageObscenity1970s = 0.0;
		Double averageObscenity1980s = 0.0;
		Double averageObscenity1990s = 0.0;
		Double averageObscenity2000s = 0.0;
		Double averageObscenity20001s = 0.0;

		int numSongs1950s = 0;
		int numSongs1960s = 0;
		int numSongs1970s = 0;
		int numSongs1980s = 0;
		int numSongs1990s = 0;
		int numSongs2000s = 0;
		int numSongs2010s = 0;

		while (scanner.hasNext()) {

			artistScan = scanner.next();
			titleScan = scanner.next();
			yearScan = scanner.next();
			genreScan = scanner.next();
			lengthScan = scanner.next();
			shakinessScan = scanner.next();
			obscenityScan = scanner.next();
			danceabilityScan = scanner.next();
			loudnessScan = scanner.next();
			topicScan = scanner.next();

			/*System.out.println("Artist: " + artistScan + " | Title: " + titleScan + " | Year: " + yearScan
					+ " | Genre: " + genreScan + " | Length: "
					+ lengthScan + " | Shakiness: " + shakinessScan + " | Obscenity: " + obscenityScan
					+ " | Danceability: "
					+ danceabilityScan + " | Loudness: " + loudnessScan + " | Topic: " + topicScan);*/
			Songs.add(new Song(titleScan, artistScan, Integer.parseInt(yearScan),
					genreScan,
					Integer.parseInt(lengthScan), Double.parseDouble(shakinessScan),
					Double.parseDouble(obscenityScan),
					Double.parseDouble(danceabilityScan), Double.parseDouble(loudnessScan),
					topicScan));

			if (Integer.parseInt(yearScan) == 1982) {
				totalSongs1982++;
			} else if (Integer.parseInt(yearScan) == 1998) {
				totalSongs1998++;
			} else if (Integer.parseInt(yearScan) == 2011) {
				totalSongs2011++;
			}

			if (Double.parseDouble(danceabilityScan) > 0.75) {
				goodDanceability++;
			}

			if (Integer.parseInt(lengthScan) > longestLength) {
				longestLength = Integer.parseInt(lengthScan);
				longestLengthName = titleScan;
			}

			if (Double.parseDouble(shakinessScan) < greatestShakeability) {
				greatestShakeability = Double.parseDouble(shakinessScan);
				greatestShakeabilityName = titleScan;
			}

			if (Double.parseDouble(loudnessScan) > loudestSong) {
				loudestSong = Double.parseDouble(loudnessScan);
				loudestSongName = titleScan;
			}

			if((Integer.parseInt(yearScan) >=1950) && (Integer.parseInt(yearScan) < 1960))
			{
				obscenity1950s += Double.parseDouble(obscenityScan);
				numSongs1950s++;
			}

			if((Integer.parseInt(yearScan) >=1960) && (Integer.parseInt(yearScan) < 1970))
			{
				obscenity1960s += Double.parseDouble(obscenityScan);
				numSongs1960s++;
			}

			if((Integer.parseInt(yearScan) >=1970) && (Integer.parseInt(yearScan) < 1980))
			{
				obscenity1970s += Double.parseDouble(obscenityScan);
				numSongs1970s++;
			}

			if((Integer.parseInt(yearScan) >=1980) && (Integer.parseInt(yearScan) < 1990))
			{
				obscenity1980s += Double.parseDouble(obscenityScan);
				numSongs1980s++;
			}

			if((Integer.parseInt(yearScan) >=1990) && (Integer.parseInt(yearScan) < 2000))
			{
				obscenity1990s += Double.parseDouble(obscenityScan);
				numSongs1990s++;
			}

			if((Integer.parseInt(yearScan) >=2000) && (Integer.parseInt(yearScan) < 2010))
			{
				obscenity2000s += Double.parseDouble(obscenityScan);
				numSongs2000s++;
			}

			if((Integer.parseInt(yearScan) >=2010) && (Integer.parseInt(yearScan) < 2020))
			{
				obscenity2010s += Double.parseDouble(obscenityScan);
				numSongs2010s++;
			}

		}
		String greatestShakeabilityString = doubleToString2(greatestShakeability);
		System.out.println("\n" + "---------------------------------------------------------------------------------");
		System.out.println("Total number of songs: " + Songs.size());
		System.out.println("Total number of songs from 1982: " + totalSongs1982);
		System.out.println("Total number of songs from 1998: " + totalSongs1998);
		System.out.println("Total number of songs from 2011: " + totalSongs2011);
		System.out.println("Number of songs that have danceability ratings above 0.75: " + goodDanceability);
		System.out.println("Name of longest song: " + longestLengthName + " | Length: " + longestLength);
		System.out.println("Name of song with the lowest shakeability score: " + greatestShakeabilityName
				+ " | Shakeability: " + greatestShakeabilityString);
		System.out.println("Name of the loudest song: " + loudestSongName + " | Loudness: " + loudestSong);
		System.out.println("Average obscenity level of the 1950s: " + (obscenity1950s/numSongs1950s));
		System.out.println("Average obscenity level of the 1960s: " + (obscenity1960s/numSongs1960s));
		System.out.println("Average obscenity level of the 1970s: " + (obscenity1970s/numSongs1970s));
		System.out.println("Average obscenity level of the 1980s: " + (obscenity1980s/numSongs1980s));
		System.out.println("Average obscenity level of the 1990s: " + (obscenity1990s/numSongs1990s));
		System.out.println("Average obscenity level of the 2000s: " + (obscenity2000s/numSongs2000s));
		System.out.println("Average obscenity level of the 2010s: " + (obscenity2010s/numSongs2010s));
		System.out.println("---------------------------------------------------------------------------------");
		scanner.close();
	}
	public static String doubleToString2(double d) {
		DecimalFormat fmt = new DecimalFormat("0.000000000");
		String string = fmt.format(d);
		return string;
		}
}
