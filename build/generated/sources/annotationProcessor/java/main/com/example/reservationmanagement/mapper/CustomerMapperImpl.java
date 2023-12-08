package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.CustomerEntity;
import com.example.reservationmanagement.model.CustomerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T09:13:39+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerEntityToDto(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerDto.CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.name( customerEntity.getName() );
        customerDto.lastname( customerEntity.getLastname() );
        customerDto.age( customerEntity.getAge() );

        return customerDto.build();
    }

    @Override
    public CustomerEntity customerDtoToEntity(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerEntity.CustomerEntityBuilder customerEntity = CustomerEntity.builder();

        customerEntity.name( customerDto.getName() );
        customerEntity.lastname( customerDto.getLastname() );
        customerEntity.age( customerDto.getAge() );

        return customerEntity.build();
    }
}
