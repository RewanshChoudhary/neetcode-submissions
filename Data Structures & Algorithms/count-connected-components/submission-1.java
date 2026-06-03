
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
        bfs(lst, i, visited);
        res++;

      }
    }
    return res;

  }

  public void bfs(List<List<Integer>> adj, int num, boolean[] visited) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(num);
    visited[num]=true;
  while (!q.isEmpty()){
      int val=q.poll();

    for (int neigh : adj.get(val)){
      if (!visited[neigh]){
        q.offer(neigh);

        visited[neigh]=true;

      }
    }
  }}
}
