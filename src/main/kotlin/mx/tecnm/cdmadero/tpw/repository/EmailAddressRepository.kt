package mx.tecnm.cdmadero.tpw.repository

import mx.tecnm.cdmadero.tpw.model.EmailAddress
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EmailAddressRepository : JpaRepository<EmailAddress, Int> {
    fun findByEmailAddress(emailAddress : String) : Optional<EmailAddress>
}