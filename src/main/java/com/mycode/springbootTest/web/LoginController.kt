package com.mycode.springbootTest.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class LoginController {


    @RequestMapping("/login")
    @ResponseBody
    fun login(): String {
        return "login ok"
    }
}
