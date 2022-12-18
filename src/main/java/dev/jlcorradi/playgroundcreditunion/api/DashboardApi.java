package dev.jlcorradi.playgroundcreditunion.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/dashboard")
public class DashboardApi {

    @GetMapping("/balance")
    public ResponseEntity<?> getBalance() {
        Map<String, ? extends Serializable> result = Map.of("22334", "Test Account", "Amount", BigDecimal.valueOf(29924));
        return ResponseEntity.ok(result);
    }

}
