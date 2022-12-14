package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> duplicatedList = new ArrayList<>();

        for (List<String> form : forms) {
            String nickname = form.get(1);
            for (int i = 0; i < nickname.length() - 1; i++) {
                String word = nickname.substring(i, i + 2);
                duplicatedList.addAll(findDuplicate(word, nickname, forms));
            }
        }
        return duplicatedList.stream().distinct().sorted().collect(Collectors.toList());
    }

    private static List<String> findDuplicate(String word, String myNickname, List<List<String>> forms) {
        List<String> duplicatedList = new ArrayList<>();

        for (List<String> form : forms) {
            String nickname = form.get(1);
            String email = form.get(0);
            if (nickname.equals(myNickname))
                continue;
            if (nickname.contains(word))
                duplicatedList.add(email);
        }
        return duplicatedList;
    }
}
