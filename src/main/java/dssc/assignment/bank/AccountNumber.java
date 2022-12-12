package dssc.assignment.bank;

public class AccountNumber {

    private final Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        String s = entry.toString();
        if (s.contains("?")) {
            return s + " ILL";
        }
        return s;
    }
}
