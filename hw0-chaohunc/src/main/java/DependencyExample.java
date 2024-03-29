import java.io.StringReader;
import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;
  /**
   * An example for Homework 0 of 11791 F13
   *
   * @author CH Chen <chaohunc@cs.cmu.edu>
  */
  public class DependencyExample {
    /**
     * Tokenize a sentence in the argument, and print out
     * the tokens to the console.
     *
     * @param args
  * * */

    public static void main(String[] args) {
      args= new String[1];
      args[0] = new String("I��m feeling good!");
      TokenizerFactory<Word> factory =
          PTBTokenizerFactory.newTokenizerFactory();
      Tokenizer<Word> tokenizer =
          factory.getTokenizer(new StringReader(args[0]));
      System.out.println(tokenizer.tokenize());
  } 
}

