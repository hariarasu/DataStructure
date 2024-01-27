//Sub class

import java.util.ArrayList;
import java.util.List;

class Graph {
   private int numVertices;
   //collections in java
   //using wrapper class as for int 
   private List<List<Integer> >AdjacencyList;
   //constructor for graph
   public Graph(int numVertices){
        this.numVertices=numVertices;
        this.AdjacencyList=new ArrayList<>(numVertices);

        //Loop for no.of vertex
        for(int i=0;i<numVertices;i++){
            this.AdjacencyList.add(new ArrayList<>(numVertices));
        }   
    } 
        public void addEdges(int source,int destination){
        //Undirected gragh
        this.AdjacencyList.get(source).add(destination);
        this.AdjacencyList.get(destination).add(source);
        
    }
        //Method for graphvalue
        public void GraphPrint(){
            System.out.println("Graph: ");
            for(int i=0;i<numVertices;i++){
                System.out.println("Vertex:"+i+"->");
                // foreach loop for encapsulation
                for(Integer near:AdjacencyList.get(i)){
                System.out.println(near +" ");
            }
            System.out.println();
        }
    }
}

//Main class
public class ListArray{
    public static void main (String arr[]){
        //object subclass Graph
        Graph grp=new Graph(5);
        //Adding the edges
        grp.addEdges(1,3);
        grp.addEdges(0,2);
        grp.addEdges(1,4);
        grp.addEdges(0,4);
        grp.addEdges(2,3);
        //Invoking the graph method

        grp.GraphPrint();
    }
}


