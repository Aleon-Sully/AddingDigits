import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Digits");

        String param = in.nextLine();

        System.out.println(addDigit(param));

    }


    public static int addDigit(String param) {
        int ans = 0;
        String out = param;

        if(param.length() == 1){
            ans = Integer.parseInt(param);
        }else {

            while (true){

                for (int i=0; i<out.length(); i++){
                    ans += Integer.parseInt(Character.toString(out.charAt(i)));
                }

                out = Integer.toString(ans);
                ans = 0;

                if (out.length() == 1){
                    break;
                }
            }
        }
        return Integer.parseInt(out);
    }

}
