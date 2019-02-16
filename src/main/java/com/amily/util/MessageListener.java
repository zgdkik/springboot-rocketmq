package com.amily.util;

import com.amily.Enum.MqAction;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.common.message.MessageExt;


/**
 * @author lizhuo
 * @since 2019/1/5 下午8:55
 **/
public interface MessageListener {

    /**
     * mq 消费接口
     * @param var1
     * @param context
     * @return
     */
    MqAction consume(MessageExt var1, ConsumeConcurrentlyContext context);
}
