package problem3;

public interface MyCollecion<Object> {

	 public boolean addElement(Object e);
	 public boolean removeElement(Object e);
	 public int size();
	 public void clear();
	 public boolean contains(Object e);
	 public boolean isEmpty();
	}