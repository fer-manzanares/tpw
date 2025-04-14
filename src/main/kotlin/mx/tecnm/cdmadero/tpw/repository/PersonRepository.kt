package mx.tecnm.cdmadero.tpw.repository

import mx.tecnm.cdmadero.tpw.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Int> {

}