import java.util.Scanner;
public class Anphabet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        String[] arrTestCase = new String[testCase];
        for (int i = 0; i < testCase; i++){
            String s = scanner.next();
            arrTestCase[i] = s;
        }
        for(int j = 0; j < testCase; j++){
            APB(arrTestCase[j]);
        }
            
    }
    public static void APB(String str){
        char[] arrAnphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        str = str.toUpperCase();
        char[] strArray = str.toCharArray();
        String ketqua = "";
        int sum = 0;
        for(int j = 0; j<26; j++){
            for(int k = 0; k < strArray.length; k++){
                if(strArray[k] == arrAnphabet[j]){
                    ketqua += strArray[k];
                }
            }
        }
        for(int m = 0; m < 10; m++){
            for(int n = 0; n < strArray.length; n++){
                if(strArray[n] == number[m]){
                    sum += Integer.parseInt(String.valueOf(strArray[n]));
                }
            }
        }
        if(sum > 0){
            System.out.println(ketqua+String.valueOf(sum));
        }
        else{
            System.out.println(ketqua);
        }
    }
}