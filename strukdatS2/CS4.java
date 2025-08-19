public class CS4 {
    public static void main(String[] args) {
        sharestack<String> stackCS4 = new sharestack<>();

        stackCS4.push("Sapi,");
        stackCS4.push("Kambing,");
        stackCS4.push("Unta,");
        stackCS4.push("Kerbau");

        stackCS4.printStackStr();

    }
}
