/**
 * Created by fatima on 04/12/16.
 */
public class main {
    public static void main(String[] args) {
        Compte a = new Compte(222);
        try {
            a.retrait(80001);
        } catch (DecouvertMaxException e) {
        } catch (DebitMaxException e) {
        }
    }
}
