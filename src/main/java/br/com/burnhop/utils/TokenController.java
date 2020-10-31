package br.com.burnhop.utils;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Key;

public class TokenController {

    @Autowired
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    public String createToken(int id) {
        return Jwts.builder().setSubject(String.valueOf(id)).signWith(key).compact();
    }

    public boolean validToken(String token) {

        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;

        } catch (JwtException e) {
            return false;

        }
    }
}
