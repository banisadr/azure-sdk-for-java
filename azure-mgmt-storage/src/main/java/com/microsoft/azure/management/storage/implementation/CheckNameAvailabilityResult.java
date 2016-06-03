/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage.implementation;


import com.microsoft.azure.management.storage.implementation.api.CheckNameAvailabilityResultInner;
import com.microsoft.azure.management.storage.implementation.api.Reason;

/**
 * The CheckNameAvailability operation response.
 */
public enum CheckNameAvailabilityResult {
    /** The name is available. */
    AVAILABLE(true),
    /** THe name is not available. */
    UNAVAILABLE(false);

    private CheckNameAvailabilityResultInner inner;

    CheckNameAvailabilityResult(boolean nameAvailable) {
        this.inner = new CheckNameAvailabilityResultInner();
        this.inner.setNameAvailable(nameAvailable);
    }

    /**
     * @return a boolean value that indicates whether the name is available for
     * you to use. If true, the name is available. If false, the name has
     * already been taken or invalid and cannot be used.
     */
    public boolean isAvailable() {
        return inner.nameAvailable();
    }

    /**
     * @return the reason that a storage account name could not be used. The
     * Reason element is only returned if NameAvailable is false. Possible
     * values include: 'AccountNameInvalid', 'AlreadyExists'.
     */
    public Reason reason() {
        return inner.reason();
    }

    /**
     * Set the reason of the unavailable name.
     *
     * @param reason the reason that a storage account name could not be used. The
     * Reason element is only returned if NameAvailable is false. Possible
     * values include: 'AccountNameInvalid', 'AlreadyExists'.
     * @return the result itself
     */
    CheckNameAvailabilityResult withReason(Reason reason) {
        this.inner.setReason(reason);
        return this;
    }

    /**
     * @return an error message explaining the Reason value in more detail
     */
    public String message() {
        return inner.message();
    }

    /**
     * Set the message from Azure explaining why the name is unavailable.
     *
     * @param message the message from Azure storage
     * @return the result itself
     */
    CheckNameAvailabilityResult withMessage(String message) {
        this.inner.setMessage(message);
        return this;
    }
}