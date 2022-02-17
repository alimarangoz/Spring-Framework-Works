# Spring-Framework-Works

## Bean Scope:

In the spring "Singleton" is using as default scope which means, there is an object created by spring and it uses same object for every operation in the same configuration.
Also, "Prototype" is using in order to create new object for every operation in the same configuration.

![checking-the-location](https://user-images.githubusercontent.com/57812346/154431338-4a634039-97d7-40b1-aee0-2b640926adc5.png)

_This is Singleton, there are 2 objects there and they are in the location in memory which means that they are the same object._

![prototype-scope-definition](https://user-images.githubusercontent.com/57812346/154431721-bae9b455-eff9-4b09-b5ec-26a013da8dd5.png)

_If scope changes using "scope";_

![prototype-result](https://user-images.githubusercontent.com/57812346/154431811-9ca3361c-8d82-4393-a883-02b8feb2cdb0.png)

_They become different objects in the different memory allocation._

<hr>

## Bean Lifecycle:

Spring has own lifecycle, which means objects are created, used and destroyed. We can implement methods during the create and destroy using by _"init-method"_ for create and
_"destroy-method"_ for destory.

![init-destroy-Methods](https://user-images.githubusercontent.com/57812346/154432679-3589ffb0-183f-4048-acde-195f377755db.png)

_Here, simply created 2 method to check init and destroy method in TrackCoach class._

![add-config-file-destroy-and-init](https://user-images.githubusercontent.com/57812346/154432843-1e320b1f-0086-4255-ac06-8e7ef950368b.png)

_Add to method in configuration file using "init-method" and "destroy-method"._

![result-of-lifecycle](https://user-images.githubusercontent.com/57812346/154432936-bd23fcb7-69f1-4c48-87b6-2943801b6233.png)

_First init-method displayed then object created, finally destroy method implemented, this is the lifecycle of Spring_
