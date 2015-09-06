package main;

import java.io.*;
import lexer.*;
import parser.*;

/**
 *
 * @author Damien Chesneau - contact@damienchesneau.fr
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }
}
