/**
 * @author shi
 * @create 2021/11/2 14:03
 */
public class Test {

    public static void main(String[] args) {
        Tv tt = new Tv();
        Family f = new Family();
        f.setTv(tt);
        f.getTv().TvSystem();
    }
}
