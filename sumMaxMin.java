import java.util.Scanner;
public class sumMaxMin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[][] arrTestCase = new int[testCase][2];
        for(int i = 0; i < testCase; i++){
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            arrTestCase[i][0] = x1;
            arrTestCase[i][1] = x2;
        }
        for(int j = 0; j < testCase; j++){
            maxMin(arrTestCase[j][0], arrTestCase[j][1]);
        }
    }
    public static void maxMin(int x1, int x2){
        String strX1 = String.valueOf(x1);
        char[] charArrX1 = strX1.toCharArray();
        String strX2 = String.valueOf(x2);
        char[] charArrX2 = strX2.toCharArray();
        for(int i = 0; i < charArrX1.length; i++){
            if(charArrX1[i] == '5'){
                charArrX1[i] = '6';
            }
        }
        for(int j = 0; j < charArrX2.length; j++){
            if(charArrX2[j] == '5'){
                charArrX2[j] = '6';
            }
        }
        String X1 = "";
        String X2 = "";
        for(int i = 0; i < charArrX1.length; i++){
            X1 += charArrX1[i];
        }
        for(int i = 0; i < charArrX1.length; i++){
            X2 += charArrX2[i];
        }
        int x1Max = Integer.parseInt(X1);
        int x2Max = Integer.parseInt(X2);
        int Max = x1Max + x2Max;
        for(int i = 0; i < charArrX1.length; i++){
            if(charArrX1[i] == '6'){
                charArrX1[i] = '5';
            }
        }
        for(int j = 0; j < charArrX2.length; j++){
            if(charArrX2[j] == '6'){
                charArrX2[j] = '5';
            }
        }
        String Val1 = "";
        String Val2 = "";
        for(int i = 0; i < charArrX1.length; i++){
            Val1 += charArrX1[i];
        }
        for(int i = 0; i < charArrX1.length; i++){
            Val2 += charArrX2[i];
        }
        int x1Min = Integer.parseInt(Val1);
        int x2Min = Integer.parseInt(Val2);
        int Min = x1Min + x2Min;  
        System.out.println(Min + " " + Max);
    }
}