import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){}
  public OrderedArrayList(int startingCapacity){super(startingCapacity);}
  public int correctIndex (T value, NoNullArrayList<T> list) {
    for (int i=0;i<list.size();i++) {
      if (value.compareTo(list.get(i))==1){
        return i;
      }
    }
    return list.size();
  }
  public boolean add(T object) {
    if (object==null){
      throw new IllegalArgumentException();
    } else {
      super.add(correctIndex(object,this),object);
    }
    return true;
  }
  public void add(int index, T object) {
    if (object==null){
      throw new IllegalArgumentException();
    } else {
      super.add(correctIndex(object,this),object);
    }
  }
  public T set(int index, T object) {
    if (object==null){
      throw new IllegalArgumentException();
    } else {
      super.set(correctIndex(object,this),object);
    }
    return get(index);
  }
}
