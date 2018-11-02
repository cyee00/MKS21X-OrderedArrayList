import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){}
  public OrderedArrayList(int startingCapacity){super(startingCapacity);}
  public int correctIndex (T value, NoNullArrayList<T> list) {
    int ans = 0;
    for (int i=0;i<list.size();i++) {
      if (value.compareTo(list.get(i))==1){
        return i;
      }
    }
    return list.size()-1;
  }
  public boolean add(T object) {
    return false;
  }
}
