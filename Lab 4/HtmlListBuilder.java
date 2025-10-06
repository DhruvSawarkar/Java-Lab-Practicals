public class HtmlListBuilder {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Oranges"};

        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append("<ul>");

        for (String item : items) {
            htmlBuilder.append("<li>")
                       .append(item)
                       .append("</li>");
        }

        htmlBuilder.append("</ul>");

        String htmlList = htmlBuilder.toString();
        System.out.println(htmlList);
    }
}
