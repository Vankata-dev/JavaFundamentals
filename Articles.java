import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Articles {
    public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getContent() {
            return this.content;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Article article = new Article(input[0], input[1], input[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] lines = scanner.nextLine().split(": ");
            String command = lines[0];

            switch (command) {
                case "Edit":
                    article.setContent(lines[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(lines[1]);
                    break;
                case "Rename":
                    article.setTitle(lines[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }


}
