spring boot自动配置
- 1、创建spring.factories文件并指定配置类
- 2、创建配置类
- 3、在配置类使用@Configuration、@EnableConfigurationProperties(DbProperties.class)注解加载配置
- 4、在资源类(DbProperties) 使用@ConfigurationProperties(prefix = "datasource.config")注解指定属性前缀
- 5、(可省略)定义spring-configuration-metadata.json文件可以从yml定位到DbProperties类