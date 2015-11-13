

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tokenizer implements ITokenizer {
	
	IScanner scan;
	
	public Tokenizer(){
		
		scan = new Scanner();
		
	}
	
	/**
	 * Opens a file for tokenizing.
	 */
	public void open(String fileName) throws IOException, TokenizerException{
		scan.open(fileName);
	}
	/**
	 * Returns the current token in the stream.
	 */
	public Lexeme current(){
		
	}

	/**
	 * Moves current to the next token in the stream.
	 */
	public void moveNext() throws IOException, TokenizerException{
		
	}

	/**
	 * Closes the file and releases any system resources associated with it.
	 */
	public void close() throws IOException{
		
	}
}