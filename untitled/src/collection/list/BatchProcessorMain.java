package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkList = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(arrayList);
        processor.logic(50_000);
    }
}
