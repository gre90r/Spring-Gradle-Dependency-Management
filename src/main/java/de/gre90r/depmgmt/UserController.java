package de.gre90r.depmgmt;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping()
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("hello");
    }
}
