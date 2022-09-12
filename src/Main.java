import java.util.Arrays;

public class Main {
    public static int changeValue(int value) {
        value = 22;
        System.out.println("value = " + value);
        return value;
    }

    public static Integer changeValue2(Integer value2) {
        value2 = 22;
        System.out.println("value = " + value2);
        return value2;
    }

    public static Integer[] changeValue3(Integer[] value) {
        Integer[] value3 = {1, 2};
        System.out.println("Arrays.toString(value3) = " + Arrays.toString(value3));
        return value3;
    }
    public static Integer[] changeValue4(Integer[] value) {
        Integer[] value4 = new Integer[2];
        value4 [0] = 99;
        System.out.println("Arrays.toString(value4) = " + Arrays.toString(value4));
        return value4;
    }

    public static void main(String[] args) {
        int value = 33;
        System.out.println("value = " + value);
        changeValue(value);

        Integer value2 = 33;
        System.out.println("value2 = " + value2);
        changeValue2(value2);

        Integer[] value3 = {3, 4};
        changeValue3(value3);
        System.out.println("Arrays.toString(value3) = " + Arrays.toString(value3));



        Integer[] value4 = {3, 4};
        changeValue4(value4);
        System.out.println("Arrays.toString(value4) = " + Arrays.toString(value4));

        Person person = new Person("Lyapis", "Trubetskoy");
        
    }
}