package com.learn.thread;

import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownload wd = new WebDownload();
        wd.download(url,name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        TestCallable td1 = new TestCallable("https://ss1.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=77d1cd475d43fbf2da2ca023807fca1e/9825bc315c6034a8ef5250cec5134954082376c9.jpg","/home/chyao/桌面/1.jpg");

        TestCallable td2 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557821980120&di=29ee6f98cfeac474baca7055f03474aa&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F98e3bf26812b75e5e28dc802a8ba5d0922d1e0dc3d0da-7ar9yF_fw658","/home/chyao/桌面/2.jpg");

        TestCallable td3 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557821706539&di=3ba8370df37ed082e2c1002df02e1938&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F4610b912c8fcc3cef70d70409845d688d53f20f7.jpg","/home/chyao/桌面/3.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //执行提交
        Future<Boolean> result1 = ser.submit(td1);
        Future<Boolean> result2 = ser.submit(td2);
        Future<Boolean> result3 = ser.submit(td3);
        //获取结果
        boolean r1 =result1.get();
        boolean r2 =result2.get();
        boolean r3 =result3.get();

        ser.shutdownNow();
    }
}
