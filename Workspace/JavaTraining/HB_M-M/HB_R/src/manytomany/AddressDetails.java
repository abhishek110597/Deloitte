package manytomany;

public class AddressDetails {
private int addressId;
private String cityName;
private int stateName;

public AddressDetails() {
	// TODO Auto-generated constructor stub
}

public AddressDetails(int addressId, String cityName, int stateName) {
	super();
	this.addressId = addressId;
	this.cityName = cityName;
	this.stateName = stateName;
}

public int getAddressId() {
	return this.addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

public int getStateName() {
	return stateName;
}

public void setStateName(int stateName) {
	this.stateName = stateName;
}

@Override
public String toString() {
	return "AddressDetails [AddressId=" + addressId + ", cityName=" + cityName + ", stateName=" + stateName + "]";
}



}
