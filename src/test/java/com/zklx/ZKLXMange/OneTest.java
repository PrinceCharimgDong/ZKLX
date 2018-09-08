/**  

* <p>Title: OneTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年9月3日  上午11:29:02

* @version 1.0  

*/  
package com.zklx.ZKLXMange;
/*
import static org.junit.Assert.*;*/

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  

* <p>Title: OneTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年9月3日  上午11:29:02

* @version 1.0  

*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-mybatis.xml")
public class OneTest {

    @Autowired
    private RedisTemplate redisTemplate;

    //private static final Logger log  = Logger.getLogger(TestRedis.class.getName());

    @Test
    public void test(){
        redisTemplate.opsForValue().set("aa", "123");
        //log.info("value："+redisTemplate.opsForValue().get("aa"));
        System.out.println("value："+redisTemplate.opsForValue().get("aa"));
    }
	

}
