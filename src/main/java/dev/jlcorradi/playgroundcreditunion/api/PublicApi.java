package dev.jlcorradi.playgroundcreditunion.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/public")
public class PublicApi {

    @GetMapping("/system-status")
    public ResponseEntity<?> getSystemStatus() {
        Map<String, ? extends Serializable> result = Map.of("status", "UP", "dateTime", new Date());
        return ResponseEntity.ok(result);
    }


}
