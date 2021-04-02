package com.perez.java.diffproblems;

import java.util.ArrayList;
import java.util.List;

public class BlocksMain {

    public static void main(String[] args) {
        Building gym = new Building("gym");
        Building school = new Building("school");
        Building store = new Building("store");

        Block block1 = new Block();
        block1.addBuilding(school);
        block1.setBlockId(0);
        Block block2 = new Block();
        block2.setBlockId(1);
        block2.addBuilding(gym);
        Block block3 = new Block();
        block3.setBlockId(2);
        block3.addBuilding(gym);
        block3.addBuilding(school);
        Block block4 = new Block();
        block4.setBlockId(3);
        block4.addBuilding(school);
        Block block5 = new Block();
        block5.setBlockId(4);
        block5.addBuilding(school);
        block5.addBuilding(store);

        List<Block> blocks = new ArrayList<>();
        blocks.add(block1);
        blocks.add(block2);
        blocks.add(block3);
        blocks.add(block4);
        blocks.add(block5);
        List<String> requiredBuildings = new ArrayList<>();
        requiredBuildings.add("gym");
        requiredBuildings.add("school");
        requiredBuildings.add("store");
        BlocksMain blocksMain = new BlocksMain();
        Block selectedBlock = blocksMain.calculateBlockDistance(blocks, requiredBuildings);
        System.out.println("the selected block is " + selectedBlock.toString());
    }

    private Block calculateBlockDistance(List<Block> blocks, List<String> requiredBuildings) {
        int distance = 0;
        int previousDistance = 0;
        Block selectedBlock = null;
        for (int i = 0; i < blocks.size(); i++) {
            Block blockI = blocks.get(i);
            distance = getDistanceForAllBuildings(blockI, i, blocks, requiredBuildings);
            System.out.println("distance is " + distance);
            blockI.setTotDistance(distance);
            if (previousDistance == 0) {
                selectedBlock = blockI;
                previousDistance = distance;
            } else if (distance < previousDistance) {
                selectedBlock = blockI;
            }

        }
        return selectedBlock;
    }

    private int getDistanceForAllBuildings(Block blockI, int blockIndex, List<Block> blocks, List<String> requiredBuildings) {
        int totDistance = 0;
        for (String building : requiredBuildings) {            int buildingDistance = getBuildingDistance(building, blockI, blockIndex, blocks);
            if (buildingDistance != -1) {
                totDistance = totDistance + buildingDistance;

            }
        }
        return totDistance;
    }

    private int getBuildingDistance(String building, Block currentBlock, int blockIndex, List<Block> allBlocks) {


        if (buildingContains(building, currentBlock)) {
            return 0;

        } else {
            if (blockIndex == 0) {
                for (int i = 1; i < allBlocks.size(); i++) {
                    if (buildingContains(building,allBlocks.get(i))) {
                        return i;
                    }
                }
            } else {
                int backwardDistance = 0;
                int blockCounter = 0;
                for (int i = blockIndex - 1; i > 0; i--) {

                    if (buildingContains(building,allBlocks.get(i))) {
                        backwardDistance = ++blockCounter;
                    } else {
                        blockCounter++;
                    }
                }
                if (blockIndex == allBlocks.size()) {
                    if (backwardDistance != 0) {

                        return backwardDistance;
                    } else {
                        return -1;
                    }
                }
                int forwardDistance = 0;
                blockCounter = 0;
                for (int i = blockIndex + 1; i < allBlocks.size(); i++) {
                    if (buildingContains(building,allBlocks.get(i))) {
                        forwardDistance = ++blockCounter;
                    } else {
                        blockCounter++;
                    }
                }
                if (backwardDistance == 0 && forwardDistance == 0) {
                    return -1;
                } else if (backwardDistance != 0 & forwardDistance != 0) {
                    return Math.min(backwardDistance, forwardDistance);
                } else if (backwardDistance != 0 & forwardDistance == 0) {
                    return backwardDistance;
                } else return forwardDistance;

            }
        }
        return -1;

    }

    boolean buildingContains(String buildingName, Block block) {

        List<Building> buildingList = block.getBuildings();
        for (Building building1 : buildingList) {
            if (building1.getName().equals(buildingName)) {
                return true;
            }
        }
        return false;
    }

}
