package day18;

public class Person {
    private String name;
  
   private int id;
   public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public Person(){}
public Person(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + "]";
}
public void setId(int id) {
	this.id = id;
}

}