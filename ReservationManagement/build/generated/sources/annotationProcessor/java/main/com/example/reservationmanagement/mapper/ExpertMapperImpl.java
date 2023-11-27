package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.ExpertEntity;
import com.example.reservationmanagement.model.ExpertDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T01:08:03+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ExpertMapperImpl implements ExpertMapper {

    @Override
    public ExpertDto expertEntityToDto(ExpertEntity expertEntity) {
        if ( expertEntity == null ) {
            return null;
        }

        ExpertDto.ExpertDtoBuilder expertDto = ExpertDto.builder();

        expertDto.name( expertEntity.getName() );
        expertDto.lastname( expertEntity.getLastname() );
        expertDto.age( expertEntity.getAge() );
        expertDto.experienceYears( expertEntity.getExperienceYears() );
        expertDto.experienceMonths( expertEntity.getExperienceMonths() );
        expertDto.description( expertEntity.getDescription() );

        return expertDto.build();
    }

    @Override
    public ExpertEntity expertDtoToEntity(ExpertDto expertDto) {
        if ( expertDto == null ) {
            return null;
        }

        ExpertEntity.ExpertEntityBuilder expertEntity = ExpertEntity.builder();

        expertEntity.name( expertDto.getName() );
        expertEntity.lastname( expertDto.getLastname() );
        expertEntity.age( expertDto.getAge() );
        expertEntity.experienceYears( expertDto.getExperienceYears() );
        expertEntity.experienceMonths( expertDto.getExperienceMonths() );
        expertEntity.description( expertDto.getDescription() );

        return expertEntity.build();
    }
}
