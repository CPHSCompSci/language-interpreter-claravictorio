package app;
import java.util.Scanner;

//import interpreter.Lexicon;

public class Main {

  public static void main(String[] args) {
    Lexicon lex = new Lexicon();
    
    System.out.println("Decode (Language X to English)");
    for (int i = 0; i < 16; i++)
    {
        System.out.println("Sample " + i);
        System.out.println("original message: " + lex.getSample(i));    
        System.out.println("decoded message: " + decodeMessage(lex.getSample(i)));
    	System.out.println("");
    }
    
    System.out.println("encodeInput results in: " + encodeInput());
    System.out.println("decodeInput results in: " + decodeInput());
  }
  
  public static String delete(String word, int start, int end)
  {
	  String newWord = "";
	  for (int i = 0; i < word.length(); i++ )
	  {
		  if (!(i >= start && i < end))
			  newWord += word.charAt(i);
	  }
	  return newWord;
  }
  
  public static boolean isVowel(char c)
  {
	  return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
  
  public static boolean isConsonant(char c)
  {
	  return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word) 
  {
	  int start = word.indexOf("ent");
      if (start != -1 && start != 0 && isVowel(word.charAt(start-1)))
    	  word = delete(word, start, start+3);
      int end = word.lastIndexOf("ingy");
      if (end != -1 && isConsonant(word.charAt(end-1)) && word.charAt(end-1) != 's')
    	  word = delete(word, end, end+4);
      return word;
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message) 
  {
	  String newMessage = "";
	  String[] words = message.split(" ");
	  for (String w : words)
	  	{
		newMessage += decode(w);
		newMessage += " ";
		}		
		return newMessage;
  }

  /**
   * This method uses the decode(String) and a Scanner to decode a word specified
   * by the user.
   */
  public static String decodeInput() 
  {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter a word or sentence to translate into English: ");
	  String input = scan.nextLine();
	  return decodeMessage(input);
  }
  
  /**
   * This method uses the Lexicon translate(String) and a Scanner to encode a word specified
   * by the user.
   */
  public static String encodeInput() {
	  Lexicon l = new Lexicon();
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter a word in English: ");
	  String input = scan.nextLine();
	  return l.translate(input); 
  }
}