import java.util.HashMap;

/**
 * @Desc
 * @Author DaiDawn
 * @Datetime 2019/8/29 11:44
 */
public class Test {

    static HashMap hashMap = new HashMap();

    static {
        hashMap.put("2", "a,b,c");
        hashMap.put("3", "d,e,f");
        hashMap.put("4", "g,h,i");
        hashMap.put("5", "j,k,l");
        hashMap.put("6", "m,n,o");
        hashMap.put("7", "p,q,r,s");
        hashMap.put("8", "t,u,v");
        hashMap.put("9", "w,x,y,z");
    }

    public static void printTest(String str1, String str2) {
        boolean flag1 = null == str1 || str1 == "";
        boolean flag2 = null == str2 || str1 == "";

        if (flag1 || flag2) {
            return;
        }
        String[] arr1 = str1.split(",");
        String[] arr2 = str2.split(",");

        int i = 0;

        for (;i < arr1.length; i++) {
            for (int j =0 ; j < arr2.length; j++) {
                System.out.print(arr1[i] + arr2[j] + " ");
            }
        }
        System.out.println();
    }

    public static void dealArr(Integer[] arr) {
        int length = arr.length;
        if (length == 0) {
            System.out.println("空数组");
            return;
        }

        /*if (length > 9) {
            System.out.println("数组大小不超大于9");
            return;
        }*/

        if (length == 1) {
            Object object = hashMap.get(arr[0].toString());
            if (null != object) {
                String[] str = object.toString().split(",");
                for (String string : str) {
                    System.out.print(string + " ");
                }
                System.out.println();
            }
        }
        else {
            int i = 0;
            int j;
            for (; i < arr.length; i++) {
                for (j = i + 1; j<= arr.length -1; j++) {
                    Object obj1 = hashMap.get(arr[i].toString());
                    Object obj2 = hashMap.get(arr[j].toString());
                    if (null == obj1 || obj2 == null) {
                        continue;
                    }
                    printTest(obj1.toString(),obj2.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{2,3};
        Integer[] arr2 = new Integer[]{9};
        Integer[] arr3 = new Integer[]{5,6,7,8};
        Integer[] arr4 = new Integer[]{2,3,10,11};
        dealArr(new Integer[]{});
        dealArr(arr1);
        dealArr(arr2);
        dealArr(arr3);
        dealArr(arr4);
    }
}
