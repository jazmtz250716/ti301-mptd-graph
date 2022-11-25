/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MTPD_EyOD;

/**
 *
 * @author Diana
 */
public class Graph {

    private final int NUM_VERTEX_MAX = 100;
    private int[] vertex;
    private int numVertex;
    private int[][] edge;
    private int numEdge;

    public Graph() {
        init();
    }

    public Graph(int numVertex) {
        init();
    }

    private void init() {
        vertex = new int[NUM_VERTEX_MAX];
        edge = new int[NUM_VERTEX_MAX][2];
    }

    public void setVertex(int numVertex) {
        for (int i = 0; i < numVertex; i++) {
            this.vertex[i] = i;
        }
        this.numVertex = numVertex;
    }

    /*public void setEdge(int i;int j){
        edge[numEdge] = i;
        edge 
    }*/

    @Override
    public String toString() {
        String out = "Graph ---------------\n";

        out += "vertices : [";

        for (int i = 0; i < numVertex; i++) {
            //out += i + ","(i == numVertex-1?);
        }

        out += "] \n";

        for (int i = 0; i < numEdge; i++) {
            out += " (" + edge  [i][0] + "," + edge [i][1] + "), ";
        }
        
        out += "]\n"; 
        return out;
    }

}
