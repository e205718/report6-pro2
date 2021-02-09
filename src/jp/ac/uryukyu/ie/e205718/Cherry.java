package jp.ac.uryukyu.ie.e205718;

import java.util.Random;

public class Cherry extends Win{
    @Override
    public int coincal(int winCoin) {
        System.out.println("チェリーを引きました！Pay:2");
        return super.coincal(winCoin);

    }
    public void CherryBonus(){
        Random rand = new Random();
        int num = rand.nextInt(7);//7

        if (num == 0){
            System.out.println("CherryBonusに当選しました！！ 200マイ");
            coincal(200);

        }
    }   

}



