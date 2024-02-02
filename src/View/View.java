
package View;

import Model.Doctor;
import java.util.HashMap;


public class View {
    
    public void printAll(HashMap<String, Doctor> dh){
        System.out.printf("%-8s%-10s%-20s%-15s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor i : dh.values()) {
        System.out.println(i);
        }
    }
    
    public void print (HashMap<String, Doctor> dh, String key){
        System.out.printf("%-8s%-10s%-20s%-15s\n", "Code", "Name", "Specialization", "Availability");
        Doctor dp = dh.get(key);
        System.out.println(dp);
    }
}
