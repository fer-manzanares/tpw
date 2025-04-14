package mx.tecnm.cdmadero.tpw.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(schema = "Person", name = "emailaddress")
data class EmailAddress(
    @Id
    @Column(name = "businessentityid")
    var businessEntityId : Int = 0,

    @Column(name = "emailaddressid")
    var emailAddressId : Int = 0,
    @Column(name = "emailaddress")
    var emailAddress : String = "",
    var rowguid : UUID = UUID.randomUUID(),
    @Column(name = "modifieddate")
    var modifiedDate : LocalDateTime = LocalDateTime.now()
)
