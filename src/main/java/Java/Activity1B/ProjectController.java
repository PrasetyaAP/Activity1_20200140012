/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Activity1B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */

@Controller


public class ProjectController {
    
    @RequestMapping("/dataktp")
    public String getTable(Model Data){
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(Arrays.asList("01","00912","Agung","Wonosobo"));
        data.add(Arrays.asList("02","00913","Setya","Pekalongan"));
        data.add(Arrays.asList("03","00915","Iqbal","Bali"));
        data.add(Arrays.asList("04","00916","Atha","Samarinda"));
        data.add(Arrays.asList("05","00918","Yoga","Semarang"));
        data.add(Arrays.asList("06","00919","Erik","Batam"));
        data.add(Arrays.asList("07","00910","Nofal","Aceh"));
        data.add(Arrays.asList("08","00911","Asra","Jambi"));
        data.add(Arrays.asList("09","00927","Indra","Samarinda"));
        data.add(Arrays.asList("10","00945","Kasro","Pacitan"));
        data.add(Arrays.asList("11","00957","Bagas","Temanggung"));
        data.add(Arrays.asList("12","00963","Kaka","Yogyakarta"));
        data.add(Arrays.asList("13","00924","Tanjung","Palembang"));
        data.add(Arrays.asList("14","00925","Gopal","Surabaya"));
        data.add(Arrays.asList("15","00926","Maya","Cilacap"));
        data.add(Arrays.asList("16","00928","Aji","Ponorogo"));
        data.add(Arrays.asList("17","00959","Dimas","Pemalang"));
        data.add(Arrays.asList("18","00998","Dika","Solo"));
        data.add(Arrays.asList("19","00932","Tejo","Madura"));
        data.add(Arrays.asList("20","00977","Inu","Tangerang"));
        
        Data.addAttribute("table", data);
        return "tableview";
    }
    
}
