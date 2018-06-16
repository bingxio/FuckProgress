# FuckProgress
#### 一个高度定制的 Android Progress
[我的博客](http://blog.xyiio.cn/)

##  截图
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-00-44-278_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-05-840_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-23-680_cn.xyiio.fuck.png)

## 怎么使用它
#### 1.添加 JitPack 仓库地址在你的根目录 ``build.gradle``
```
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
    }
}
```
#### 2. 在 ``app``级别的``build.gradle``添加 FuckProgress 地址并引用到你的项目
```
dependencies {
    implementation 'com.github.Turaiiao:FuckProgress:0.0.2'
}
```

#### 3.简单的使用方法
```kotlin
FuckProgress(this).light("Loading...")
FuckProgress(this).dark("Loading...")
```

## 一些函数和方法
```kotlin
FuckProgress(this)
     .setContent("Loading...")
     .setContentColor(Color.RED)
     .setContentTextSize(15F)
     .setProgressColor(Color.RED)
     .setBackgroundColor(Color.BLACK)
     .setCancel(false)
     .show()
     
val progress = FuckProgress(this)
    progress.messageText = "Loading..."
    progress.messageTextColor = Color.RED
    progress.messageTextSize = 15F
    progress.progressColor = Color.RED
    progress.backgroundColor = Color.BLACK
    progress.canCancel = false
    progress.show()
```
#### 如果 ``cancel = false`` 可以调用这个方法关闭
```kotlin
progress.dismiss()
```

##### 欢迎 Star, Fork, Issues!

### License
```
Copyright 2018 Turaiiao

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
