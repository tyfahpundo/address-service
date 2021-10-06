package zw.co.afrosoft.addressservice.domain.response;

import zw.co.afrosoft.addressservice.domain.Address;

public class AddressResponse {
    private Long addressId;
    private String street;
    private String city;

    //need a contructor to convert the Address Entity class to the model of AddressResponse
    public AddressResponse(Address address){
        this.addressId = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
