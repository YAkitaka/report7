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
                Thread t4=new Thread(new Waiter(room));
                Thread t5=new Thread(new Waiter(room));
                Thread t6=new Thread(new Waiter(room));
        //CookとWaiterオブジェクトはどれもroomを使って初期化

        //
        t1.start();t2.start();t3.start();
        t4.start();t5.start();t6.start();
        //6つのスレッドを起動する

    }
}
