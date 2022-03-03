package ml.wonwoo.javafeatures;

public class TextBlock {

    public static void main(String[] args) {
        final var text = """
                {
                    "name" : "wonwoo",
                    "address": "Carson, CA, 90746"
                }
                """;

        System.out.println(text);

        final var text1 = """
                    {
                        "name" : "wonwoo",
                        "address": "Carson, CA, 90746"
                    }
                """;
        System.out.println(text1);

        final var text2 = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
        System.out.println(text2);

        final var text3 = """
                red  \s
                green\s
                blue \s
                %s
                """.formatted("t");
        System.out.println(text3);

        final var text4 = """
                red  \s
                green
                blue \n
                """;
        System.out.println(text4);

        final var text5 = """
                |<html>|
                |    <body>|
                |        <p>Hello, world</p>|
                |    </body>|
                |</html>|
                """;
        System.out.println(text5);

        String code =
                """
                String text = \"""
                    A text block inside a text block
                \""";
                """;
        String tutorial1 =
                """
                A common character
                in Java programs
                is \"""";

        System.out.println(tutorial1);


    }
}
