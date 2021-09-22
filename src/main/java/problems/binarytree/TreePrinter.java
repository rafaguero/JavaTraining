package problems.binarytree;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/*
Objective:
Write Java function, printTree(), which prints a given tree to stdout. Details:
- the argument of the print tree is a stream of relations: pairs of parent -> child relationships.
- each string found anywhere in the input represents a unique node.
- Each parent can have many children
- The inputlist may contain Relations in any order, although:
- The order in which the pair appears in the input list determines the node'order with respect to its siblings.
Example input:
List<Relation> input = new ArrayList();
input.add(new Relation("animal","mammal"));
input.add(new Relation("animal","bird"));
input.add(new Relation("lifeform","animal"));
input.add(new Relation("cat","lion"));
input.add(new Relation("mammal","cat"));
input.add(new Relation("animal","fish"));
TreePrinter.printTree(input);
Expected Output:
lifeform
    animal
        mammal
            cat
                lion
            bird
            fish
 */
public class TreePrinter {
    List<Relation> input = new ArrayList<>();
    class Relation{
        String parent;
        String child;

        Relation(String parent, String child){
            this.parent = parent;
            this.child = child;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getChild() {
            return child;
        }

        public void setChild(String child) {
            this.child = child;
        }
    }
    public List<Relation> buildTree(){
        input.add(new Relation("animal","mammal"));
        input.add(new Relation("animal","bird"));
        input.add(new Relation("lifeform","animal"));
        input.add(new Relation("cat","lion"));
        input.add(new Relation("mammal","cat"));
        input.add(new Relation("animal","fish"));
        return input;
    }
    public void printTree(List<Relation> input){
        Map<String,List<String>> parentChildMap = new HashMap<>();
        Set<String> childs = new HashSet<>();
        for (Relation relation : input){
            if (parentChildMap.containsKey(relation.getParent())){
                parentChildMap.get(relation.getParent()).add(relation.getChild());
            }else {
                List<String> childList = new ArrayList<>();
                childList.add(relation.getChild());
                childs.add(relation.getChild());
                parentChildMap.put(relation.getParent(),childList);
            }
        }
        String root = null;
        Set<String> keys = parentChildMap.keySet();
        Iterator<String> keysIter = keys.iterator();
        while (keysIter.hasNext()){
            String key = keysIter.next();
            if (!childs.contains(key)){
                root = key;

                break;
            }
        }
        System.out.println("root has " + root);
        parentChildMap.forEach((x,y) -> System.out.println(x + " " + y));
        dfs(root,0,parentChildMap);
    }

    public void dfs(String root, int level, Map<String,List<String>> parentChildMap){
        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println(root);
        List<String> children;
        if (parentChildMap.containsKey(root)){
            children = parentChildMap.get(root);
        }else {
            return;
        }
        for(String child : children){
            dfs(child,level +1, parentChildMap);
        }
    }
    public static void main(String[] args) {

        TreePrinter treePrinter = new TreePrinter();
        List<Relation> input = treePrinter.buildTree();
        treePrinter.printTree(input);

    }
}
