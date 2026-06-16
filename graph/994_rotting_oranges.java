// ============================================================
// Problem    : 994. Rotting Oranges
// Difficulty : Medium
// URL        : https://leetcode.com/problems/rotting-oranges/
// Language   : Java
// Date       : 2026-06-16
// ============================================================
class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int mins = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int j = 0; j < 4; j++) {

                    int nr = r + dr[j];
                    int nc = c + dc[j];

                    if(nr >= 0 && nc >= 0 &&
                       nr < n && nc < m &&
                       grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        q.add(new int[]{nr, nc});
                    }
                }
            }

            mins++;
        }

        return fresh == 0 ? mins : -1;
    }
}