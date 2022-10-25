//Programmer: Brenan Marenger
//Date: 2/17/20
//Assignment: Ch4 Ex2
//Description: Create  a class that includes 3 overloaded methods for a photo book store

public class Billing {
	private float photoPrice = 0;
	private int photoBooks = 1;
	private final int taxPercent = 8;
	private float couponValuePercent = 0;
	private float totalDue = 0;
	
	public Billing(float photoPrice)
	{
		this.photoPrice = photoPrice;
		totalDue = calcOneBook();
	}
	
	public Billing(float photoPrice, int photoBooks)
	{
		this(photoPrice);
		this.photoBooks = photoBooks;
		totalDue = calcBooksPrice();
	}
	
	public Billing (float photoPrice, int photoBooks, float couponValuePercent)
	{
		this(photoPrice, photoBooks);
		this.couponValuePercent = couponValuePercent;
		totalDue = calcBookWithCoupon();
	}
	