public class CS2 {
    public static void main(String[] args) {
        sharestack<Integer> stackCS2 = new sharestack<>();

        stackCS2.push(1);
        stackCS2.push(3);
        stackCS2.push(5);

        stackCS2.printStackInt();

        int poppedNilai1 = stackCS2.pop();
        int poppedNilai2 = stackCS2.pop();


        System.out.println("Nilai stack yang pertama di pop : " + poppedNilai1);
        System.out.println("Nilai stack yang kedua di pop : " + poppedNilai2);
        System.out.println("Nilai stack setelah dua kali pop : " + stackCS2.peek());
    }
}
