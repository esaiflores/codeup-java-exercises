package util;

public class InputTest {

    public static void main(String[] args) {
        Input test = new Input();

//
//            System.out.println(test.getString(""));
//            System.out.println(test.yesNo());
//            System.out.println(test.getInt(1,10));
//            System.out.println(test.getDouble(1,10));
//            System.out.println(test.getInt(""));
//            System.out.println(test.getDouble(""));

        test.getInt();
        test.getDouble();
        System.out.println(test.getBinary());
        System.out.println(test.getHex());

    }

}


