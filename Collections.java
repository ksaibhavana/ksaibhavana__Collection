import java.util.*;
class Collections{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("A");
list.add("B");
list.add("C");
list.add("D");
list.add("E");
list.add("F");
list.add("G");
list.add("H");
list.add("I");
list.add("J");
System.out.println(list);
list.remove(2);
list.remove(5);
System.out.println(list);
}
}