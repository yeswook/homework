/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Nguye
 */
public class Conco extends Animal_2chi {
        public Conco(){     
    }
          public Conco(String Name) {
        super(Name);
    }

        
    public String setName(){
        return Name;
    }
    public void getName(String Name){
        this.Name = Name;
    }
    
    
    public void Keu(){
            System.out.println(this.Name + "Kêu: Con cò bé bé nó đậu cành tre");
}
}
