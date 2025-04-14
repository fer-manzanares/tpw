package mx.tecnm.cdmadero.tpw.services

import mx.tecnm.cdmadero.tpw.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(
    val personRepository: PersonRepository
) {
    fun getPersonById(id : Int) = personRepository.findById(id)
}