package guru.springframework.msscbrewery.web.model

import java.util.UUID

class BeerDto(val id: UUID,
              val beerName: String,
              val beerStyle: String,
              val upc: Long = 0L)
