package session4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingChallenge {
    public static void main(String[] args) {


        int[] result1 = convertToInArray("asd0afj3a5s4d34as63d54a3sd4a3s4d7asd0as1d");
        int[] result2 = convertToInArray("a7sf64a1s3f24qwe6+rfa463");
        int[] result3 = convertToInArray("!@#(^$%(&234as8df1af");


        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));



    }

    public static int[] convertToInArray(String str){

        if (str == null || str.isEmpty()){
            return new int[]{};
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if (Character.isDigit(each)){
                list.add( Character.getNumericValue(each));

            }
        }
        int[] result =new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }


}
