package com.mycode.springbootTest.mapper


import com.mycode.springbootTest.bean.User
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserMapper {

    fun queryUserList(): List<User>
}
