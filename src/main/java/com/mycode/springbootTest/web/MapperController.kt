package com.mycode.springbootTest.web


import com.mycode.springbootTest.bean.User
import com.mycode.springbootTest.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import javax.annotation.Resource

@Controller
class MapperController {

    @Autowired
    private val userMapper: UserMapper? = null


    @RequestMapping("/query")
    @ResponseBody
    fun queryUserList(): List<User> {
        return userMapper!!.queryUserList()
    }
}
