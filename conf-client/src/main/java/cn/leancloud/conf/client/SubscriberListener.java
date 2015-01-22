/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 * Authors:
 *   leiwen <chrisredfield1985@126.com> , boyan <killme2008@gmail.com>
 */
package cn.leancloud.conf.client;

import java.util.concurrent.Executor;

import cn.leancloud.conf.configinfo.ConfigureInfomation;


/**
 * Diamond订阅者的配置信息监听器
 * 
 * @author aoqiong
 * 
 */
public interface SubscriberListener {

    public Executor getExecutor();


    /**
     * 接收到一次配置信息
     * 
     * @param configureInfomation
     */
    public void receiveConfigInfo(final ConfigureInfomation configureInfomation);
}
