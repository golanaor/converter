package converter;
import okhttp3.Response;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter from currency");
        String from = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter to currency");
        String to = input2.nextLine();

        //String url ="https://currency-exchange.p.rapidapi.com/exchange?q=1.0&from="+from+"&to="+to;
        String url = "https://golda-go.herokuapp.com/get/branch" ;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                 .url(url)
                 .get()
                 .build();
                /*.url(url)
                .get()
                .addHeader("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "671674ff94msha586be03790d216p199e38jsn2b227d6bfdab")
                .build();*/

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            System.out.println(response.body().string());
        } catch (Exception e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
        }

    }


}
