public class Drawing{
    public static void main(String[] args){
        for(int  x = 0,y = 0; x < 5; x++ ){
            y = x;
            for(;y>=0;y=y-1)
                System.out.print("*");
            System.out.println();
        }
    }
}