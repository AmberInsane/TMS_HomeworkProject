package hw_7.task_4;

public class TextMain {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        String lowerText = text.toLowerCase();
        String[] findWords = new String[]{"alert", "add", "good", "plan"};
        int counter;
        for (String findWord : findWords) {
            counter = (lowerText.length() - lowerText.replace(findWord, "").length()) / findWord.length();
            System.out.println(findWord + " - " + counter);
        }
    }
}
