package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.repository.CustomerRepository;
import com.example.reservationmanagement.mapper.CustomerMapper;
import com.example.reservationmanagement.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerDto> getAllCustomers(){
        return customerRepository.findAll().stream().map(customerMapper::customerEntityToDto).toList();
    }

    public void addCustomer(CustomerDto customerDto){
        var entity = customerMapper.customerDtoToEntity(customerDto);
        customerRepository.save(entity);
    }
}
