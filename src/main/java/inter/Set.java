package inter;

import symbols.*;

/**
 *
 * @author Damien Chesneau - contact@damienchesneau.fr
 */
public class Set extends Stmt {

    private final Id id;
    private final Expr expr;

    public Set(Id i, Expr x) {
        id = i;
        expr = x;
        if (check(id.type, expr.type) == null) {
            error("type error");
        }
    }

    private Type check(Type p1, Type p2) {
        if (Type.numeric(p1) && Type.numeric(p2)) {
            return p2;
        } else if (p1 == Type.Bool && p2 == Type.Bool) {
            return p2;
        } else {
            return null;
        }
    }

    @Override
    public void gen(int b, int a) {
        emit(id.toString() + " = " + expr.gen().toString());
    }
}
