//Spring concepts

Bean
A Bean is just a java object that spring manages for u.

Spring container(IoC container)
The container is the brain of spring.It's responsible for
- creating all beans
- injecting their dependencies
-  Managing their lifecycle

Inversion of Control(IoC)
Normally,your code controls when and how objects are created.
With Spring, you give up that control - Spring takes over and
creates objects for u.

ApplicationContext
This is the main Spring Container implementation.
It knows every bean,manages them and resolves dependencies.