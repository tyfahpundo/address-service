package zw.co.afrosoft.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.addressservice.domain.Address;
import zw.co.afrosoft.addressservice.persistence.AddressRepository;
import zw.co.afrosoft.addressservice.domain.request.CreateAddressRequest;
import zw.co.afrosoft.addressservice.domain.response.AddressResponse;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository repo;
    @Override
    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setStreet(createAddressRequest.getStreet());
        address.setCity(createAddressRequest.getCity());

        repo.save(address);
        return new AddressResponse(address);
    }

    @Override
    public AddressResponse getById(Long id) {
        Address address = repo.findById(id).get();
        return new AddressResponse(address);
    }
}
