
public class Solution {
  public boolean validTree(int n, int[][] grid) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(i, new ArrayList<>());

    }
    for (int[] i : grid) {
      map.get(i[0]).add(i[1]);
      map.get(i[1]).add(i[0]);

    }
    boolean[] visited = new boolean[n];

    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[] { 0, -1 });
    visited[0] = true;

    while (!q.isEmpty()) {
      int[] curr = q.poll();
      int value = curr[0];
      int parent = curr[1];

      for (int neigh : map.get(value)) {
        if (!visited[neigh]) {
          q.offer(new int[] { neigh, value });

          visited[neigh] = true;

        } else if (parent != neigh)
          return false;

      }

    }
    for (boolean c : visited){
      if (!c) return false;
      
    }
    return true;

  }
}
