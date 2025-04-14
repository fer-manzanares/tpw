package mx.tecnm.cdmadero.tpw.repository

import mx.tecnm.cdmadero.tpw.model.Password

import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.data.jpa.repository.query.Procedure
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional


interface PasswordRepository : JpaRepository<Password, Int> {

    @Procedure(name = "VerifyAccount")
    fun verifyAccount(@Param("Id")id : Int, @Param("AccountPwd")password : String) : Password?
}