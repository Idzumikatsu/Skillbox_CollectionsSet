package practice;

import java.util.*;

public class EmailList {

    private Set<String> treeSet = new TreeSet<>();

    public void add(String email) {
        if (isValid(email)) {
            treeSet.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(treeSet);
    }

    public boolean isValid (String email){
        String regex = "[a-z0-9._-]+@[a-z0-9_-]+\\.[a-z]+";
        return email.toLowerCase().matches(regex);
    }
}
