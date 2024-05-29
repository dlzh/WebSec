package dz.security.websec.securingweb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello2")
    public ResponseEntity<Map<String, String>> test(){
       return ResponseEntity.ok().body(Map.of("Hello", "Hello Test Data"));
    }
}
