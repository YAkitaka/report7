package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2017/02/05.
 */
class Waiter implements Runnable {
    CookingRoom room;//調理室の参照
    public Waiter(CookingRoom room){//コンストラクタ。参照を受け取る
        this.room=room;

    }
    public void runn(){
        room.spread();//調理室の配膳メソッド
    }
}
