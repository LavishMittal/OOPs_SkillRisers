public class count_digit {
    
    public static void main(String[] args) {
        // String num = "98764587";
        // int index = 1;
        // System.out.println(num.length() );

        int num = 9887564;
        int Index = 0;
        
        while (num!=0) {
            num/=10;
            Index++;
        }
        System.out.println(Index);
    }
}
