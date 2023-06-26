# 智能BI平台

> 作者：[猫十二懿](https://github.com/kongshier)
> [欢迎加入星球](https://yupi.icu/) 

## 项目介绍
基于React+Spring Boot+MQ+AIGC的智能数据分析平台。
> AIGC ：Artificial Intelligence Generation Content

区别于传统的BI，数据分析者只需要导入最原始的数据集，输入想要进行分析的目标，就能利用AI自动生成一个符合要求的图表以及分析结论。此外，还会有图表管理、异步生成、AI对话等功能。只需输入分析目标、原始数据和原始问题，利用AI就能一键生成可视化图表、分析结论和问题解答，大幅降低人工数据分析成本。

**优势：** 让不会数据分析的用户也可以通过输入目标快速完成数据分析，大幅节约人力成本，将会用到 AI 接口生成分析结果


## 项目架构图
### 基础架构
基础架构：客户端输入分析诉求和原始数据，向业务后端发送请求。业务后端利用AI服务处理客户端数据，保持到数据库，并生成图表。处理后的数据由业务后端发送给AI服务，AI服务生成结果并返回给后端，最终将结果返回给客户端展示。

![image](https://github.com/kongshier/shierbi-backend/assets/94662685/1f1964bf-ed5b-4aa9-a297-247d9c106d60)
### 优化项目架构-异步化处理
优化流程（异步化）：客户端输入分析诉求和原始数据，向业务后端发送请求。业务后端将请求事件放入消息队列，并为客户端生成取餐号，让要生成图表的客户端去排队，消息队列根据I服务负载情况，定期检查进度，如果AI服务还能处理更多的图表生成请求，就向任务处理模块发送消息。

任务处理模块调用AI服务处理客户端数据，AI 服务异步生成结果返回给后端并保存到数据库，当后端的AI工服务生成完毕后，可以通过向前端发送通知的方式，或者通过业务后端监控数据库中图表生成服务的状态，来确定生成结果是否可用。若生成结果可用，前端即可获取并处理相应的数据，最终将结果返回给客户端展示。在此期间，用户可以去做自己的事情。
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/4430152e-a947-4da5-9491-5b208c7f0217)

## 项目技术栈
### 前端
1. React 18
2. Umi 4 前端框架
3. Ant Design Pro 5.x 脚手架
4. Ant Design 组件库 
5. OpenAPI 代码生成：自动生成后端调用代码
6. EChart 图表生成


### 后端

1. Java Spring Boot
2. MySQL数据库
3. Redis：Redissson限流控制
4. MyBatis-Plus 数据库访问结构 + MyBatisX ： 根据数据库表自动生成
5. **RabbitMQ：消息队列**
6. AI SDK：AI接口开发
7. JDK 线程池及异步化
8. Easy Excel：表格数据处理
9. Swagger + Knife4j 项目文档
10. Hutool 、Apache Common Utils等工具库


## BI项目展示
### 用户登录注册
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/582c5b4f-7235-42f8-8b1f-3792a2494dae)

### 项目首页
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/2ee04e8e-d217-4e58-ae7f-293e5dbaaeb2)

### 同步分析数据生成图表
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/26c602ee-c096-4fcc-b1b6-c9b9493d07c3)

### 异步分析数据生成图表
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/0dc3b178-e2df-4477-a66d-7fb71161fb25)

### 图表管理界面
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/50712f92-0127-4408-8f9b-15d17141078a)

### AI 问答助手
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/782d4982-24dc-4a51-acd8-99cb815e2bcc)

### AI 对话管理
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/d9c41c51-4a21-458f-ac53-5f0247f71280)

### 用户信息
![image](https://github.com/kongshier/shierbi-backend/assets/94662685/99e61f27-3560-4bd6-94c9-9e8283babbb6)

