class Bank {
        private final long[] bal; // 1-indexed externally

        public Bank(long[] balance) {
            this.bal = balance;
        }

        public boolean transfer(int account1, int account2, long money) {
            if (InValidAcc(account1) || InValidAcc(account2)) return false;
            if (bal[account1 - 1] < money) return false;
            bal[account1 - 1] -= money;
            bal[account2 - 1] += money;
            return true;
        }

        public boolean deposit(int account, long money) {
            if (InValidAcc(account)) return false;
            bal[account - 1] += money;
            return true;
        }

        public boolean withdraw(int account, long money) {
            if (InValidAcc(account)) return false;
            if (bal[account - 1] < money) return false;
            bal[account - 1] -= money;
            return true;
        }

        private boolean InValidAcc(int acc) {
            return 1 > acc || acc > bal.length;
        }
    }
/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */