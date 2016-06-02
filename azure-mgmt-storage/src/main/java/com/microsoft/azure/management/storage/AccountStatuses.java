package com.microsoft.azure.management.storage;

import com.microsoft.azure.management.storage.implementation.api.AccountStatus;

/**
 * An instance of this class stores the availability of a storage account.
 */
public class AccountStatuses {
    private AccountStatus primary;
    private AccountStatus secondary;

    /**
     * Creates an instance of AccountStatuses class.
     * @param primary the status of the primary location
     * @param secondary the status of the secondary location
     */
    public AccountStatuses(AccountStatus primary, AccountStatus secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    /**
     * @return the status indicating whether the primary location of the storage
     * account is available or unavailable. Possible values include:
     * 'Available', 'Unavailable'.
     */
    public AccountStatus primary() {
        return primary;
    }

    /**
     * @return the status indicating whether the secondary location of the
     * storage account is available or unavailable. Only available if the
     * accountType is StandardGRS or StandardRAGRS. Possible values include:
     * 'Available', 'Unavailable'.
     */
    public AccountStatus secondary() {
        return secondary;
    }
}
