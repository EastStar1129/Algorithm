package eaststar1129.programers.competition.카카오2022;

import java.util.LinkedList;
import java.util.List;

public class 양과늑대 {    int max = 0;

    class Node {
        private int type;
        private List<Node> list = new LinkedList<>();

        public Node(int type) {
            this.type = type;
        }

        public void addNode(Node node) {
            list.add(node);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public boolean isSheep() {
            //0 : did 1 : smreo
            return type==0?true:false;
        }

        public List<Node> getList() {
            return this.list;
        }
    }

    public int solution(int[] info, int[][] edges) {
        Node startNode = init(info, edges);
        dfs(startNode, new LinkedList<>(), 0, 0);
        return max;
    }

    public void dfs(Node node, List<Node> path, int sheep, int wolf) {
        if(node.isSheep()) {
            ++sheep;
        }else {
            if(!node.isEmpty()) {
                ++wolf;
            }
        }

        if(sheep <= wolf) {
            if(max < sheep) {
                max = sheep;
            }
            return ;
        }

        if(sheep <= wolf ||
                (path.size() == 0 && node.getList().size() == 0)) {
            if(max < sheep) {
                max = sheep;
            }
            return ;
        }

        int size = path.size() + node.getList().size();
        for(int i=0;i<size;++i) {
            List<Node> tempPath = new LinkedList<>();
            tempPath.addAll(path);
            tempPath.addAll(node.getList());

            Node tempNode = tempPath.remove(i);
            dfs(tempNode, tempPath, sheep, wolf);
            tempPath.add(tempNode);
        }
    }

    public Node init(int[] info, int[][] edges) {
        List<Node> list = new LinkedList<>();

        for(int i=0;i<info.length;i++) {
            list.add(new Node(info[i]));
        }

        for(int i=0;i<edges.length;i++) {
            list.get(edges[i][0]).addNode(list.get(edges[i][1]));
        }
        return list.get(0);
    }
}
