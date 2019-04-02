# dubbo-demo3
项目搭建步骤： 
第一步：安装jdk1.8 
第二步：安装zookeeper 
第三步：安装tomcat 
第四步：下载dubbo并打包到tomcat测试dubbo-admin-2.6.0 
第五步：创建项目 
	5.1：创建maven项目：dubboBootInterface（提供接口)
	5.2：创建maven项目：dubboBootProvider(服务提供者1）
	5.3：创建maven项目：dubboBootProvider2(服务提供者1）
	5.4：创建maven项目：dubboBootComsumer(服务消费者1）
	5.5：创建maven项目：dubboBootComsumer2(服务消费者2）
第六步：启动zookeeper、tomcat 
第七步: 启动服务提供者1，服务提供者2，最后启动服务消费者1，服务消费者2
第八步：测试：dubbo-web界面查看服务