package zw.co.afrosoft.addressservice.service;

import zw.co.afrosoft.addressservice.domain.request.CreateAddressRequest;
import zw.co.afrosoft.addressservice.domain.response.AddressResponse;

import java.util.List;

public interface AddressService {
    AddressResponse createAddress(CreateAddressRequest createAddressRequest);

    AddressResponse getById(Long id);

    AddressResponse getByStreetName(String street);

    List<AddressResponse> getAll();
}
