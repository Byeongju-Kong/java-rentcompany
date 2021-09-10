package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AvanteTest {
    @Test
    @DisplayName("채워야할 연료의 양을 반환한다.")
    void getChargeQuantity() {
        Car avante = new Avante(150);
        assertThat(avante.getChargeQuantity()).isEqualTo(10);
    }
}