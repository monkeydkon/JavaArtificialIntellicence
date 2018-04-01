package com.monkeydkon.cycle;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> adjancenciesList;

    public Vertex(String name) {
        this.name = name;
        this.adjancenciesList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.adjancenciesList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getAdjancenciesList() {
        return adjancenciesList;
    }

    public void setAdjancenciesList(List<Vertex> adjancenciesList) {
        this.adjancenciesList = adjancenciesList;
    }

    @Override
    public String toString() {
        return name;
    }
}
