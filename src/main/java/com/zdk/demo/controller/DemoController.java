package com.zdk.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.core.paragetter.Para;
import com.jfinal.ext.interceptor.GET;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.kit.Kv;
import com.zdk.demo.model.Test;

/**
 * @Description
 * @Author zdk
 * @Date 2022/11/3 13:02
 */
@Path("demo")
public class DemoController extends Controller {
    @Before(POST.class)
    public void index(@Para("key") String key,@Para("value") String value){
        renderJson(Kv.by("key", key).set("value", value));
    }

    @Before(POST.class)
    public void index1(Test test){
        renderJson(Kv.by("key", test.getKey()).set("value", test.getValue()));
    }

    @Before(GET.class)
    public void index2(@Para("key") String key,@Para("value") String value){
        renderJson(Kv.by("key", key).set("value", value));
    }
}
