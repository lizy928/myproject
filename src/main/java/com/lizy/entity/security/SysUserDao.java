package com.lizy.entity.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李正元
 * @date 2019-06-06
 */
@Service
public class SysUserDao {

    /**
     * 用户数据查询
     *
     * @param username
     * @return
     */
    SysUser findByUsername(String username) {

        SysUser sysUser = new SysUser();
        sysUser.setId(10001L);
        sysUser.setPassword(username);
        sysUser.setUsername(username);


        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode(sysUser.getPassword().trim());
        sysUser.setPassword(encodedPassword);


        SysRole sysRole1 = new SysRole();
        sysRole1.setId(01);
        sysRole1.setName("ROLE_ADMIN");

        SysRole sysRole2 = new SysRole();
        sysRole2.setId(02);
        sysRole2.setName("ROLE_USER");

        List<SysRole> list = new ArrayList<>();
        list.add(sysRole1);
        list.add(sysRole2);

        sysUser.setRoles(list);

        return sysUser;
    }

}
