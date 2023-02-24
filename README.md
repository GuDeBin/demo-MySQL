# Spring 教程

## 使用 MySQL 访问数据

教程地址[Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## 使用 Spring 构建 REST 服务

教程地址[Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

按照上面的教程建了一个。。。。按照教程上半段，这个不应该叫做REST服务，只能算作是RPC（远程调用）

还是简单说下过程

使用JPA构建一个简易的增删改查，首先是一个实体类，一个增删改查接口也就是Repository，这里我用的是CrudRepository，异常抛出和统一处理异常，控制器返回各个请求，LoadDatabase预加载数据