# FuckProgress
#### A highly customized loading box, use kotlin in android library

##  Screenshot
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-00-44-278_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-05-840_cn.xyiio.fuck.png)
![](https://github.com/Turaiiao/FuckProgress/blob/master/screenshot/Screenshot_2018-06-16-12-01-23-680_cn.xyiio.fuck.png)

## How to use it
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
    implementation 'com.github.Turaiiao:FuckProgress:0.0.1'
}
```

#### Step 3.Using a simple method in the code
```kotlin
FuckProgress(this).light("Loading...")
FuckProgress(this).dark("Loading...")
```

## More functions and methods
