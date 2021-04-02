package com.perez.java.diffproblems;

import java.util.ArrayList;
import java.util.List;

public class Block {
    List<Building> buildings;
    int blockId;

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public int getTotDistance() {
        return totDistance;
    }

    public void setTotDistance(int totDistance) {
        this.totDistance = totDistance;
    }

    int totDistance;

    public Block() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building b) {
        buildings.add(b);
    }

    public List<Building> getBuildings(){
        return buildings;
    }

    @Override
    public String toString() {
        return "Block{" +
                "buildings=" + buildings +
                ", blockId=" + blockId +
                ", totDistance=" + totDistance +
                '}';
    }
}
