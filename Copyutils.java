import java.util.*;

class CopyUtils {
    public static List<String> deepCopyList(LinkedList<String> originalList) {
        LinkedList <String> copiedLinkedList = new LinkedList <String> ();
        
        for (String listElement : originalList) { 
            copiedLinkedList.add(listElement);
        }
        
        return copiedLinkedList;

    }
    public static List<String> deepCopyList(ArrayList<String> originalList) {
        ArrayList<String> copiedArrayList = new ArrayList<String>();

        for (String item : originalList) {
            copiedArrayList.add(new String(item));
        }

        return copiedArrayList;
    }
    
     public static List<String> deepCopyList(List<String> originalList) {
        LinkedList <String> copiedLinkedList = new LinkedList <String> ();
        
        for (String listElement : originalList) { 
            copiedLinkedList.add(listElement);
        }
        
        return copiedLinkedList;

    }
    
    public static Man deepCopyMan(Man man) {
        String nameCopy = new String(man.getName());
        int ageCopy = man.getAge();
        // List<String> favoriteBooksCopy = deepCopyList(man.getFavoriteBooks());
        Man manCopy = new Man(nameCopy, ageCopy, deepCopyList(man.getFavoriteBooks()));
        return manCopy;
    }
}