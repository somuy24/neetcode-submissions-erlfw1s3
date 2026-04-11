class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[][] rows = new char[10][10];
        char[][] cols = new char[10][10];

        for(int i=0;i<9;i++) {
            Arrays.fill(rows[i],'0');
            Arrays.fill(cols[i],'0');
        }
        
        // System.out.println(rows[0][0]);
        // System.out.println((int)board[0][0]);

        List<Character>[][] boxes = new ArrayList[3][3];

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.println(board[0][0]);
                System.out.println(boxes[0][0]);
                
                if(board[i][j] == '.') {
                    continue;
                } else if(rows[i][board[i][j]-'0'] != '0' || cols[j][board[i][j]-'0'] != '0' || (boxes[i/3][j/3] != null && boxes[i/3][j/3].contains(board[i][j]))) {
                    return false;
                } else {
                    rows[i][board[i][j]-'0'] = 'f';
                    cols[j][board[i][j]-'0'] = 'f';
                    if(boxes[i/3][j/3] != null){
                        boxes[i/3][j/3].add(board[i][j]);
                    } else {
                        boxes[i/3][j/3] = new ArrayList<>();
                        boxes[i/3][j/3].add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
