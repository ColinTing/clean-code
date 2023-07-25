package xyz.colint.cleancode.chapter2;

/**
 * 2.16 GuessStatisticsMessage
 *
 * @author 丁浩
 * @date 2023年07月23日 18:07
 */

public class GuessStatisticsMessage {

    private String number;
    private String verb;
    private String pluralModifier;

    public static GuessStatisticsMessage getInstance(){
        return new GuessStatisticsMessage();
    }

    public String make (char candidate, int count) {
        createPluralDependentMessageParts(count);
        return String.format(
                "There %s %s %s%s", verb, number, candidate, pluralModifier);
    }

    private void createPluralDependentMessageParts(int count) {
        if (count == 0) {
            thereAreNoLetters();
        } else if (count == 1) {
            thereIsOneLetter();
        } else {
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count) {
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetter() {
        number = "1";
        verb = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters() {
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }
}
