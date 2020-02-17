/*
 * Copyright 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pro.tremblay.core;

import org.junit.Test;

import java.math.BigDecimal;

import static pro.tremblay.core.Amount.amnt;
import static pro.tremblay.core.Assertions.assertThat;

public class AmountTest {

    @Test
    public void amountDouble() {
        assertThat(amnt(12.1)).isEqualTo("12.10");
    }

    @Test
    public void amountInteger() {
        assertThat(amnt(12L)).isEqualTo("12.00");
    }

    @Test
    public void amountBigDecimal() {
        assertThat(amnt(BigDecimal.valueOf(12))).isEqualTo("12.00");
    }

    @Test
    public void testToString() {
        assertThat(amnt("1.2").toString()).isEqualTo("1.20$");
    }
}