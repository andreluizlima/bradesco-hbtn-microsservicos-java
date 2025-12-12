package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        String msg;
        if (id > 0 && id < 100) {
            msg = "You have entered valid ID";
        } else {
            throw new UserIdException(id+"");
        }
        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        String msg;
        int length = userName.length();
        if (length > 3 && length < 15) {
            msg = "You have entered valid USERNAME";
        } else {
            throw new UserNameException(userName);
        }
        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        String msg;
        int length = cpf.length();
        if (length > 3 && length < 15) {
            msg = "You have entered valid CPF";
        } else {
            throw new CPFException(cpf);
        }
        return msg;
    }

}
