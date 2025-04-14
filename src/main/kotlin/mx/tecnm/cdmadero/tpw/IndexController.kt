package mx.tecnm.cdmadero.tpw

import mx.tecnm.cdmadero.tpw.model.EmailAddress
import mx.tecnm.cdmadero.tpw.model.LoginData
import mx.tecnm.cdmadero.tpw.services.EmailAddressService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime
import java.util.*

@Controller
@RequestMapping("/")
class IndexController ( val emailAddressService: EmailAddressService){

    @GetMapping("")
    fun getIndex(model : Model) = "index"

}