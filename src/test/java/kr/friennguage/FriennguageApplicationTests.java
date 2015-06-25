package kr.friennguage;

import java.util.Collection;

import kr.friennguage.dto.FLRequest;
import kr.friennguage.util.TokenUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class FriennguageApplicationTests {

	@Test
	public void fLRequest(){
//		System.out.println(FLRequest.Code.FL0001.compareTo());
	}
	
	
	@Test
	public void tokenTests(){
		UserDetails userDetails = new UserDetails() {
			@Override
			public boolean isEnabled() {
				return false;
			}
			@Override
			public boolean isCredentialsNonExpired() {
				return false;
			}
			@Override
			public boolean isAccountNonLocked() {
				return false;
			}
			
			@Override
			public boolean isAccountNonExpired() {
				return false;
			}
			
			@Override
			public String getUsername() {
				return "bobinlee";
			}
			
			@Override
			public String getPassword() {
				return "1234";
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return null;
			}
		};
		
		String token = TokenUtils.createToken(userDetails);
		System.out.println(token);
	}
	
}
