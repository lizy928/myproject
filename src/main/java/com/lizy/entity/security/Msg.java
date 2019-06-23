package com.lizy.entity.security;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 向客户端传递消息
 *
 * @author 李正元
 * @date 2019-06-06
 */
@Data
@AllArgsConstructor
public class Msg {

    private String title;
    private String content;
    private String extraInfo;

}
