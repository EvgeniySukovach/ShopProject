package Main;


import Services.CmdLineService;
import Services.impl.ClientServiceImpl;
import Services.impl.ProductServiceImpl;
import java.io.IOException;

public class Main {
    public static void main (String [] args) throws IOException {

        CmdLineService cmdLineService = new CmdLineService(new ClientServiceImpl(), new ProductServiceImpl()) ;
        cmdLineService.mainMenu();



    }
}
