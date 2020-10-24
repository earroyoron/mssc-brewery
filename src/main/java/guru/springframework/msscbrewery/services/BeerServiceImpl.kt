package guru.springframework.msscbrewery.services

import guru.springframework.msscbrewery.web.model.BeerDto
import org.springframework.stereotype.Service
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
@Service
class BeerServiceImpl : BeerService {
    override fun getBeerById(beerId: UUID): BeerDto {
        return BeerDto(id = UUID.randomUUID(),
                beerName = "Galaxy Cat",
                beerStyle = "Pale Ale")
    }
}