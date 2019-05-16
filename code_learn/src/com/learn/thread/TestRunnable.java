package com.learn.thread;

/*
优先使用借口，避免单继承的局限性
 */

public class TestRunnable implements Runnable {

    private String url;
    private  String name;

    public TestRunnable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownload wd = new WebDownload();
        wd.download(url,name);
    }

    public static void main(String[] args) {

        //创建i实现类对象
        TestRunnable td1 = new TestRunnable("https://ss1.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=77d1cd475d43fbf2da2ca023807fca1e/9825bc315c6034a8ef5250cec5134954082376c9.jpg","/home/chyao/桌面/1.jpg");
        TestRunnable td2 = new TestRunnable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557821980120&di=29ee6f98cfeac474baca7055f03474aa&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F98e3bf26812b75e5e28dc802a8ba5d0922d1e0dc3d0da-7ar9yF_fw658","/home/chyao/桌面/2.jpg");
        TestRunnable td3 = new TestRunnable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557821706539&di=3ba8370df37ed082e2c1002df02e1938&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F4610b912c8fcc3cef70d70409845d688d53f20f7.jpg","/home/chyao/桌面/3.jpg");



        //创建代理类对象
        new Thread(td1).start();
        new Thread(td2).start();
        new Thread(td3).start();
    }
}
