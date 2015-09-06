package inter;

import lexer.*;
import symbols.*;

/**
 *
 * @author Damien Chesneau - contact@damienchesneau.fr
 */
public class Temp extends Expr {

    private static int count = 0;
    private int number = 0;

    public Temp(Type p) {
        super(Word.temp, p);
        number = ++count;
    }

    @Override
    public String toString() {
        return "t" + number;
    }
}
