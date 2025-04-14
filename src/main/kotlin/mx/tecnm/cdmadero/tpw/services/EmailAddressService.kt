package mx.tecnm.cdmadero.tpw.services

import mx.tecnm.cdmadero.tpw.model.EmailAddress
import mx.tecnm.cdmadero.tpw.repository.EmailAddressRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmailAddressService( val emailAddressRepository: EmailAddressRepository ) {
    fun getById( id : Int) : EmailAddress? {
        return emailAddressRepository.findByIdOrNull(id)
    }

    fun getByEmailAddress(emailAddress : String) : Optional<EmailAddress> {
        return emailAddressRepository.findByEmailAddress(emailAddress)
    }


}