package org.blah.spring.controller;

import org.blah.spring.dto.UserDTO;
import org.blah.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by adam on 13.11.16.
 */
@Controller
public class RestController {

    @Inject
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public UserDTO user() {
        return userService.user();
    }
}
