import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<A> extends ArrayList<A>{
  public NoNullArrayList(){
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
}
