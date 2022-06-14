# Spring Boot Autoconfiguration

Under the hood, auto-configuration is implemented with standard `@Configuration` classes. Additional `@Conditional`
annotations are used to constrain when the auto-configuration should apply. Usually, auto-configuration classes use
`@ConditionalOnClass` and `@ConditionalOnMissingBean` annotations. This ensures that auto-configuration applies only
when relevant classes are found and when you have not declared your own @Configuration.

You can browse the source code of spring-boot-autoconfigure to see the `@Configuration` classes that Spring provides
(see the `META-INF/spring.factories` file).

Spring Boot checks for the presence of a `META-INF/spring.factories` file within your published jar. The file should
list your configuration classes under the `EnableAutoConfiguration` key.

`org.springframework.boot.autoconfigure.EnableAutoConfiguration=\`

`com.francesca.platon.config.runtime.CustomConfig,\`

`com.francesca.platon.config.conditional.CustomConfig`

Auto-configurations must be loaded that way only. Make sure that they are defined in a specific package space and that
they are never the target of component scanning. Furthermore, auto-configuration classes should not enable component
scanning to find additional components. Specific `@Imports` should be used instead.