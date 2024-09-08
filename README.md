---
### 👉作者QQ ：1556708905 微信：zheng0123Long (支持修改、部署调试、定制毕设)

### 👉接网站建设、小程序、H5、APP、各种系统等

### 👉选题+开题报告+任务书+程序定制+安装调试+ppt 都可以做
---

**毕业设计所有选题地址 [https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)**

**博客地址：
[https://blog.csdn.net/2303_76227485/article/details/131901194](https://blog.csdn.net/2303_76227485/article/details/131901194)**

**视频演示：
[https://www.bilibili.com/video/BV1T14y1X7sY/](https://www.bilibili.com/video/BV1T14y1X7sY/)**

## 基于Springboot+Vue的房屋维修系统(源代码+数据库+14000字论文)060

## 一、系统介绍

本系统前后端分离

本系统分为管理员、业主和维修工三种角色

业主角色包含以下功能：

- 登录、注册、查看主页、发布维修工单、发起投诉、个人中心、密码修改

维修工角色包含以下功能：

- 登录、注册、维修工单管理、查看投诉信息、个人中心、密码修改

管理员角色包含以下功能：

- 登录、用户管理、菜单管理、部门管理、角色管理、维修工管理、工单管理、维修类型管理、投诉管理、公告管理、数据监控、个人中心、密码修改

论文目录
![contents](./picture/picture01.png)
功能结构图
![contents](./picture/picture02.png)

## 二、所用技术

后端技术栈：

- Springboot
- Mybatis
- Mysql
- Jwt
- SpringSecurity
- Redis

前端技术栈：

- Vue
- vue-router
- axios
- Ajax
- element-ui

## 三、环境介绍

基础环境 :IDEA/eclipse, JDK1.8, Mysql5.7及以上,Maven3.6, node14, Redis5.0, 

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图

### 1、管理员页面

![contents](./picture/picture0.png)
![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)

### 2、用户页面

![contents](./picture/picture19.png)
![contents](./picture/picture20.png)

### 3、维修工页面

![contents](./picture/picture21.png)
![contents](./picture/picture22.png)

## 五、浏览地址

后台访问地址：http://127.0.0.1/

- 管理员账号/密码：admin/123456
- 维修工账号/密码：lisi/123456
- 用户账号/密码：zhangqiang/123456

## 六、部署教程

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并导入项目的sql文件；
2. 使用IDEA/Eclipse/导入repair项目，导入时，若为maven项目请选择maven; 
   
   若为maven项目，导入成功后请执行maven clean;maven install命令，然后运行；
3. 修改application.yml 里面的数据库配置和redis配置
4. 先启动redis5.0,然后src/main/java/com/ruoyi/RuoYiApplication.java下启动后端项目
5. vscode或idea打开ruoyi-ui项目，
6. 打开终端，执行npm install 依赖下载完成后执行 npm run dev,执行成功后会显示访问地址
7. 访问  http://localhost:8080/
