package edu.neu.csye6200;

public class Payment {

private float paidValue;
private float changeValue;

public Payment(float paidValue, float changeValue) {
	super();
	this.paidValue = paidValue;
	this.changeValue = changeValue;
}


public float getPaidValue() {
	return paidValue;
}
public void setPaidValue(float paidValue) {
	this.paidValue = paidValue;
}
public float getChangeValue() {
	return changeValue;
}
public void setChangeValue(float changeValue) {
	this.changeValue = changeValue;
}

}
