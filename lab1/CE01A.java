public class CE01A {
    public static void main(String[] args) {
        int row = 0;
        int colomn = 0;
        int Size = 5;
        while (row<Size){
            colomn +=1;
            int i = 1;
            while (i<=colomn){
                System.out.print("*");
                i +=1;
            }
            System.out.println("");
            row +=1;
        }
    }
}




