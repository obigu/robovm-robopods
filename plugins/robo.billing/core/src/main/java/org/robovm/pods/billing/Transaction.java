/*
 * Copyright (C) 2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.billing;

import java.util.Date;

public abstract class Transaction {
    protected final Product product;
    protected final TransactionVerificator verificator;

    protected String identifier;
    protected Date date;
    protected String receipt;
    // Only used by Android
    protected String signature;
    protected String token;

    Transaction(Product product, TransactionVerificator verificator) {
        this.product = product;
        this.verificator = verificator;
    }

    public Product getProduct() {
        return product;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Date getDate() {
        return date;
    }

    public String getReceipt() {
        return receipt;
    }

    public String getSignature() {
        return signature;
    }

    public String getToken() {
        return token;
    }

    public abstract void finish();

    public abstract void verify(VerificationCallback callback);
}
