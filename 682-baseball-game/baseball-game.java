class Solution {
    public int calPoints(String[] operations) {
        List<Integer> score = new ArrayList<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int n = score.size();
                int newScore = score.get(n-1) + score.get(n-2);
                score.add(newScore);
            }else if(operations[i].equals("D")){
                int n = score.size();
                int newScore = 2 * score.get(n-1);
                score.add(newScore);
            }else if(operations[i].equals("C")){
                score.remove(score.size()-1);
            }else{
                score.add(Integer.parseInt(operations[i]));
            }
        }
        int total = 0;
        for(int s : score){
            total+=s;
        }
        return total;

    }
}