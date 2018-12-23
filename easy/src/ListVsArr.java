import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListVsArr {

    public static void main(String[] args) {
        // 创建一个Arr 数组，存String的，长度为3。 长度不可变，primitive
        int[] arr0 = new int[] {1, 2, 3};
        int [] arr = {1, 2, 3};
        // 创建一个 ArrList， 存啥。好像也需要指定吧？？那就存int好了 嘻嘻嘻。长度可变。sweet tips： List 是一种接口。不能直接使用的哟
        ArrayList<Integer> arr_list = new ArrayList<>();
        arr_list.add(1);
        arr_list.add(2);
        for (Integer i : arr_list)
            System.out.print(i);
        // 把ArrList 转为一个arr
        int[] arr1 =new int[arr_list.size()];
        for (int i=0; i < arr_list.size(); i++)
            arr1[i] = arr_list.get(i);

        // 把list 转为ArrList。创建一个arrList，然后把list数组放进去。。。

        // 创建一个set，现在还不知道要不要定，，，
        Set<String> set = new HashSet<>();
        set.add("1"); // "" 是String， '' 是char
    }

}
