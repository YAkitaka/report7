package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2017/02/05.
 */
class Cook implements Runnable{
    CookingRoom room;//調理室の参照
    public Cook(CookingRoom room){//コンストラクタ。参照を受け取る
        this.room=room;
            }
    public void run(){
        room.cook();
    }
}
