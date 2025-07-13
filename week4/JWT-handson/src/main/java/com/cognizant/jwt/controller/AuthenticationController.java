package com.cognizant.jwt.controller;

import com.cognizant.jwt.model.JwtResponse;
import com.cognizant.jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private JwtService jwtService;
    
    @PostMapping("/authenticate")
    public ResponseEntity<JwtResponse> authenticate() {
        // The authentication is handled by Spring Security's Basic Authentication
        // The username and password are extracted from the Authorization header
        // This method will only be called if authentication is successful
        
        // Get the authenticated user's name from the security context
        String username = "user"; // For this example, we'll use a fixed username
        
        // Generate JWT token
        String token = jwtService.generateToken(username);
        
        return ResponseEntity.ok(new JwtResponse(token));
    }
} 