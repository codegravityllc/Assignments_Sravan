import java.util.*;
public class SeaEleArrList {
public static void main(String[] args) {
// Creae a list and add some colors to the list
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Apple");
list_Strings.add("Ball");
list_Strings.add("Cat");
list_Strings.add("Dog");
list_Strings.add("Egg");
// Search the value Red
  if (list_Strings.contains("Cat")) {
  System.out.println("Found the element");
  } else {
  System.out.println("There is no such element");
  }
}
}



