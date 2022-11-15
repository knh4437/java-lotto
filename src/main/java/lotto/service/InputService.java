package lotto.service;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.Money;
import lotto.domain.WinningNumber;

import java.util.ArrayList;
import java.util.List;

public class InputService {

    public Money requestMoney() {
        String input = Console.readLine();
        return new Money(input);
    }

    public WinningNumber requestWinningNumber() {
        String input = Console.readLine();
        return new WinningNumber(input);
    }
}
