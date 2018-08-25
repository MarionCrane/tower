
public class Versiya3{
    public static void main(String[] args) {

        printNumbers(5);
    }

    public static void printNumbers (int h){
        for (int i = 1; i <= h; i ++){
            for (int j = 0; j <= h; j ++){
                if(h-i <= j && j <= h+i){
                    System.out.print("#" + "#");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print(System.getProperty("line.separator"));
        }
    }
}
