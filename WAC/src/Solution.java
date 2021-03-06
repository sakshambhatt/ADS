import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public String getStringCode(byte[] frequencyArr) {
		int ASCII_OF_A = 97;
		StringBuilder sb = new StringBuilder(52);
		for (int counter = 0; counter < 26; counter++) {
			int asciiOfCounter = ASCII_OF_A + counter;
			char charOfCounter = (char) asciiOfCounter;
			sb.append(charOfCounter);
			sb.append(Character.forDigit(frequencyArr[counter], 10));
		}
		return sb.toString();
	}

	public byte[] getFrequencyArr(char[] currWordCharArr) {
		byte[] frequencyArr = new byte[26];
		for (int counter = 0; counter < currWordCharArr.length; counter++) {
			// ascii of char - ascii of a
			int index = (int) currWordCharArr[counter] - 97;
			frequencyArr[index] += 1;
		}
		return frequencyArr;
	}

	public ArrayList<ArrayList<String>> getGroupedStrings(String[] words) {

		HashMap<String, ArrayList<Integer>> wordGroups = new HashMap<>();
		for (int counter = 0; counter < words.length; counter++) {

			String currWord = words[counter];
			char[] currWordChars = currWord.toCharArray();
			byte[] frequencyArr = getFrequencyArr(currWordChars);
			String stringCode = getStringCode(frequencyArr);
			if (wordGroups.containsKey(stringCode)) {
				// add to value
				ArrayList<Integer> buffArr = wordGroups.get(stringCode);
				buffArr.add(counter);

			} else {
				// set key and value
				ArrayList<Integer> buffArr = new ArrayList<Integer>();
				buffArr.add(counter);
				wordGroups.put(stringCode, buffArr);
			}
		}

		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		Iterator<Entry<String, ArrayList<Integer>>> wgIterator = wordGroups.entrySet().iterator();
		while (wgIterator.hasNext()) {

			ArrayList<String> similarWords = new ArrayList<String>();

			Map.Entry<String, ArrayList<Integer>> mapElement = (Map.Entry<String, ArrayList<Integer>>) wgIterator
					.next();

			ArrayList<Integer> indexList = mapElement.getValue();
			indexList.forEach(index -> similarWords.add(words[index]));
			output.add(similarWords);
		}
		System.out.println(output);
		return output;
	}
}
