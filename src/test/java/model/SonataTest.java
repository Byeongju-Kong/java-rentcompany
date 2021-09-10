package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SonataTest {
    @Test
    @DisplayName("채워야할 연료의 양을 반환한다.")
    void getChargeQuantity() {
        Car sonata = new Sonata(130);
        assertThat(sonata.getChargeQuantity()).isEqualTo(13);
    }
}