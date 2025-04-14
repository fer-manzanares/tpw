package mx.tecnm.cdmadero.tpw

import mx.tecnm.cdmadero.tpw.model.Product
import mx.tecnm.cdmadero.tpw.services.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.util.Optional

@Controller
@RequestMapping("/product")
class ProductController (val productService: ProductService) {
    @GetMapping("")
    fun getProducts(model: Model): String {
        model.addAttribute("products", productService.findAll())
        return "products"
    }

    @GetMapping("/new")
    fun getNewProduct(model: Model): String {
        model.addAttribute("product", Product())
        model.addAttribute("colors", listOf("Silver", "Black", "Red", "Yellow", "Blue"))
        return "product"
    }

    @GetMapping("/edit/{id}")
    fun getProduct(model: Model, @PathVariable id : Int): String {
        val product = productService.findById(id)
        if (product.isPresent()) {
            model.addAttribute("product", product.get())
            model.addAttribute("colors", listOf("Silver", "Black", "Red", "Yellow", "Blue"))
            return "product"
        }else return "products"
    }

    @PostMapping("")
    fun save(model: Model,  @ModelAttribute product: Product): String {
        val optionalProduct = productService.save(product)
        if (optionalProduct.isPresent()) {
            model.addAttribute("products", productService.findAll())
            return "products"
        }else{
            model.addAttribute("product", product)
            model.addAttribute("error", "Revise la captura")
            return "product"
        }
    }
}