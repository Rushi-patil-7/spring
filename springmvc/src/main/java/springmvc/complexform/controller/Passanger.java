package springmvc.complexform.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passanger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String gender;
	private int seatNo;
	private int ticketNo;
	private String arrival;
	private String destination;
	private double fare;
	
	public String getGender() {
		return gender;
	}	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSeatNo() {
		return seatNo;
	}
	
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	private Train train;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	@Override
	public String toString() {
		return "Passanger [id=" + id + ", name=" + name + ", gender=" + gender + " ,  seatNo=" + seatNo + ", ticketNo=" + ticketNo
				+ ", arrival=" + arrival + ", destination=" + destination + ", fare=" + fare + "]";
	}


	public Passanger() {
		super();
	}
	
	
	
}
