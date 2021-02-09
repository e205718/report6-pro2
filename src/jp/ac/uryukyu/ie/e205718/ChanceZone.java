package jp.ac.uryukyu.ie.e205718;

import java.util.Random;

public class ChanceZone extends Win {
    public void CZ(){

        Suika suika = new Suika();
        Slot slot =  new Slot();
        int count = 0;
        Random rand = new Random();
        int num = rand.nextInt(3);

        if(num == 0){
            System.out.println("777" + "\n" +"大当たり。。。");
            coincal(315);
        }else{
            suika.czMode =false;
            System.out.println("残念！チャンスゾーン終了");
            }
        }

}

