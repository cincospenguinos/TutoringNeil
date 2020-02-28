package crash_course;

import data_structures.GenericSet;

public class Main {

    public static void main(String[] args) {
        GenericSet<Transaction> transactions = new GenericSet<Transaction>();

        Transaction t = Transaction.newTransaction(125, "Joe");
        //...
        t.correct(325);

        transactions.add(t);
    }

    static class Transaction {
        private static long nextId = 1;

        private long amountInCents;
        private String customerName;
        private long id;

        private Transaction(long _id, long amount, String _customerName) {
            amountInCents = amount;
            customerName = _customerName;
            id = _id;
        }

        public void correct(long newCentValue) {
            amountInCents = newCentValue;
        }

        public static Transaction newTransaction(long amount, String _customerName) {
            long id = nextId;
            nextId += 1;

            return new Transaction(id, amount, _customerName);
        }
    }
}
