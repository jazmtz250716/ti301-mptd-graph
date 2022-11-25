/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import MTPD_EyOD.Graph;

/**
 *
 * @author Diana
 */
public class GraphTest {

    public static void main(String... args) {
        Graph defaultGraph = new Graph();
        System.out.println(defaultGraph.toString());

        defaultGraph.setVertex(3);
        System.out.println(defaultGraph.toString());
        
        

    }

}
