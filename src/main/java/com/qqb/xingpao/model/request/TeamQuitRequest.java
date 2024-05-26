package com.qqb.xingpao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author qqb
 * xingpao
 */
@Data
public class TeamQuitRequest implements Serializable {

    // 开发者 [coder_yupi](https://space.bilibili.com/12890453/)

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

}
