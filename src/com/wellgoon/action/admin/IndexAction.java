package com.wellgoon.action.admin;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 项目名称：wellgoon
 * 项目包名：com.wellgoon.action.admin
 * 类    名：IndexAction
 * 创 建 人：Rocky
 * 创 建 于：2015/7/29
 */
@Controller("indexAdmin")
@Scope("prototype")
public class IndexAction extends ActionSupport {
    /**
     * index方法跳转到首页
     * @return String
     */
    public String index(){
        return SUCCESS;
    }
}
