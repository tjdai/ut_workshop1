import java.util.*;

/**
 * Created by tjdai on 2017/3/16.
 */
public class WordStatistics {

    private  Map<String, Integer> splitCntWords(String allWords) {
        // 分词
        String[] wordArr =  allWords.split("\\s+");

        // 统计
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (int idx = 0; idx < wordArr.length; idx ++) {
            if (true == map.containsKey(wordArr[idx])) {
                map.put(wordArr[idx], map.get(wordArr[idx]) + 1);
            }
            else {
                map.put(wordArr[idx], 1);
            }
        }

        return map;
    }

    private Map<String, Integer> sort(Map<String, Integer> map) {

        Map<String, Integer> sortWords = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        // 投放到链表，比较
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // 排序
        for(Map.Entry<String, Integer> entry : list) {
            sortWords.put(entry.getKey(), entry.getValue());
        }

        return sortWords;
    }

    public String compute(String allWords) {

        if ("" == allWords) {
            return "";
        }

        Map<String, Integer> map = splitCntWords(allWords);
        Map<String, Integer> treeMap = sort(map);

        //输出
        String output = new String("");
        for (String key : treeMap.keySet()) {
            if (!output.equals("")) {
                output += "\n";
            }
            output += key + " " + treeMap.get(key);
        }

        return output;
    }
}
