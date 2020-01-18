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

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private TransactionType type;
    private LocalDate date;
    private BigDecimal cash;
    private Security security;
    private BigDecimal quantity;

    public TransactionType getType() {
        return type;
    }

    public Transaction type(TransactionType type) {
        this.type = type;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Transaction date(LocalDate date) {
        this.date = date;
        return this;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public Transaction cash(BigDecimal cash) {
        this.cash = cash;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public Transaction security(Security security) {
        this.security = security;
        return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public Transaction quantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }
}
