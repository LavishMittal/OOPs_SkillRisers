public class Rotation_of_number {
    
    public static void main(String[] args) {
        int num = 12345;
        int rotation = 2;
        int copy = num;
        int counter = 0;

        while (copy!=0) {
            counter++;
            copy/=10;
        }
        // if (rotation<0){                          // if range is negative
        //     rotation = rotation + counter;
        // }
        // rotation = rotation % counter;         // when rotation is greater then range
        int Power = (int)Math.pow(10, rotation);
        int LeftPart = num / Power;
        int RightPart = num % Power;
        int rem = counter - rotation;    // remaining power to use in next steps
        Power = (int)Math.pow(10, rem);
        int result = RightPart * Power + LeftPart;
        System.out.println(result);

    }
}
