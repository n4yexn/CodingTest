class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int a = 0, b = 0; // 현재 좌표 (x=a, y=b)

        // 보드에서 움직일 수 있는 최대 좌표
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;
        
        for (int i = 0; i < keyinput.length; i++) {

            // 일단 이동해 볼 좌표(후보)
            int na = a;
            int nb = b;

            if (keyinput[i].equals("up"))
                nb++;
            else if (keyinput[i].equals("down"))
                nb--;
            else if (keyinput[i].equals("left"))
                na--;
            else // "right"
                na++;

            // 후보 좌표가 보드 범위 안에 있을 때만 진짜로 이동
            if (Math.abs(na) <= maxX && Math.abs(nb) <= maxY) {
                a = na;
                b = nb;
            }
        }
        
        int[] answer = {a, b};
        return answer;
    }
}