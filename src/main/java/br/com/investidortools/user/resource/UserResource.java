package br.com.investidortools.user.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investidortools.user.model.UserEntity;
import br.com.investidortools.user.repository.UserRepository;

@RestController
@RequestMapping("/v1")
public class UserResource {

	@Autowired
    UserRepository userRepository;
	
	@GetMapping("/users/{email}")
	public ResponseEntity<UserEntity> getUsers(@PathVariable(name = "email") String email) {
		UserEntity userModel = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));
		return ResponseEntity.ok(userModel);
	}
}
