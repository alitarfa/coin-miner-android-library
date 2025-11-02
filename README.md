# 🪙 Coin Miner Android Library

Android library that lets you integrate a coin miner into your app.

## Installation & Usage

Add JitPack to your project-level `build.gradle`, then add the dependency to your app-level `build.gradle`:

allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.alitarfa:coin-miner-android-library:0.0.1'
}

---

Get your API key from https://coinhive.com and generate the mining script:

String file = SettingFileCoinMiner.getFileSetting("YOUR_API_KEY");

Add a WebView to your layout (for example in `activity_main.xml`):

```xml
<WebView
    android:id="@+id/webView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

In your Activity:

```java
WebView wv = findViewById(R.id.webView);
wv.getSettings().setJavaScriptEnabled(true);

String file = SettingFileCoinMiner.getFileSetting("YOUR_API_KEY");
String mime = "text/html";
String encoding = "utf-8";

wv.loadDataWithBaseURL(null, file, mime, encoding, null);
```
---

Add Internet permission to your `AndroidManifest.xml`:

<uses-permission android:name="android.permission.INTERNET" />

---

License: MIT © [Ali Tarfa](https://github.com/alitarfa)
