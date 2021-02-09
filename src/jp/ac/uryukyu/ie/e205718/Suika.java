package jp.ac.uryukyu.ie.e205718;

import java.util.Random;

public class Suika extends Win {

    static boolean czMode = false;
    @Override
    
    public int coincal(int winCoin) {
        System.out.println("スイカを引きました！Pay:5");
        return super.coincal(winCoin);

    }

    
    public void Czmode(){ 

        if (czMode == false){
            Random rand = new Random();
            int num = rand.nextInt(6);//6
            
        if (num == 0){
            czMode = true;
            System.out.println("チャンスゾーン突入");
            System.out.println("次回リプレイの1/3でbonus！！" );

            }
        System.out.println(czMode);
        }

    }
}
