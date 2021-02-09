package jp.ac.uryukyu.ie.e205718;

import java.util.Random;
import java.util.Scanner;



public class Slot {
    static int coin = 200;

    int offRand = 619;
    int repRand = 779;
    int belRand = 919;
    int suikaRand = 969;
    int cheRand = 999;
    int count = 0;
    boolean mode = true ;
    Suika suika = new Suika();

    public void slot(){
        System.out.println("所持コイン" + coin);
        System.out.println("スロットをまわす:1" +"\n" + "スロットをやめる:2" );
        Scanner scan =new Scanner(System.in);
        int command_number = scan.nextInt();

        if (command_number == 1){


            coin = coin - 3;
            coin = coin - 3;
        if (coin <0){
            System.out.println("コインが足りません。");
            mode =false;

        }else{
//抽選部処理
            Random rand = new Random();
            int num = rand.nextInt(1000);
        
        //抽選部
        if (0 <= num && num <offRand){

            System.out.println("はずれ");

        }else if(offRand <= num && num < repRand){
        //rep処理
            Rep rep = new Rep();
            rep.coincal(3);
            if (suika.czMode == true){
            ChanceZone cz = new ChanceZone();
            cz.CZ();
            }

            
        }else if(repRand<= num && num < belRand){
        //ベル処理
            Bell bell = new Bell();
            bell.coincal(7);

        }else if(belRand <= num && num <suikaRand){
        //スイカ処理
            
            suika.coincal(5);
            suika.Czmode();

 

        }else if (suikaRand <= num && num <cheRand){
        //チェリー処理
            Cherry cherry = new Cherry();
            cherry.coincal(2);
            cherry.CherryBonus();

        }else if (num == 999){
        //大当たり処理
            System.out.println("おめでとう！！！BIG BONUS : pay 1000枚！");
            coin = coin + 1000;
        }
    }
}else if(command_number == 2){
    System.out.println("スロットを終了します");
    mode = false;
}
}
}
    
