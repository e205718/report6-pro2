package jp.ac.uryukyu.ie.e205718;

public class Rep extends Win{
    @Override
    public int coincal(int winCoin) {
        System.out.println("リプレイを引きました！");
        return super.coincal(winCoin);
    }
}
