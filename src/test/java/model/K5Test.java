package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class K5Test {
    @Test
    @DisplayName("채워야할 연료의 양을 반환한다.")
    void getChargeQuantity() {
        Car k5 = new K5(130);
        assertThat(k5.getChargeQuantity()).isEqualTo(10);
    }
}