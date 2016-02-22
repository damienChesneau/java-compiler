package inter;

/**
 *
 * @author Damien Chesneau
 */
public class Stmt extends Node {

    public static final Stmt Null = new Stmt();
    int after = 0;// saves label after

    public void gen(int b, int a) {
    } // called with labels begin and after

    public static Stmt Enclosing = Stmt.Null;  // used for break stmts
}
