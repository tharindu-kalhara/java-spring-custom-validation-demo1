package com.example.demo;

import com.example.demo.dto.Check2;
import com.example.demo.dto.CheckI;
import com.example.demo.dto.Student;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by kalhara@boswin on 10/15/2018 9:25 PM.
 */
@RestController
public class TestController {
    @PostMapping("test")
    public Object test(@Valid @RequestBody Student student) {
        return student;
    }
}
