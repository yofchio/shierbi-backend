package com.shier.shierbi.bizmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author Shier
 * CreateTime 2023/6/24 16:08
 * 创建测试测序用到的交换机和队列 (仅执行一次)
 */
public class RabbitMqInitDemo {
    public static void main(String[] args) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            // 设置 rabbitmq 对应的信息
            factory.setHost("8.134.37.7");
            factory.setUsername("shier");
            factory.setPassword("kcsen123456");

            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            String demoExchange = "demo_exchange";

            channel.exchangeDeclare(demoExchange, "direct");

            // 创建队列，分配一个队列名称：demo_queue
            String queueName = "demo_queue";
            channel.queueDeclare(queueName, true, false, false, null);
            channel.queueBind(queueName, demoExchange, "demo_routingKey");

        }catch (Exception e){

        }
    }

}
