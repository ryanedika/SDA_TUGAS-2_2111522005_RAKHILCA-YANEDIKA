import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> saya = new LinkedList<String>();
        saya.add("R");
        saya.add("A");
        saya.add("K");
        saya.add("H");
        saya.add("I");
        saya.add("L");
        saya.add("C");
        saya.add("A");
        saya.add(" ");
        saya.add("Y");
        saya.add("A");
        saya.add("N");
        saya.add("E");
        saya.add("D");
        saya.add("I");
        saya.add("K");
        saya.add("A");

        System.out.println(saya);
        System.out.println("Size = "+saya.size());

        //tambah karakter lain (add linkedlist)
        saya.addFirst("E");
        saya.addLast("O");

        System.out.println("\nHasil add = "+saya);
        System.out.println("Size = "+saya.size());

        saya.add("V");
        saya.add("Y");

        System.out.println("\nHasil add = "+saya);
        System.out.println("Size = "+saya.size());

        //sisipkan karakter lain (set linkedlist)
        saya.set(5, "O");
        saya.set(12, "W");
        saya.set(9, "L");
        saya.set(15, "T");
        saya.set(11, "S");

        System.out.println("\nHasil set = "+saya);
        System.out.println("Size = "+saya.size());

        //hapus karakter lain (remove linkedlist)
        saya.removeFirst();
        saya.removeLast();
        
        System.out.println("\nHasil remove = "+saya);
        System.out.println("Size = "+saya.size());

        saya.remove(3);
        saya.remove(10);

        System.out.println("\nHasil remove = "+saya);
        System.out.println("Size = "+saya.size());

        //fungsi pop and push
        saya.pop();
        System.out.println("\nHasil fungsi POP = "+saya);
        System.out.println("Size = "+saya.size());

        saya.push("Z");
        System.out.println("\nHasil fungsi PUSH = "+saya);
        System.out.println("Size = "+saya.size());

    }
}
