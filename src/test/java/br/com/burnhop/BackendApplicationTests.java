package br.com.burnhop;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.burnhop.model.Dto.CreatedPostDto;
import br.com.burnhop.model.Dto.CreatedLoginDto;
import br.com.burnhop.model.Dto.CreatedUserDto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.mockito.MockitoAnnotations;
import org.mockito.Mock;



@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class BackendApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    
	@Test
	void contextLoads() {

	}
}
