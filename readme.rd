MBG（MyBatis Generator ）

通过数据库生成实体和dao

    1.配置文件路径src/main/resources/generator/generatorConfig.xml

    2.使用方法
      （1）.在IDEA中run->Edit config...-> “+”->MAVEN->在command line加入mybatis-generator:generate -e 直接运行
     （2）.直接运行com.springmvc.utils GeneratorSqlmap 工具类
springfox swagger2

    通过导好的jar包直接生成API文档
    1.配置文件路径com.springmvc.apiController  WebAppConfig
    2.直接访问项目名+swagger-ui.html或docs.html