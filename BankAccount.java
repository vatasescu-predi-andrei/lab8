public class BankAccount {

    private int accountNum;
    private int sortCode;

    /**
     * The constructor creates a bank account that cannot be changed
     *
     * @param accountNum bank account number.
     * @param sortCode   bank account sort code.
     */
    public BankAccount(int accountNum, int sortCode) {
        this.accountNum = accountNum;
        this.sortCode = sortCode;
    }

    /**
     * Get method for the account num used in compare equals method
     *
     * @return account number
     */
    public int getAccountNum() {
        return accountNum;
    }


    /**
     * Get method for sort code that is also used in boolean equals method
     *
     * @return sort code
     */
    public int getSortCode() {
        return sortCode;
    }


    /**
     * toString method so we can print the account number and sort code using System.out.println
     *
     * @return A string containing the account number and sort code
     */
    @Override
    public String toString() {
        return "accountNum=" + getAccountNum() + " sortCode=" + getSortCode();
    }

    /**
     * Determines if object and parameter obj are equal.
     *
     * @param obj The parameter that object is compared to.
     * @return true if the current object is equal to obj and false otherwise.
     */
    @Override
    public boolean equals(Object obj) {

        // If the references match then we then this and obj point to
        // the same object . Therefore , they are equal .
        if (this == obj) {
            return true;
        }

        // This object ( which exists ) can never be equal to a null
        // reference .
        if (obj == null) {
            return false;
        }

        // Now we know both objects exist . We need to check that their
        // classes match .
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        // Both this and obj exist and are of the same class .
        // Now we can compare the account numbers and sort codes .
        BankAccount other = (BankAccount) obj;

        return other.getAccountNum() == accountNum &&
                other.getSortCode() == sortCode;
    }

    @Override
    public int hashCode() {
        return 7 * getAccountNum() + 17 * getSortCode();
    }

}