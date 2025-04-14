package mx.tecnm.cdmadero.tpw.model

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(schema = "person", name = "password")
data class Password(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var businessEntityID : Int = 0,
    var passwordHash : String = "",
    var passwordSalt : String = "",
    var rowguid : UUID? = null,
    var modifiedDate : LocalDateTime = LocalDateTime.now(),
)
