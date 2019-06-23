package com.lzy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 李正元
 * @date 2019-06-07
 */

public class encryp {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    public void test() {
        String pwd = "123456Aa";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode(pwd);
        logger.info("【加密后的密码为：】" + encodedPassword);
    }
}
