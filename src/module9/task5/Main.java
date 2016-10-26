package module9.task5;

import java.util.*;

/**
 * Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the
 * following methods and print it to console:
 * - add
 * - set
 * - get
 * - remove
 */
public class Main {
    public static void main(String[] args) {

        final int LIST_SIZE = 1000000; //Amount of elements in the lists

        //Generating lists with random values
        List<Integer> arrayListInt = new ArrayList<>();
        List<Integer> linkedListInt = new LinkedList<>();
        List<String> arrayListStr = new ArrayList<>();
        List<String> linkedListStr = new LinkedList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            int val = (int) (Math.random() * 1000000);
            arrayListInt.add(val);
            linkedListInt.add(val);
            arrayListStr.add(Integer.toString(val));
            linkedListStr.add(Integer.toString(val));
        }

        //measured time will be saved here
        Map<String, Long> resultTime = new TreeMap<>();


        /* Operation "add" */
        //ArrayList<Integer>
        resultTime.put("ArrayList<Integer> - adding in the end", operationAdd(arrayListInt, 44, arrayListInt.size()));
        resultTime.put("ArrayList<Integer> - adding in the middle", operationAdd(arrayListInt, 44, arrayListInt.size() / 2));
        resultTime.put("ArrayList<Integer> - adding in the beginning", operationAdd(arrayListInt, 44, 0));

        //ArrayList<String>
        resultTime.put("ArrayList<String> - adding in the end", operationAdd(arrayListStr, "44", arrayListStr.size()));
        resultTime.put("ArrayList<String> - adding in the middle", operationAdd(arrayListStr, "44", arrayListStr.size() / 2));
        resultTime.put("ArrayList<String> - adding in the beginning", operationAdd(arrayListStr, "44", 0));

        //LinkedList<Integer>
        resultTime.put("LinkedList<Integer> - adding in the end", operationAdd(linkedListInt, 44, linkedListInt.size()));
        resultTime.put("LinkedList<Integer> - adding in the middle", operationAdd(linkedListInt, 44, linkedListInt.size() / 2));
        resultTime.put("LinkedList<Integer> - adding in the beginning", operationAdd(linkedListInt, 44, 0));

        //LinkedList<String>
        resultTime.put("LinkedList<String> - adding in the end", operationAdd(linkedListStr, "44", linkedListStr.size()));
        resultTime.put("LinkedList<String> - adding in the middle", operationAdd(linkedListStr, "44", linkedListStr.size() / 2));
        resultTime.put("LinkedList<String> - adding in the beginning", operationAdd(linkedListStr, "44", 0));


        /* Operation "set" */
        //ArrayList<Integer>
        resultTime.put("ArrayList<Integer> - setting in the end", operationSet(arrayListInt, 44, arrayListInt.size()-1));
        resultTime.put("ArrayList<Integer> - setting in the middle", operationSet(arrayListInt, 44, arrayListInt.size() / 2));
        resultTime.put("ArrayList<Integer> - setting in the beginning", operationSet(arrayListInt, 44, 0));

        //ArrayList<String>
        resultTime.put("ArrayList<String> - setting in the end", operationSet(arrayListStr, "44", arrayListStr.size()-1));
        resultTime.put("ArrayList<String> - setting in the middle", operationSet(arrayListStr, "44", arrayListStr.size() / 2));
        resultTime.put("ArrayList<String> - setting in the beginning", operationSet(arrayListStr, "44", 0));

        //LinkedList<Integer>
        resultTime.put("LinkedList<Integer> - setting in the end", operationSet(linkedListInt, 44, linkedListInt.size()-1));
        resultTime.put("LinkedList<Integer> - setting in the middle", operationSet(linkedListInt, 44, linkedListInt.size() / 2));
        resultTime.put("LinkedList<Integer> - setting in the beginning", operationSet(linkedListInt, 44, 0));

        //LinkedList<String>
        resultTime.put("LinkedList<String> - setting in the end", operationSet(linkedListStr, "44", linkedListStr.size()-1));
        resultTime.put("LinkedList<String> - setting in the middle", operationSet(linkedListStr, "44", linkedListStr.size() / 2));
        resultTime.put("LinkedList<String> - setting in the beginning", operationSet(linkedListStr, "44", 0));


