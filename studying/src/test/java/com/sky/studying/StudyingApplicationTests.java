package com.sky.studying;

import com.sky.studying.dao.UserMapper;
import com.sky.studying.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootTest
class StudyingApplicationTests {
@Autowired
    private UserService userService;
    @Test
    public void ce(){

    }
}



