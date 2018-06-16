# FuckProgress
#### A highly customized loading box, use kotlin in android library
[MyBlog](http://blog.xyiio.cn/)

##  Screenshot
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-00-44-278_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-05-840_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-23-680_cn.xyiio.fuck.png)

## How to use it  
[中文简介](https://github.com/Turaiiao/FuckProgress/blob/master/README-CN.md)
#### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
    }
}
```
#### Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.Turaiiao:FuckProgress:0.0.2'
}
```

#### Step 3.Using a simple method in the code
```kotlin
FuckProgress(this).light("Loading...")
FuckProgress(this).dark("Loading...")
```

## More functions and methods
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
#### If ``cancel = false``, you can call this method to close.
```kotlin
progress.dismiss()
```

##### Welcome Star, Fork, Issues!

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
