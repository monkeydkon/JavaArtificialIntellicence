package com.monkeydkon.cycle;

import java.util.List;

public class CycleDetection {

    public void detectCycle(List<Vertex> vertexList){

        for(Vertex v : vertexList){
            if (!v.isVisited()){
                dfs(v);
            }
        }

    }

    private void dfs(Vertex vertex) {

        System.out.println("DFA on vertex "+vertex);
        vertex.setBeingVisited(true);

        for(Vertex v : vertex.getAdjancenciesList()){

            System.out.println("visiting the neighbours of vertex "+vertex);

            if(v.isBeingVisited()){

                System.out.println("there is a cycle!!");
                return;
            }

            if(!v.isVisited()){

                System.out.println("visiting vertex "+" recirsively...");

                v.setVisited(true);
                dfs(v);
            }
        }

        System.out.println("set vertex "+vertex+" setBeingVisited(false) and setVisited(true)");
        vertex.setBeingVisited(false);
        vertex.setVisited(true);

    }
}
