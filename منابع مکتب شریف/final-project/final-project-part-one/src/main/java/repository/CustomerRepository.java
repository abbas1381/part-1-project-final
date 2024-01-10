package repository;

import base.repository.BaseEntityRepository;
import domain.userEntity.Customer;

import java.util.List;

public interface CustomerRepository extends BaseEntityRepository<Integer, Customer> {

     List<String> showEmail();

}
