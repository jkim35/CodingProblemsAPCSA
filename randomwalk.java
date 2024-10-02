public class randomwalk {
    public static void main(String[]args){
        int i = 0;
        int a = 0;
        while(i<50){
            a += randomwalk.trials();
            i++;
            
        }
        a /= 50;
        System.out.println("The average amount was "+a);
    }
    public static int move(){
        int a;
        if ((int)(Math.random()*2)==0){
            a = -1;
        }else{
            a = 1;
        }
        return a;
    }
    public static int trials(){
        int i = 0;
        int amount = 0;
        while(i<3 && i>-3){
            i += randomwalk.move();
            amount++;
        }
        return amount;
    }
}
