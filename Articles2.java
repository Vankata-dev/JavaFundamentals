import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static class Article {
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
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

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];

            Article article = new Article(title, content, author);

            articleList.add(article);
        }

        String command = scanner.nextLine();

        switch (command) {
            case "title":
                articleList.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(article ->
                        System.out.println(article.toString()));
                break;
            case "content":
                articleList.stream().sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).forEach(
                        article -> System.out.println(article.toString()));
                break;
            case "author":
                articleList.stream().sorted((a1, a2)-> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
        }
    }
}
