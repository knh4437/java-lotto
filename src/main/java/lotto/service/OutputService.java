package lotto.service;

import java.util.List;

public class OutputService {

    public void requestMoney() {
        System.out.println("구입금액을 입력해주세요");
    }

    public void printAmount(int amount) {
        System.out.println(amount + "개를 구매했습니다.");
    }

    public void printLotto(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public void requestWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void requestBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

}
