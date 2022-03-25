import NewPackage.HelloSeleniumMaven;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CasesTest {
    String password= "secret_sauce";

    @Test
    void test1(){
        HelloSeleniumMaven auto= new HelloSeleniumMaven();
        String userName1= "standard_user";
        List<String> lst= new ArrayList<>();
        lst.add(userName1);
        lst.add(password);
        auto.automate(lst);

    }

    @Test
    void Test2() {
        HelloSeleniumMaven auto = new HelloSeleniumMaven();
        String userName2= "locked_out_user";
        List<String> lst= new ArrayList<>();
        lst.add(userName2);
        lst.add(password);
        auto.automate(lst);

    }

    @Test
    void Test3(){
        HelloSeleniumMaven auto = new HelloSeleniumMaven();
        String userName3= "problem_user";
        List<String> lst= new ArrayList<>();
        lst.add(userName3);
        lst.add(password);
        auto.automate(lst);
    }

    @Test
    void Test4(){
        HelloSeleniumMaven auto = new HelloSeleniumMaven();
        String userName4= "performance_glitch_user";
        List<String> lst= new ArrayList<>();
        lst.add(userName4);
        lst.add(password);
        auto.automate(lst);
    }

}

