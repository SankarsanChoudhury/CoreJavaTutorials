package InterviewQuestion3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pr6_CountDupliCateWordsInAtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicateWords("java is best language in entire java");

	}
	
	public static void findDuplicateWords(String inputString) {
		
		//split method returns a String array
		String words[]=inputString.split(" ");
		
		//create one hashmap
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		
		//to check each word in given array:
		for(String word:words) {
			
			//if word is present:
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
			}
			else {
				//If value is not available 
				wordCount.put(word,1);
			}
		}
		
		//extracting all the keys of map-wordCount:
		//keySet() returns a set view of the keys contains in this map
		Set<String> wordsInString=wordCount.keySet();
		
		//loop through all the words in wordCount:
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word+":"+wordCount.get(word));
			}
		}
		
	}

}
