package symbols;

import lexer.*;

/**
 *
 * @author Damien Chesneau
 */
public class Array extends Type {

    private final Type of;                  // array *of* type
    private int size = 1;             // number of elements

    public Array(int sz, Type p) {
        super("[]", Tag.INDEX, sz * p.getWidth());
        size = sz;
        of = p;
    }

    public Type getOf() {
        return of;
    }

    @Override
    public String toString() {
        return "[" + size + "] " + of.toString();
    }
}
