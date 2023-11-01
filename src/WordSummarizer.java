import java.util.Arrays;

public class WordSummarizer 
{
	// Objective:
	// Print a summary of the array of words passed in as parameter, by displaying
	// the counts of words beginning with each letter, when the count is at least
	// four.  Specifically, this should...
	// Print number of words beginning with "A"
	// Print number of words beginning with "B"
	// Print number of words beginning with "C"
	// etc.
	// BUT this should ignore a starting letter if there are fewer than 4 words beginning
	// with that letter.
	//
	// PRECONDITION: words is a non-null, non-empty array of ALL-CAPS English words
	//
	// Strategy: First sort the array parameter, so words are grouped by their
	// starting letter.  Then scan the array a single time, keeping track of
	// where each new group of words begins and ends.  Then print the count
	// for that word group if the count >= 4.
	public static void printSummary(String[] words)
	{
		// Note to self: Pretty sure Arrays.sort works, but I remember learning how
		// valuable it is to determine where in my code I go from being in an
		// "expected state" to being in an "unexpected state" whenever I hit
		// a bug.  So I should use a debugger to verify I'm in an "expected
		// state" after this line of code has executed (i.e., that words is sorted
		// in alphabetical order after this line of code).
		Arrays.sort(words);
		
		// Keeps track of the index at the beginning of a word group
		int sameLetterStart = 0;
		
		// Keeps track of the starting letter for the current word group
		String letter = words[0].substring(0,1);
		
		for (int i = 0; i < words.length - 1; i++)
		{
			// If the next word begins with a different letter, then i is at
			// the end of the current word group, and i + 1 begins the next word group
			if (!words[i + 1].substring(0, 1).equals(letter))
			{
				// New letter!
				int sameLetterEnd = i+1;
				
				
				
				if (sameLetterEnd - sameLetterStart >= 4)
				{
					System.out.println("Number of words beginning with '" + letter + "': " + (sameLetterEnd - sameLetterStart));

					// Update the tracking variables
					sameLetterStart = i+ 1;
					
					letter = words[i + 1].substring(0, 1);
					
					
					
					sameLetterEnd = 0;
				}
				letter = words[i + 1].substring(0, 1);
				sameLetterStart = i+1;
			}
			
			
		}
		if (words.length - sameLetterStart >= 4)
		{
			System.out.println("Number of words beginning with '" + letter + "': " + (words.length - sameLetterStart));
		}
	}
	
	
	// Expected output:
	//
	// Test 1:
	// Number of words beginning with 'A': 4
	//
	// Test 2:
	// Number of words beginning with 'A': 5
	// Number of words beginning with 'C': 6
	// Number of words beginning with 'E': 5
	// Number of words beginning with 'S': 8
	//
	// Test 3:
	// Number of words beginning with 'C': 6
	// Number of words beginning with 'E': 5
	// Number of words beginning with 'S': 8
	//
	// Test 4:
	// Number of words beginning with 'C': 5
	//
	public static void main(String[] args)
	{
		System.out.println("Test 1:");
		printSummary(new String[] {"ANIMAL", "ABATE", "ABBA", "CASTLE", "ABBREVIATE"});		

		System.out.println("\nTest 2:");
		printSummary(new String[] {"CATALOG", "ERRATIC", "CASTLE", "ERRONEOUS", "CAT", "SEEING", "SEED", "ERROR", "CAST", "CASUAL", "ANIMAL", "ABATE", "SEEP", "ERRATUM", "SEEM", "CASTANET", "ABBA", "SEEK", "DOG", "ERRATA", "SEE", "SEGMENT", "SEEN", "DRY", "ABANDON", "ABBREVIATE"});

		System.out.println("\nTest 3:");
		printSummary(new String[] {"SEGMENT", "CAST", "ERROR", "SEEP", "SEEN", "CASUAL", "ERRATUM", "SEEM", "CAT", "SEED", "ERRATIC", "SEEING", "SEEK", "CASTANET", "CATALOG", "ERRATA", "ERRONEOUS", "CASTLE", "SEE"});

		System.out.println("\nTest 4:");
		printSummary(new String[] {"CATALOG", "CASTLE", "ZEBRA", "CAT", "CAST", "CASUAL"});
	}
}