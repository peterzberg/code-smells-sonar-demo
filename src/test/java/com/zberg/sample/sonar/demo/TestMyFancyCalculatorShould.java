package com.zberg.sample.sonar.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestMyFancyCalculatorShould {

    @Test
    void addTwoSummands() {
        final MyFancyCalculator myFancyCalculator = new MyFancyCalculator("fancy-calc");

        int sum = myFancyCalculator.add(2, 2);

        assertThat(sum).isEqualTo(4);
    }

}