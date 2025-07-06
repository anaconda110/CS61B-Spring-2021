public class ClassNameHere {
    public static int max(int[] m){
        int n=0;
        for(int i=0; i<m.length;i++){
            if(m[i]>n)
                n=m[i];
        }
        System.out.println(n);
        return 0;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);
    }
}
