/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author risha
 */
public class Business {
    
     MasterOrderList masterorderList;
    SupplierDirectory supplierdirectory;

    public Business() {
        masterorderList= new MasterOrderList();
        supplierdirectory= new SupplierDirectory();
    }

    public MasterOrderList getMasterorderList() {
        return masterorderList;
    }

    public void setMasterorderList(MasterOrderList masterorderList) {
        this.masterorderList = masterorderList;
    }

    public SupplierDirectory getSupplierdirectory() {
        return supplierdirectory;
    }

    public void setSupplierdirectory(SupplierDirectory supplierdirectory) {
        this.supplierdirectory = supplierdirectory;
    }
    
    
    
}
