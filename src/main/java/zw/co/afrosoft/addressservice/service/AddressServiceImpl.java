package zw.co.afrosoft.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.addressservice.domain.Address;
import zw.co.afrosoft.addressservice.persistence.AddressRepository;
import zw.co.afrosoft.addressservice.domain.request.CreateAddressRequest;
import zw.co.afrosoft.addressservice.domain.response.AddressResponse;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public AddressResponse getByStreetName(String street) {
        Address address = repo.findByStreet(street);
        return new AddressResponse(address);
    }

    @Override
    public List<AddressResponse> getAll() {
        List<Address> addressList = repo.findAll();
        List<AddressResponse> responseList = new ArrayList<>();
        addressList.stream()
                .forEach(address -> responseList.add(new AddressResponse(address)));

        return responseList;
    }
}
