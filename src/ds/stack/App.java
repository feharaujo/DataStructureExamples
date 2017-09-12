package ds.stack;

public class App {

    public static void main(String[] args) {
        String name = "Felipe Trova de Araujo";


        System.out.println(reverseString(name));

    }

    public static String reverseString(String str) {
        Stack stack = new Stack(str.toCharArray().length);
        for(char c: str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reverseName = new StringBuilder();
        while(!stack.isEmpty()) {
            reverseName.append(stack.pop());
        }

        return reverseName.toString();
    }

}
