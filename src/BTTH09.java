import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTTH09 {


    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void findSubarrays(int[] arr, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (!current.isEmpty()) {
                int sum = 0;
                for (int num : current) {
                    sum += num;
                }
                if (isPrime(sum)) {

                    result.add(new ArrayList<>(current));
                }
            }
            return;
        }


//        findSubarrays(arr, index + 1, current, result);

        findSubarrays(arr, index + 1, current, result);


        current.add(arr[index]);
        findSubarrays(arr, index + 1, current, result);


        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<ArrayList<Integer>> result = new ArrayList<>();


            findSubarrays(arr, 0, new ArrayList<>(), result);


            Collections.sort(result, (list1, list2) -> {
                int minSize = Math.min(list1.size(), list2.size());
                for (int i = 0; i < minSize; i++) {
                    if (!list1.get(i).equals(list2.get(i))) {
                        return list1.get(i) - list2.get(i);
                    }
                }
                return list1.size() - list2.size();
            });

            for (ArrayList<Integer> subarray : result) {
                for (int num : subarray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
