package com.dhit.contohRMI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.dhit.contohRMI.DataInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Radhitee
 */
public class client {
    public static void main(String[] args)throws RemoteException, NotBoundException,MalformedURLException {
        DataInterface dataInterface=(DataInterface)Naming.lookup("rmi://localhost:2527/data");
        System.out.println("Client berhasil terkoneksi keserver");
        dataInterface.metode1();
        dataInterface.metode2();
        System.out.println("Client telah selesai");
    }
}
