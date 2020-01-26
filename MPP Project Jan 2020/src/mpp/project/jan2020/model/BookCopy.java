package mpp.project.jan2020.model;

public class BookCopy {
int numCopy;

public int getNumCopy() {
	return numCopy;
}

public BookCopy(int numCopy) {
	super();
	this.numCopy = numCopy;
}

@Override
public String toString() {
	return "BookCopy numCopy=" + numCopy;
}
}
