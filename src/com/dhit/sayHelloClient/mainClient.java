/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.sayHelloClient;

import javax.swing.SwingUtilities;

/**
 *
 * @author Radhitee
 */
public class mainClient {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Client client = new Client();
                client.setVisible(true);
            }
        });
    }
}
