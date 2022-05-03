public class FindDuplicateNumber {
    public void find(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == tmp && tmp % 2 == 0 && i != j) {
                    if (flag == 0) {
                        System.out.print(tmp + " ");
                        flag = 1;
                    }
                }

            }
        }
    }
}
