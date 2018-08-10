# dubbo-demo
ApplicationConfig 应用配置，用于配置当前应用信息，不管该应用是提供者还是消费者。
RegistryConfig 注册中心配置，用于配置连接注册中心相关信息。

ProtocolConfig 协议配置，用于配置提供服务的协议信息，协议由提供方指定，消费方被动接受。
ProviderConfig 提供方的缺省值，当ProtocolConfig和ServiceConfig某属性没有配置时，采用此缺省值。
ServiceConfig 服务配置，用于暴露一个服务，定义服务的元信息，一个服务可以用多个协议暴露，一个服务也可以注册到多个注册中心。

ConsumerConfig 消费方缺省配置，当ReferenceConfig某属性没有配置时，采用此缺省值。
ReferenceConfig 引用配置，用于创建一个远程服务代理，一个引用可以指向多个注册中心。

MethodConfig 方法配置，用于ServiceConfig和ReferenceConfig指定方法级的配置信息。
ArgumentConfig 用于指定MethodConfig参数配置。