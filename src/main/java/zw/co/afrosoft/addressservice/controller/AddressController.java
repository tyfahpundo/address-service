package zw.co.afrosoft.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.addressservice.domain.request.CreateAddressRequest;
import zw.co.afrosoft.addressservice.domain.response.AddressResponse;
import zw.co.afrosoft.addressservice.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public ResponseEntity<AddressResponse> createAddress(@RequestBody CreateAddressRequest createAddressRequest){
        AddressResponse response = addressService.createAddress(createAddressRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<AddressResponse> getById(@PathVariable Long id){
        AddressResponse response = addressService.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/getByStreetName/{street}")
    public ResponseEntity<AddressResponse> getByStreetName(@PathVariable String street){
        AddressResponse response = addressService.getByStreetName(street);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<AddressResponse>> getAll(){
        List<AddressResponse> response = addressService.getAll();
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
}
