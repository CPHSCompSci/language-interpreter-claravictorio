package app;

public class Main {

  public static void main(String[] args) {
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("food");
    System.out.println(newWord);

  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word) {
    return "";
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message) {
    return "";
  }

  /**
   * This method uses the decode(String) and a Scanner to decode a word specified
   * by the user.
   */
  public static String decodeInput() {
    return "";
  }
  
  /**
   * This method uses the Lexicon translate(String) and a Scanner to encode a word specified
   * by the user.
   */
  public static String encodeInput() {
    return "";
  }
}