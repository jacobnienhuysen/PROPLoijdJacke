

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
		
		Lexeme temp = new Lexeme(null,null);
		
		return temp;
	}
	
	
	public void assignment(){
		try{
			char temp = scan.current();
			//assign = id , ’=’ , expr , ’;’ ;
			if(Character.isLowerCase(temp)){

				while(scan.current() != '='){
					moveNext();
				}
				
				expression();
			}
			
		}catch(IOException e){
			
		}catch(TokenizerException e){
			
		}
	}
	
	public void expression(){
		//expr = term , [ ( ’+’ | ’-’ ) , expr ] ;
		
		
	}
	
	public void term(){
		//term = factor , [ ( ’*’ | ’/’) , term] ;
		
		
	}
	
	public void factor(){
		//factor = int | ’(’ , expr , ’)’ ;
		
		
	}

	/**
	 * Moves current to the next token in the stream.
	 */
	public void moveNext() throws IOException, TokenizerException{
		scan.moveNext();
	}

	/**
	 * Closes the file and releases any system resources associated with it.
	 */
	public void close() throws IOException{
		scan.close();
	}
}