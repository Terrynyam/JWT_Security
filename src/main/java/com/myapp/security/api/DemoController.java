package com.myapp.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Terrance Nyamfukudza
 * @date 16/Sep/2023
 */
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Howdy terry");
    }
}
