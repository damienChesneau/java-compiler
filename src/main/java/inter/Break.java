package inter;

/**
 *
 * @author Damien Chesneau - contact@damienchesneau.fr
 */
public class Break extends Stmt {

    Stmt stmt;

    public Break() {
        if (Stmt.Enclosing == Stmt.Null) {
            error("unenclosed break");
        }
        stmt = Stmt.Enclosing;
    }

    @Override
    public void gen(int b, int a) {
        emit("goto L" + stmt.after);
    }
}
