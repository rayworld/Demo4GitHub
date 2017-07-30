# Demo4GitHub
# 这是一个android studio项目的测试
# HttpUtils 是对OkHttp的封装
用法：
/*
 * Get请求 
 * 参数一：请求Url
 * 参数二：请求回调
 */
HttpUtils.doGet("https://www.so.com/", new Callback() {
    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        if(response.isSuccessful()){
            tv.setText(response.body().string());
        }
        //关闭防止内存泄漏
        if(response.body()!=null){
            response.body().close();
        }
    }
});

Post发送键值对演示

/*
 * Post请求 
 * 参数一：请求Url
 * 参数二：请求的键值对
 * 参数三：请求回调
 */
Map<String,String> map = new HashMap<>();
map.put("username","Hensen");
map.put("password","123456");

HttpUtils.doPost("http://192.168.31.109:8080/test.php", map, new Callback() {
    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {

    }
});

Post发送JSON数据演示

/*
 * Post请求 
 * 参数一：请求Url
 * 参数二：请求的JSON
 * 参数三：请求回调
 */
String json = "{\"name\":\"Hensen\"}";

HttpUtils.doPost("http://192.168.0.8:8080/test.php", json, new Callback() {
    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {

    }
});
上传文件演示

/*
 * 上传文件
 * 参数一：请求Url
 * 参数二：保存文件的路径名
 * 参数三：保存文件的文件名
 * 参数四：请求回调
 */
HttpUtils.doFile("http://192.168.0.8:8080/WD/admin.php?a=ajaxuploadimage&&c=Image",
                "/data/data/com.handsome.app4/logoa.jpg", "logoa.jpg", new Callback() {
    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {

    }
});
下载文件演示

/*
 * 下载文件
 * 参数一：请求Url
 * 参数二：保存文件的路径名
 * 参数三：保存文件的文件名
 */
HttpUtils.downFile("http://shouji.360tpcdn.com/160804/a05b75b7779f7a4afae83601c195ed2b" +
                "/com.qihoo.haosou_708.apk"
                ,"/data/data/com.handsome.app4/","aqy.apk");
