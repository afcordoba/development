package model;

public class Camara implements java.io.Serializable {

	private String varName;
	private String timeString;
	private String varValue;

	public Camara() {
	}

	public Camara(String varName, String timeString, String varValue) {
		this.varName = varName;
		this.timeString = timeString;
		this.varValue = varValue;
	}

	public String getVarName() {
		return this.varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	public String getTimeString() {
		return this.timeString;
	}

	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}

	public String getVarValue() {
		return this.varValue;
	}

	public void setVarValue(String varValue) {
		this.varValue = varValue;
	}

	
}
