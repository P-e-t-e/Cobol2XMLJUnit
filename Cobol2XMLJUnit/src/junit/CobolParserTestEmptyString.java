package junit;

import static org.junit.Assert.*;
import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class CobolParserTestEmptyString {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		assertTrue( out.stackIsEmpty() );
	}

}