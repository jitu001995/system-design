public class SingleTon {
  private static volatile SingleTon instance;

  private SingleTon(){

  }

  public static SingleTon getInstance(){
     if(instance==null){  // first lock
         synchronized (SingleTon.class){ // second lock
             if(instance == null){
                 instance = new SingleTon();
                 return instance;
             }
         }
     }
     return instance;
  }

}
