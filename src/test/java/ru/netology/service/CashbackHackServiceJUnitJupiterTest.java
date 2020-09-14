package ru.netology.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJUnitJupiterTest {

    @Test
    public void shouldReturn300IfAmountIs700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn600IfAmountIs1400() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}

