public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 group of similar words
		String[] testCase1 = new String[] { "battery", "rybatte", "bryetta", "bayrett" };
		// no similar words
		String[] testCase2 = new String[] { "book", "pen", "shower", "rain", "acid", "spirit" };
		// empty array
		String[] testCase3 = new String[0];
		// array with 1 word
		String[] testCase4 = new String[] { "hello" };
		// 1 group of similar words and other dissimilar words
		String[] testCase5 = new String[] { "flower", "erflow", "lowfer", "wolfer", "panic", "panacea", "wolfsbane" };
		// multiple groups of similar and dissimilar words
		String[] testCase6 = new String[] { "book", "kobo", "button", "nottub", "radio", "dario", "ink", "fluid" };
		// similar words with all 26 letters
		String[] testCase7 = new String[] { "abcdefghijklmnopqrstuvwxyz", "azbcdefghijklmnopqrstuvwxy" };
		Solution s = new Solution();

		s.getGroupedStrings(testCase1);
		s.getGroupedStrings(testCase2);
		s.getGroupedStrings(testCase3);
		s.getGroupedStrings(testCase4);
		s.getGroupedStrings(testCase5);
		s.getGroupedStrings(testCase6);
		s.getGroupedStrings(testCase7);

	}

}
