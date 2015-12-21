import java.util.ArrayList;
import java.util.ListIterator;

abstract class Component{
	abstract void op();
}

class Question extends Component{
	  String description;
	  public Question(String desc) {
	     this.description = desc;
	   }
	  public void print() {
	     System.out.println(description);
	  }  
	
	 ArrayList <Component> list ;
	 public Question () { 
		 list = new ArrayList <Component >() ; 
	}
	 void addComponent(Component c) { 
		 list . add(c) ; 
	 }
	 void op() { 
		 ListIterator <Component> iterator = list . listIterator () ; 
		 while ( iterator . hasNext () ) { 
			 Component c = iterator . next () ; 
			 c.op() ; 
		 }
	} 

    
}
class Leaf extends Component { 
	// OPERATION in LEAF 
	void op() { 
		System.out.println("Test");
	} 
}
	



public class Test {

	public static void main(String[] args) {
		Component[] cc = new Question[10];
		// TODO Auto-generated method stub
		for (Component c: cc)
		 c.op() ;
		
	}

}
