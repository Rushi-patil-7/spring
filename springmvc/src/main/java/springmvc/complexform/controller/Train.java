package springmvc.complexform.controller;

public class Train {

	private int trainNo;
	private String trainName;

	
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}


	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName +  "]";
	}
	
	
}
