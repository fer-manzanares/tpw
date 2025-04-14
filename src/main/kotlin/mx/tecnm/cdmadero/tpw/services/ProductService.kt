package mx.tecnm.cdmadero.tpw.services

import mx.tecnm.cdmadero.tpw.model.Product
import mx.tecnm.cdmadero.tpw.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService (
    val productRepository: ProductRepository
) {
    fun findAll() = productRepository.findAll()
    fun save(product: Product) : Optional<Product> {
        if (product.productId == null){
            if (product.productNumber == null
                || productRepository.findByProductNumber(product.productNumber!!).isEmpty()
                ||  product.productNumber!!.length > 25){
                return Optional.empty()
            }
        }
        return Optional.of( productRepository.save(product))
    }

    fun findById(id: Int) = productRepository.findById(id)
}