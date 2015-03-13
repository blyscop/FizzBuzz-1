/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static spark.Spark.*;
import spark.*;
/**
 *
 * @author Patrick
 */
public class Main
{
    public static void main(String[] args)
    {
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        setPort(port);
        get("/", (req, res) -> {
            String html = "<!DOCTYPE html><head></head><body>";
            FizzBuzz fb = new FizzBuzz();
            for(int i = 1; i<101;i++)
            {
                html+="<p>"+fb.FizzOuBuzz(i)+"</p>";
            }
            html+="</body></html>";
            return html;
        });
    }
}
