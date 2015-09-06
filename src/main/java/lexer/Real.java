package lexer;

/**
 *
 * @author Damien Chesneau - contact@damienchesneau.fr
 */
public class Real extends Token {

    public final float value;

    public Real(float v) {
        super(Tag.REAL);
        value = v;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
