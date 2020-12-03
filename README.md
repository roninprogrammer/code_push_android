# Android Code Push / Auto Update 

The library project implements software version check, apk file download, software installation (Android app update checker, download and install apk), supports API 14+


## Add it in your root build.gradle at the end of reposities 
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

## Add the dependency
```
dependencies {
	        implementation 'com.github.roninprogrammer:code_push_android:1.0.0'
	}
```

## Import library project 

i have provides 2 ways to check the version , just add the following codes to your project 


* Dialog 

```
UpdateChecker.checkForDialog(this);

```


* Notification 

```

UpdateChecker.checkForDialog(this);

```
