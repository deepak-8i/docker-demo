package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env/v1")
public class EnvPropDisplayController {


    @Autowired
    private Environment env;

    @GetMapping("/app")
    public String getAppProperties() {
        return "\n"+env.getProperty("APP_NAME")+ "\n ";
    }

    @GetMapping("/custom")
    public String getCustomProperties(@RequestParam(value = "name", defaultValue = "PATH") String propertyName){
        return "\n"+env.getProperty(propertyName)+ "\n ";
    }

    @GetMapping("/db")
    public String getDBProperties() {
        return "\n"+env.getProperty("DB_NAME")+ "\n ";
    }

    @GetMapping("/secrets")
    public String getSecrets() {
        return "\n"+env.getProperty("SECRET_NAME")+ "\n ";
    }
}
