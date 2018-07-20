package com.jaygengi.support.retrofit;


import java.util.Map;

/**
 * 描述：网络请求response接口统一管理类
 * @author JayGengi
 * @date 2018/7/19 0019 上午 10:19
 */
public class ApiServerResponse {
    private static ApiServerResponse apiServerResponse;

    public static ApiServerResponse getInstence() {
        if (apiServerResponse == null) {
            synchronized (ApiServerResponse.class) {
                if (apiServerResponse == null)
                    apiServerResponse = new ApiServerResponse();
            }
        }
        return apiServerResponse;
    }
//    /**
//     * 房源列表
//     * */
//    public void getRentalInfo(Map<String, Object> map, RetrofitObserverA<ResponseHead<Rental>> scheduler) {
//        RetrofitFactory
//                .getInstence()
//                .API()
//                .getRentalList(map)
//                .compose(RxUtil.rxObservableSchedulerHelper())
//                .subscribe(scheduler);
//    }
}