        /* Operation "get" */
        //ArrayList<Integer>
        resultTime.put("ArrayList<Integer> - getting in the end", operationGet(arrayListInt, arrayListInt.size()-1));
        resultTime.put("ArrayList<Integer> - getting in the middle", operationGet(arrayListInt, arrayListInt.size() / 2));
        resultTime.put("ArrayList<Integer> - getting in the beginning", operationGet(arrayListInt, 0));

        //ArrayList<String>
        resultTime.put("ArrayList<String> - getting in the end", operationGet(arrayListStr, arrayListStr.size()-1));
        resultTime.put("ArrayList<String> - getting in the middle", operationGet(arrayListStr, arrayListStr.size() / 2));
        resultTime.put("ArrayList<String> - getting in the beginning", operationGet(arrayListStr, 0));

        //LinkedList<Integer>
        resultTime.put("LinkedList<Integer> - getting in the end", operationGet(linkedListInt, linkedListInt.size()-1));
        resultTime.put("LinkedList<Integer> - getting in the middle", operationGet(linkedListInt, linkedListInt.size() / 2));
        resultTime.put("LinkedList<Integer> - getting in the beginning", operationGet(linkedListInt, 0));

        //LinkedList<String>
        resultTime.put("LinkedList<String> - getting in the end", operationGet(linkedListStr, linkedListStr.size()-1));
        resultTime.put("LinkedList<String> - getting in the middle", operationGet(linkedListStr, linkedListStr.size() / 2));
        resultTime.put("LinkedList<String> - getting in the beginning", operationGet(linkedListStr, 0));


         /* Operation "remove" */
        //ArrayList<Integer>
        resultTime.put("ArrayList<Integer> - removing in the end", operationRemove(arrayListInt, arrayListInt.size()-1));
        resultTime.put("ArrayList<Integer> - removing in the middle", operationRemove(arrayListInt, arrayListInt.size() / 2));
        resultTime.put("ArrayList<Integer> - removing in the beginning", operationRemove(arrayListInt, 0));

        //ArrayList<String>
        resultTime.put("ArrayList<String> - removing in the end", operationRemove(arrayListStr, arrayListStr.size()-1));
        resultTime.put("ArrayList<String> - removing in the middle", operationRemove(arrayListStr, arrayListStr.size() / 2));
        resultTime.put("ArrayList<String> - removing in the beginning", operationRemove(arrayListStr, 0));

        //LinkedList<Integer>
        resultTime.put("LinkedList<Integer> - removing in the end", operationRemove(linkedListInt, linkedListInt.size()-1));
        resultTime.put("LinkedList<Integer> - removing in the middle", operationRemove(linkedListInt, linkedListInt.size() / 2));
        resultTime.put("LinkedList<Integer> - removing in the beginning", operationRemove(linkedListInt, 0));

        //LinkedList<String>
        resultTime.put("LinkedList<String> - removing in the end", operationRemove(linkedListStr, linkedListStr.size()-1));
        resultTime.put("LinkedList<String> - removing in the middle", operationRemove(linkedListStr, linkedListStr.size() / 2));
        resultTime.put("LinkedList<String> - removing in the beginning", operationRemove(linkedListStr, 0));


        /*Printing results*/
        for (String str : resultTime.keySet()) {
            System.out.println(str + ":  " + resultTime.get(str));
        }

    }

    private static long operationAdd(List list, Object elem, int index) {
        long startTime = System.currentTimeMillis();
        list.add(index, elem);
//        for(int i=0;i<20;i++){
//            list.add(index, elem);
//        }
        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    private static long operationSet(List list, Object elem, int index) {
        long startTime = System.currentTimeMillis();
        list.set(index, elem);
        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    private static long operationGet(List list, int index) {
        long startTime = System.currentTimeMillis();
        list.get(index);
        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    private static long operationRemove(List list, int index) {
        long startTime = System.currentTimeMillis();
        list.get(index);
        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }
}
