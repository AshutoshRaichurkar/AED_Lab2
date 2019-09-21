/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author Raichurkar
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignHistory;
    {
    vitalSignHistory = new ArrayList<VitalSign>();
    }
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> VitalSignHistory) {
        this.vitalSignHistory = VitalSignHistory;
    }
    public VitalSign addVitals()
    {
    
    VitalSign vs = new VitalSign();
    vitalSignHistory.add(vs);
    return vs;
    
    }
    public void deleteVitals(VitalSign v)
    {
        vitalSignHistory.remove(v);
    }
    
}
