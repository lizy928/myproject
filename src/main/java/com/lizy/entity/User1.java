package com.lizy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created By Lizhengyuan on 18-8-31
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User1 implements Serializable {

    private Integer id;
    private String name;
    private String address;
    private boolean isAdmin;

}
