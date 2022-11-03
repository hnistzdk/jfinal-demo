package com.zdk.demo.config;

import com.jfinal.config.*;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

/**
 * @Description
 * @Author zdk
 * @Date 2022/11/3 13:01
 */
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setResolveJsonRequest(true);
    }

    @Override
    public void configRoute(Routes me) {
        // jfinal 4.9.03 版新增了路由扫描功能，不必手动添加路由
        // me.add("/hello", HelloController.class);

        // 使用路由扫描，参数 "demo." 表示只扫描 demo 包及其子包下的路由
        me.scan("com.zdk.demo.controller");
    }
    @Override
    public void configEngine(Engine me) {}
    @Override
    public void configPlugin(Plugins me) {}
    @Override
    public void configInterceptor(Interceptors me) {}
    @Override
    public void configHandler(Handlers me) {}
}
