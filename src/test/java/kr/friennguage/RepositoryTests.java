package kr.friennguage;

import kr.friennguage.repository.LocationRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FriennguageApplication.class)
public class RepositoryTests {
	@Autowired
	LocationRepository locationRepository;
	
	@Test
	public void locationRepository(){
		System.out.println(locationRepository.count());
	}
}
