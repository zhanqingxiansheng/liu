package com.liuwork.framework.util.http;

import org.apache.http.client.methods.HttpGet;

/**
 * @ClassName HttpClientUtil
 * @Author liuzhihao
 * @Description
 * @Date 2021/5/10 11:50
 * @Version 1.0.0
 */

public class HttpClientUtil {
    /**
     * 带参数的get请求
     * @param url
     * @param param
     * @return String
     */
  /**  public static String doGet(String url,Map<String,String> param){
        //创建HTTPClient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String resultString = "";
        CloseableHttpResponse response = null;
        try{
            //创建URL
            URIBuilder builder = new URIBuilder(url);
            if (param != null){
                for (String key : param.keySet()){
                    builder.addParameter(key,param.get(key));
                }
            }
            URI uri = builder.build();
            //创建HTTP get请求
            HttpGet httpGet = new HttpGet(uri);
            //执行请求
            response = httpclient.execute(httpGet);
            //判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200){
                resultString = EntityUtils.toString(response.getEntity(),"UTF-8");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (response != null){
                    response.close();
                }
                httpclient.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return resultString;
    }
   */
}
