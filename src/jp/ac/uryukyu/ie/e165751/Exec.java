package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2017/02/05.
 */
public class Exec {
    public static void main(String[] args){
        CookingRoom room=new CookingRoom(//調理室オブジェクト作成
                Thread t1=new Thread(new Cook(room)));
                Thread t2=new Thread(new Cook(room));
                Thread t3=new Thread(new Cook(room));


    }
}
