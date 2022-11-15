package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.Money;
import lotto.service.GenerateLotto;

import java.util.List;

public class LottoController {

    private final UserController userController = new UserController();
    private final GenerateLotto generateLotto = new GenerateLotto();

    public void start() {
        int money = userController.requestMoney();
        int amount = amountLotto(money);
        List<Lotto> lotto = generateLotto.generateLottoList(amount);
    }

    public int amountLotto(int money) {
        return money/1000;
    }
}
