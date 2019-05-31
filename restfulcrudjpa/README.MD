# 遇到的問題：
## `Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.`
我这里的原因是 application.properties 中未配置`spring.profiles.active=dev` 属性去激活dev 环境的配置，
该配置在`src/main/resource/config/application-dev.properties`
配置激活属性后即可