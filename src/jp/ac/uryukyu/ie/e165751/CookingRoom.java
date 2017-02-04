package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2017/02/05.
 */
class CookingRoom {
    boolean flag;//料理があるときtrueないときfalse
    int dish=0;//何番目かの料理か示す
    //Cook用
    synchronized void cook(){
        while(flag){//料理があれば
            try{
                wait();//来るまで待つ
            }catch(InterruptedException e){
            }
        }
    dish++;//料理を作った
        flag=true;//料理があると記録
        notifyAll();//全員に通知する

    }
    //Waiter用
    synchronized void spread(){
        while(!flag){//料理がなければ
            try{
                wait();
            }catch(InterruptedException e){
            }
        }
        System.out.println(dish+"番目の料理");//配膳処理の代わり
        flag=false;//料理はない
        notifyAll();

    }
}
