class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> arr = new ArrayList<>();

        if(numRows == 1){
            return s;
        }

        for(int i = 0; i < numRows; i++){
            List<Character> row = new ArrayList<>();

            arr.add(row);
        }

        int rowIndex = 0;
        int direction = 1;
        for(int i = 0; i < s.length(); i++){
            arr.get(rowIndex).add(s.charAt(i));

            if(direction == 1){
                if(rowIndex == numRows - 1){
                    direction = -1;
                }
            }else{
                if(rowIndex == 0){
                    direction = 1;
                }
            }

            rowIndex += direction;
            
        }

        StringBuilder answer = new StringBuilder("");

        for(int i = 0; i< arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                answer.append(arr.get(i).get(j));
            }
        }

        return answer.toString();
    }
}