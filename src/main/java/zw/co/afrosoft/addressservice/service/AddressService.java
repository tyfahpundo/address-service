package zw.co.afrosoft.addressservice.service;

import zw.co.afrosoft.addressservice.domain.request.CreateAddressRequest;
import zw.co.afrosoft.addressservice.domain.response.AddressResponse;

public interface AddressService {
    AddressResponse createAddress(CreateAddressRequest createAddressRequest);

    AddressResponse getById(Long id);
}
