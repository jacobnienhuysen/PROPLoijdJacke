package prop.assignment0;

import java.io.FileNotFoundException;
import java.io.IOException;

//Needs an instance of Tokenizer class, and Tokenizer needs an instance of Scanner class.

public class Parser implements IParser {
	
	ITokenizer tokenizer;
	
	public Parser(){
		
		tokenizer = new Tokenizer();
		
	}
	/**
	 * Opens a file for parsing.
	 */
	void open(String fileName) throws IOException, TokenizerException{
		tokenizer.open(fileName);
	}
	
	public INode parseText(){
		INode theSentence = parseSentence();
		tokenizer.moveNext();
		Lexeme l = tokenizer.current();
	}
	
	/**
	 * Parses a program from file returning a parse tree (the root node of a parse tree).
	 */
	INode parse() throws IOException, TokenizerException, ParserException{
		
		return parse
	}

	/**
	 * Closes the file and releases any system resources associated with it.
	 */
	public void close() throws IOException ;
}