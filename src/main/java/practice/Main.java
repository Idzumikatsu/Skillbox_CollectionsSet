package practice;

import java.util.*;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            input = input.strip();
            String[] tokens = input.split(" ");

            String command = tokens[0];

            if (tokens.length > 2) {
                System.out.println(WRONG_EMAIL_ANSWER);
                continue;
            }

            switch (command) {
                case "LIST" -> {
                    if (!emailList.getSortedEmails().isEmpty()){
                        for (String s : emailList.getSortedEmails()) {
                            System.out.println(s);
                        }
                    }
                }
                case "ADD" -> emailList.add(tokens[1]);
                default -> System.out.println("Такой команды не найдено");
            }


        }
    }
}
