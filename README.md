Step 1 : **add in build**
Add it in your root build.gradle at the end of repositories:

repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}

Step 2. Add the dependency
dependencies {
	        implementation 'com.github.prabhatKumarBiswal:MyToastProject:1.0.0'
	}
