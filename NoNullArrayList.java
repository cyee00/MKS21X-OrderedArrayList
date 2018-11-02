import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T object) {
    if (object==null){
      throw new IllegalArgumentException();
    } else {
      super.set(index,object);
    }
    return null;
  }
}
