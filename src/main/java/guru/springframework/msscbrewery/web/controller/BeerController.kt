package guru.springframework.msscbrewery.web.controller

import guru.springframework.msscbrewery.services.BeerService
import guru.springframework.msscbrewery.web.model.BeerDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
class BeerController(private val beerService: BeerService) {
    @GetMapping("/{beerId}")
    fun getBeer(@PathVariable(value = "beerId") beerId: UUID): ResponseEntity<BeerDto> {
        return ResponseEntity(beerService.getBeerById(beerId), HttpStatus.OK)
    }
}