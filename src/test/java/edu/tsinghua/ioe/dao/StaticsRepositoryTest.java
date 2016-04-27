package edu.tsinghua.ioe.dao;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.tsinghua.ioe.StaticsConfiguration;
import edu.tsinghua.ioe.model.Statics;

@SpringApplicationConfiguration(classes = StaticsConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest("server.port:0")
@Transactional
public class StaticsRepositoryTest {

    @Autowired
    private StaticsRepository staticsRepository;

    
    @Test
    public void findAll_andSuccess() {
    	List<Statics> userList = staticsRepository.findAll();
    	System.out.println(userList);
    	assertThat(userList).isNotEmpty();
    }
    
    

}