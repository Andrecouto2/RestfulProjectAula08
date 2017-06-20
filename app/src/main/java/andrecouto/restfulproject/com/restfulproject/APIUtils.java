package andrecouto.restfulproject.com.restfulproject;


import retrofit2.Retrofit;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.40:3000";

    public static CarroApi getCarroApiService() {
        return RetrofitClient.getClient(BASE_URL).create(CarroApi.class);
    }
}
