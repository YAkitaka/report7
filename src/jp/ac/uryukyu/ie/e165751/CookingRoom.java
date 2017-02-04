package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2017/02/05.
 */
class CookingRoom {
    boolean flag;
    int dish=0;
    //
    synchronized void cook(){
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
            }
        }
    dish++;
        flag=true;
        notifyAll();

    }
    synchronized void spread(){
        while(!flag){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
    }
}
