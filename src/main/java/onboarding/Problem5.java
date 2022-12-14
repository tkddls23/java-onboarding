package onboarding;

import java.util.ArrayList;
import java.util.List;

import static onboarding.Problem5.Money.*;

public class Problem5 {

    public static enum Money {
        FIFTY_THOUSAND(50000),
        TEN_THOUSAND(10000),
        FIVE_THOUSAND(5000),
        ONE_THOUSAND(1000),
        FIVE_HUNDRED(500),
        ONE_HUNDRED(100),
        FIFTY(50),
        TEN(10),
        ONE(1);
        private final int won;
        Money(int won) { this.won = won; }
    }
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> changeList = List.of(FIFTY_THOUSAND.won, TEN_THOUSAND.won, FIVE_THOUSAND.won, ONE_THOUSAND.won, FIVE_HUNDRED.won, ONE_HUNDRED.won, FIFTY.won, TEN.won, ONE.won);

        for (Integer change : changeList) {
            answer.add(money / change);
            money %= change;
        }
        return answer;
    }
}
