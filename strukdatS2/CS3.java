public class CS3 {
    public static void main(String[] args) {
        sharestack<Integer> stackCS3 = new sharestack<>();

        stackCS3.push(2);
        stackCS3.push(4);
        stackCS3.push(6);

        stackCS3.printStackInt();

        for (int i = 0; i < 2; i++) {
            stackCS3.pop();
            stackCS3.push(8);
        }

        System.out.println("Nilai stack setelah operasi terakhir: " + stackCS3.peek());
    }
}
