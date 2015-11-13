package prop.assignment0;

import java.io.IOException;

public class Parser implements IParser {
	
	ITokenizer tokenizer;
	
	public Parser(){
		tokenizer = new Tokenizer();
		
	}
	
	@Override
	public void open(String fileName) throws IOException, TokenizerException {
		tokenizer.open(fileName);
	}
	
	public INode parseText(){
		
		INode theSentence = parseSentence();
		
	}
	
	@Override
	public INode parse() throws IOException, TokenizerException, ParserException {
		return parseText();
	}

	@Override
	public void close() throws IOException {
	}
}
