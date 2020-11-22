# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-sql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)


```mysql-sql
CREATE TABLE `financial_record`(
    `id` INT(11) UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `create_time` TIMESTAMP NOT NULL,
    `name` VARCHAR(22) NOT NULL,
    `price` FLOAT  UNSIGNED NOT NULL,
    `count` INT UNSIGNED NOT NULL,
    `type` CHAR DEFAULT '',
    `note` VARCHAR(100)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
