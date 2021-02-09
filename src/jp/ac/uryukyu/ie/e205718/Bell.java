package jp.ac.uryukyu.ie.e205718;

public class Bell extends Win{
    @Override
    public int coincal(int winCoin) {
        System.out.println("ベルを引きました！Pay:7");
        return super.coincal(winCoin);
    }
}
