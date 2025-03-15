class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0){
            return result;
        }

        List<Integer> newList = new ArrayList<>(Arrays.asList(1));
        result.add(newList);

        if(numRows == 1){
            return result;
        }
        

        for(int i = 1; i < numRows; i++ ){
            List<Integer> rowList = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i ){
                    rowList.add(1);
                }else{
                    int sum = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    rowList.add(sum);
                }
            }

            result.add(rowList);
        }

        return result;
    }
}