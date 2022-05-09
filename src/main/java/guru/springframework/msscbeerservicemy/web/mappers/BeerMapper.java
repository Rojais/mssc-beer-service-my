package guru.springframework.msscbeerservicemy.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.msscbeerservicemy.domain.Beer;
import guru.springframework.msscbeerservicemy.web.model.BeerDto;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
