import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class VoidMethodClass {
	List<String> persons;
	public VoidMethodClass()
	{
		persons=new ArrayList<>();
	}
	
	public void addPerson(String person) {
		persons.add(person);
	}
	
	public int size() {
		return persons.size();
	}
	
	public void removePerson(String person)
	{
		if(!persons.contains(person))
			throw new NoSuchElementException();
		persons.remove(person);
	}
	
	public void removeAll()
	{
		persons.clear();
	}
}
