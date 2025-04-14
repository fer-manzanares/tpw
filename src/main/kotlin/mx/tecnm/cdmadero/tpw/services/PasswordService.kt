package mx.tecnm.cdmadero.tpw.services

import mx.tecnm.cdmadero.tpw.model.Password
import mx.tecnm.cdmadero.tpw.repository.PasswordRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional(readOnly = true)
class PasswordService(
    private val passwordRepository: PasswordRepository,
    repository: PasswordRepository
) {

    fun getByPasswordAndId(id : Int, password : String ) =
        passwordRepository.verifyAccount(id, password)

}