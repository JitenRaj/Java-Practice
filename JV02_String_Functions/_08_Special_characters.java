public class _08_Special_characters {
    public static void main(String[] args) {
        String text1 = "I am Jiten. I\'m a student";
        String text2 = "I am a \"Freelancer Graphics Designer.\"";
        System.out.println("\n");  // new line
        System.out.println(text1 + " " + text2);
        System.out.println("\r" + " " + "Jiten"); //carriage return
        System.out.println("\t" + " " + "Jiten"); // tab
        System.out.println("\b" + " " + "Jiten"); // backspace
        System.out.println("\f" + " " + "Jiten"); // form feed
    }
}
