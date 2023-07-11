class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i<queries.length; i++) {
            for(int j=1; j<queries[i].length; j++) {
                int temp = arr[queries[i][j-1]];
                arr[queries[i][j-1]] = arr[queries[i][j]];
                arr[queries[i][j]] = temp;
            }
        }
        return arr;
    }
}