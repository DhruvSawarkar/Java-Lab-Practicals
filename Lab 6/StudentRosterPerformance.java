import java.util.*;

public class StudentRosterPerformance {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

      
        for (int i = 1; i <= 50000; i++) {
            String student = "Student " + i;
            arrayList.add(student);
            linkedList.add(student);
        }

       
        System.out.println("Task A: Insertions at the Beginning");

        long startArrayInsert = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            arrayList.add(0, "NewStudent " + i);
        }
        long endArrayInsert = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (endArrayInsert - startArrayInsert) / 1_000_000 + " ms");

        long startLinkedInsert = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            linkedList.add(0, "NewStudent " + i);
        }
        long endLinkedInsert = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (endLinkedInsert - startLinkedInsert) / 1_000_000 + " ms");

     
        System.out.println("\nTask B: Random Access");

        Random rand = new Random();
        int size = arrayList.size();

        long startArrayAccess = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(rand.nextInt(size));
        }
        long endArrayAccess = System.nanoTime();
        System.out.println("ArrayList access time: " + (endArrayAccess - startArrayAccess) / 1_000_000 + " ms");

        long startLinkedAccess = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(rand.nextInt(size));
        }
        long endLinkedAccess = System.nanoTime();
        System.out.println("LinkedList access time: " + (endLinkedAccess - startLinkedAccess) / 1_000_000 + " ms");
    }
}