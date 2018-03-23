## myComponent 

根据原创"得到"APP作者开源,进一步的对APP模块化组件化进行梳理和抽取
[Android组件化方案开源](https://www.jianshu.com/p/1b1d77f58e84)

### 组件化缘故
当项目逐渐变大的时候，每次你改动了很小的一部分，你也需要重新编译整个APP，举个例子，修改了个人中心样式显示,就得重新编译整个APP.当随着业务的增多，代码变的越来越复杂，每个模块之间的代码耦合变得越来越严重，解耦问题急需解决，同时编译时间也会越来越长。

### 组件化要点
- 组件与组件跳转(Router)
- 组件与组件之间依赖服务
- 广播(EventBus)
- 组件以lib和application形式存在(可独立运行)

### 组件化模块介绍
- app(主项目，负责集成众多组件，控制组件的生命周期)
- basiclib(公共的基础库，一些第三方的库(网络图片\请求\公共类等))
- basicres(定义了全局通用的theme和color等公共资源)
- build-gradle(组件化编译的gradle插件，也是整个组件化方案的核心)
- componentlib(组件化的基础库(比如router初始化))
- componentservice(组件之间的服务库)	
- hotelcomponent(模块组件[测试用例])
- sceniccomponent(模块组件[测试用例])

### 组件化总结
####利端:
		每个模块都可以单独调试,节省编译时间
		可以共享工具类,网络库等
		快速测试
		公司业务繁重,可以不断复用模块,节省开发时间
		积累开发工具(个人)

####弊端:
		组件之间存在业务联系(componentService)
		资源命令重复(组件中build.gradle  resourcePrefix命名)
		引用冲突(框架中添加了dependencies.gradle[作用:统一管理版本,第三方引用等])


