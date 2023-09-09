package com.userspringboot.controller;

import com.userspringboot.services.PrototypeBean;
import com.userspringboot.services.SingletonBeam;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
public class TestController {


    public TestController(ApplicationContext context) {
        this.context = context;
    }

    private final ApplicationContext context;

    @GetMapping("/singleton")
    public ResponseEntity<String> getSingletonScope() {
        SingletonBeam singletonBean = context.getBean(SingletonBeam.class);
        return ResponseEntity.ok(singletonBean.toString());
    }

    @GetMapping("/prototype")
    public ResponseEntity<String> getPrototypeScope() {
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        return ResponseEntity.ok(prototypeBean.toString());
    }
}
