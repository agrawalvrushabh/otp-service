package com.core.otp.Controller;

import com.core.otp.OtpRepository;
import com.core.otp.entity.Otp;
import com.core.otp.entity.OtpResponse;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/otp")
@RequiredArgsConstructor
public class OtpController {

    private final OtpRepository otpRepository;


    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable Long id){
        return ResponseEntity.ok("FROM_DOCKER_NEW_CODE");
    }

    @GetMapping
    public ResponseEntity<Page<Otp>> getAllOtp(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size)  {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(otpRepository.findAll(pageable));
    }
}
