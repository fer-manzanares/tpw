package mx.tecnm.cdmadero.tpw

import mx.tecnm.cdmadero.tpw.model.LoginData
import mx.tecnm.cdmadero.tpw.repository.PasswordRepository
import mx.tecnm.cdmadero.tpw.services.EmailAddressService
import mx.tecnm.cdmadero.tpw.services.PasswordService
import mx.tecnm.cdmadero.tpw.services.PersonService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/loginform")
class LoginController(
    private val emailAddressService: EmailAddressService,
    private val passwordService: PasswordService,
    val personService: PersonService,
) {
    @GetMapping("")
    fun login(model: Model): String {
        model.addAttribute("loginData", LoginData())
        return "login"
    }

    @PostMapping("")
    fun login(model: Model, @ModelAttribute loginData: LoginData): String {
        val email = emailAddressService.getByEmailAddress(loginData.emailAddress)
        if (email.isPresent) {
            val password = passwordService.getByPasswordAndId(email.get().businessEntityId, loginData.password)
            if (password != null) {
                val person = personService.getPersonById(email.get().businessEntityId)
                if (person.isPresent) {
                    model.addAttribute("person", person.get())
                    return "index"
                }
            }
        }
        model.addAttribute("errorCode", true)
        model.addAttribute("errorMessage", "Invalid email address or password")
        return "login"
    }
}
