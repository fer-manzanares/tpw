package mx.tecnm.cdmadero.tpw.repository

import mx.tecnm.cdmadero.tpw.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductRepository : JpaRepository<Product, Int> {
    fun findByProductNumber(productNumber: String): Optional<Product>
}