public class CS1 {
    public static void main(String[] args) {
        sharestack<Integer> stackCS1 = new sharestack<>();

        stackCS1.push(5);
        stackCS1.push(7);
        stackCS1.push(9);
        stackCS1.push(11);

        stackCS1.printStackInt();
        int poppedNilai = stackCS1.pop();

        System.out.println("Nilai stack yang di-pop: " + poppedNilai);
        System.out.println("Nilai stack teratas setelah pop: " + stackCS1.peek());
    }
}
