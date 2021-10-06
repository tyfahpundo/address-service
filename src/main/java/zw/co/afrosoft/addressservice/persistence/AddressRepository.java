package zw.co.afrosoft.addressservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.addressservice.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
