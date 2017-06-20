package andrecouto.restfulproject.com.restfulproject;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CarroApi {

    @POST("/carros")
    Call<Void> salvar(@Body Carro carro);

    @GET("/carros")
    Call<List<Carro>> listarTodos();
}
