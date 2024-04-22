import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
       List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            if (list.size() == 1) {
                break;
            } else if (i % 2 == 0 && query[i] != list.size() - 1) {
                list.subList(query[i] + 1, list.size()).clear();
            } else if (i % 2 != 0 && query[i] != 0) {
                list.subList(0, query[i]).clear();
                }
            }
        return list.stream().mapToInt(i -> i).toArray();
        }
    }