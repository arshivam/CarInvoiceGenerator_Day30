package com.bridgelabz;

import java.util.Objects;

public class InvoiceSummary {

	private int noOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(int noOfRides, double totalFare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.noOfRides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(averageFare) == Double.doubleToLongBits(other.averageFare)
				&& noOfRides == other.noOfRides
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}

}
