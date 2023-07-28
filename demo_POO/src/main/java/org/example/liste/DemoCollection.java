package org.example.liste;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        // Démo pour Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : "+vector);

        // Méthode pour Vector
        System.out.println("1. Taille du vector : " +vector.size());
        System.out.println("2. Element à l'index 1 : " +vector.get(1));
        System.out.println("3. Est-ce que l'element est présent? : " +vector.contains("Banana"));

        // Démo pour SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Javascript");
        sortedSet.add("Java"); // non ajouté car doublons
        System.out.println("SortedSet : " +sortedSet);

        // Méthode pour sortedSet
        System.out.println("1. Premier element : " +sortedSet.first());
        System.out.println("2. Dernier element : " +sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Javascript");
        System.out.println("3. Sous-ensemble avant \"Python\" : " +headSet);

        // Démo pour LinkedList
        LinkedList<Double> linkedList = new LinkedList();
        linkedList.add(3.4);
        linkedList.add(2.71);
        linkedList.add(1.1234);
        System.out.println("LinkedList " + linkedList);

        // Méthode pour LinkedList
        System.out.println("1. Premier element : " + linkedList.getFirst());
        System.out.println("2. Dernier element : " + linkedList.getLast());

        linkedList.removeFirst();
        System.out.println("3. Suppression du premier element : " + linkedList);

        // Démo pour SortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 10);
        sortedMap.put("C++", 30);
        System.out.println("SortedMap : " +sortedMap);

        //Méthodes pour SortedMap
        System.out.println("1. Clés de sortedMap : " + sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : " + sortedMap.values());
        sortedMap.remove("Java");
        System.out.println(" SortedMap : " +sortedMap);

        // Démo pour HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 20);
        hashMap.put("Python", 10);
        hashMap.put("C++", 30);
        System.out.println(" hasMap : " + hashMap);

        String csharp = "C#";
        int valueCSharp = 40;

        hashMap.put(csharp, valueCSharp);
        System.out.println(csharp.hashCode());

        // Méthodes pour le HasMap
        System.out.println("1. Taille du HasMap : " +hashMap.size());
        System.out.println("2. Valeur associé à la clé 'Java' : " +hashMap.get("Java"));
        System.out.println("3. Verification si clé 'Banana' présente : " +hashMap.containsKey("Banana"));
        hashMap.remove("Python");
        System.out.println("4. Suppression de l'entrée avec la clé Python: ");
        System.out.println(" hasMap : " +hashMap);

    }
}
