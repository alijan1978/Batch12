package class30;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        List<Integer> list = Arrays.asList(10, 20, 30);
        System.out.println(list);
        list.add(40);

        List<Integer> list2=Arrays.asList(5);
        System.out.println(list2);

    }
}
//    T[] copy = ((Object)newType == (Object)Object[].class)
//            ? (T[]) new Object[newLength]
//            : (T[]) Array.newInstance(newType.getComponentType(), newLength);
//System.arraycopy(original, 0, copy, 0,
//        Math.min(original.length, newLength));
//        return copy;