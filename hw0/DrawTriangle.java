public class DrawTriangle {
    public static void main(String[] args){
        drawTriangle(10);
    }
    public static void drawTriangle(int N){
        for(int j=0;j<N;j++){
            for(int i=0;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
