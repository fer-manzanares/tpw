package mx.tecnm.cdmadero.tpw.model

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(schema = "person", name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var businessEntityID : Int = 0,
    var personType : String = "",
    var nameStyle : Boolean = false,
    var title : String = "",
    var firstName : String = "",
    var middleName : String = "",
    var lastName : String = "",
    var suffix : String = "",
    var emailPromotion : Int = 0,
    var additionalContactInfo : String = "",
    var demographics : String = "",
    var rowguid : UUID? = null,
    var modifiedDate : LocalDateTime = LocalDateTime.now()
)
