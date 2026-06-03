

class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(new ArrayList<>());

        }
        for (int i = 0; i < edges.length; i++) {
            int one = edges[i][0];
            int two = edges[i][1];

            lst.get(one).add(two);
            lst.get(two).add(one);

        }
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(lst, i, visited);
                res++;

            }
        }
        return res;

    }

    public void dfs(List<List<Integer>> adj, int comp, boolean[] visited) {
        visited[comp] = true;

        for (int i : adj.get(comp)) {
            if (!visited[i]) {

                dfs(adj, i, visited);

            }
        }

    }
}
