package mx.tecnm.cdmadero.tpw.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(schema = "production", name = "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var productId : Int? = null,
    var name: String? = null,
    var productNumber : String? = null,
    var makeFlag : Int? = null,
    var finishedGoodsFlag : Int? = null,
    var color : String? = null,
    var safetyStockLevel : Int? = null,
    var reorderPoint : Int? = null,
    var standardCost : BigDecimal? = null,
    var listPrice : BigDecimal? = null,
    var daysToManufacture : Int? = null,
    var sellStartDate : LocalDate? = null,
    var rowguid : String? = UUID.randomUUID().toString(),
    var modifiedDate : LocalDate = LocalDate.now()
)
