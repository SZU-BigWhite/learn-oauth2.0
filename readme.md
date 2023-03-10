# 学习Oauth2.0 流程 和 Spring Security 
参看文档
https://spring.io/projects/spring-authorization-server
https://docs.spring.io/spring-authorization-server/docs/current/reference/html/getting-started.html

参考代码
https://github.com/spring-projects/spring-authorization-server/tree/main/samples

## auth2-server 认证服务器
负责用户的登录、身份认证及授权
1. 负责用户身份的认证
2. 签发 jwt
3. 校验 jwt
4. 授权服务器

## auth2-resource 资源服务器
存放需认证的资源，比如用户头像、手机号、名称等敏感信息。访问该资源需要 认证服务器 签发的 jwt,并且 jwt 授予的权限足够访问对应的资源

## auth2-client1/auth2-client2 客户端服务器
需要以 auth2-server 作为认证服务器的 客户端服务器