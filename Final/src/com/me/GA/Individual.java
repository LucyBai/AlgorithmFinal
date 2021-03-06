package com.me.GA;
/**
 * @author Yangyang Yi & Lu Bai
 */
public class Individual {
	private String binaryCity[];
	private int decimalCity[];
    private int distance;
 //Method to calculateDistance and set it to this individual
  public int calculateDistance(Individual in, int distance[][]) {
	    	int totalDistance=0;
	    	int[]decimalCity = in.getDecimalCity();
	    	for(int d=0;d<decimalCity.length-1;d++) {
	    		totalDistance+=distance[decimalCity[d]][decimalCity[d+1]];    		
	    	}
//	    	System.out.println("total distance: "+totalDistance);
	    	totalDistance+=distance[decimalCity[decimalCity.length-1]][decimalCity[0]];
	    	in.setDistance(totalDistance);
	      return totalDistance; 	
	    }

	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String[] getBinaryCity() {
		return binaryCity;
	}

	public void setBinaryCity(String[] binaryCity) {
		this.binaryCity = binaryCity;
	}

	public int[] getDecimalCity() {
		return decimalCity;
	}

	public void setDecimalCity(int[] decimalCity) {
		this.decimalCity = decimalCity;
	}

}
